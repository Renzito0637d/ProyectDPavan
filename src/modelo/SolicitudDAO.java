package modelo;

import com.mysql.cj.jdbc.CallableStatement;
import modelo.MiConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import modelo.Evaluacion;
import modelo.Solicitud;

public class SolicitudDAO implements ISolicitudDAO{
    MiConexion conectar = MiConexion.getInstance();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    CompraDAO compraDAO;
    EncuestaDAO encuestaDAO;
    DepartamentoDAO departamentoDAO;
    EvaluacionDAO evaluacionDAO;
    DateTimeFormatter fmtSQL = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    // Create
    @Override
    public int agregar(Solicitud bean, int codigoCliente) {
    String sql = "{CALL agregarSolicitud(?, ?, ?, ?, ?, ?)}";

    try {
        // Conectar a la base de datos
        con = conectar.obtenerConexion();

        // Preparar el CallableStatement
        CallableStatement cs = (CallableStatement)con.prepareCall(sql);

        // Establecer los parámetros de entrada
        cs.setString(1, bean.getTipoSolicitud());
        cs.setString(2, bean.getFechaIngreso().format(fmtSQL));
        cs.setInt(3, bean.getEstadoActual());
        cs.setInt(4, codigoCliente);
        cs.setInt(5, 1); // Código de departamento por defecto

        // Registrar el parámetro de salida
        cs.registerOutParameter(6, java.sql.Types.INTEGER);

        // Ejecutar el procedimiento almacenado
        cs.execute();

        // Obtener el ID generado para la solicitud
        int idSolicitud = cs.getInt(6);

        // Validar que se haya generado el ID
        if (idSolicitud > 0) {
            // Insertar en la tabla Motivo
            agregarMotivo(bean, idSolicitud);

            // Insertar en la tabla CompraReclamada
            compraDAO = new CompraDAO();
            compraDAO.agregar(bean.getCompra(), idSolicitud);

            // Insertar en la tabla Encuesta
            Encuesta encuesta = new Encuesta();
            encuesta.setFechaHoraLlenado(null); // Fecha vacía
            encuesta.setEstado(Encuesta.INACTIVA); // Estado inicial
            encuesta.setRespuesta1(1);
            encuesta.setRespuesta2(1);
            encuesta.setRespuesta3(1);
            encuestaDAO = new EncuestaDAO();
            encuestaDAO.agregar(encuesta, idSolicitud);

            // Insertar en la tabla Evaluación
            Evaluacion eval = new Evaluacion();
            eval.setFechaHoraActual(); // Fecha actual
            eval.setEstado(Evaluacion.EN_ESPERA); // Estado inicial
            eval.setDescripcion("Enviado por el cliente");
            eval.setEmpleado(null); // Sin empleado asignado
            evaluacionDAO = new EvaluacionDAO();
            evaluacionDAO.agregar(eval, idSolicitud);
        }

        // Retornar el ID de la solicitud generada
        return idSolicitud;
    } catch (SQLException e) {
        System.err.println(e.getMessage());
        return e.getErrorCode(); // Retornar el código de error en caso de fallo
    }
}




    
    public int agregarMotivo(Solicitud bean, int idSolicitud) {
        String sqlM = "{CALL agregarMotivo(?,?,?)}";
        
        try {
            // Conectar
            con = conectar.obtenerConexion();
            // Convierte el objeto en una sentencia SQL de insert            
            ps = con.prepareStatement(sqlM);
            ps.setString(1, bean.getCategoriaMotivo());
            ps.setString(2, bean.getDescripcion());
            ps.setInt(3, idSolicitud);
            
            // Ejecuta el insert y devuelve el número de filas alteradas (debería ser 1) 
            return ps.executeUpdate(); // 1
        }
        catch (SQLException e) {
            // El codigo de error 1062 indica duplicidad de llave única (id_solicitud)
            return e.getErrorCode();
        }        
    }
    
    // Update
    public int actualizar(Solicitud bean) {
        String sql = "{CALL actualizarSolicitud(?,?,?)}";
        
        try {
            // Conectar
            con = conectar.obtenerConexion();
            // Convierte el objeto en una sentencia SQL de update
            ps = con.prepareStatement(sql);            
            ps.setInt(1, bean.getEstadoActual());
            ps.setInt(2, bean.getDepartamentoEvaluador().getCodigoDepartamento());
            ps.setInt(3, bean.getIdSolicitud());

            // Ejecuta el update y devuelve el número de filas alteradas (debería ser 1) 
            return ps.executeUpdate(); // 1
        }
        catch (SQLException e) {
            return -1;
        }
    }
    
    // Delete
    public void eliminar(int id) {
        String sql = "{CALL eliminarSolicitud(?)}";
        
        try {
            // Conectar
            con = conectar.obtenerConexion();
            // Forma la sentencia delete con la PK brindada
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            // Ejecuta el delete
            ps.executeUpdate();
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    // Reads
    public List listarTodos() {
        List<Solicitud> lista = new ArrayList<>();
        String sql = "{CALL listarTodasSolicitudes()}";
        
        try {
            // Conecta y prepara la consulta
            con = conectar.obtenerConexion();
            ps = con.prepareStatement(sql);
            // Ejecuta la consulta
            rs = ps.executeQuery();
            compraDAO = new CompraDAO();
            departamentoDAO = new DepartamentoDAO();
            while (rs.next()) { 
                // Convierte el resultado de la consulta en un objeto
                Solicitud bean = new Solicitud();
                bean.setIdSolicitud(rs.getInt(1));
                bean.setTipoSolicitud(rs.getString(2));
                bean.setFechaIngreso(LocalDate.parse(rs.getString(3), fmtSQL));
                bean.setEstadoActual(rs.getInt(4));
                bean.setCategoriaMotivo(rs.getString(8));
                bean.setDescripcion(rs.getString(9));                
                // Recuperar CompraReclamada
                bean.setCompra(compraDAO.buscarPorSolicitud(bean.getIdSolicitud()));
                // Recuperar DepartamentoEvaluador
                int codigoDepartamento = rs.getInt(5);
                bean.setDepartamentoEvaluador(departamentoDAO.buscarPorCodigo(codigoDepartamento));
                // Agrega el objeto formado a la lista
                lista.add(bean);
            }
            con.close();
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return lista;
    }
    
    @Override
    public List listarPorCliente(int codigoCliente) {
        List<Solicitud> lista = new ArrayList<>();
        String sql = "{CALL listarSolicitudesPorCliente(?)}";
        
        try {
            // Conecta y prepara la consulta
            con = conectar.obtenerConexion();
            ps = con.prepareCall(sql);
            ps.setInt(1, codigoCliente);
            // Ejecuta la consulta
            rs = ps.executeQuery();
            compraDAO = new CompraDAO();
            departamentoDAO = new DepartamentoDAO();
            while (rs.next()) { 
                // Convierte el resultado de la consulta en un objeto
                Solicitud bean = new Solicitud();
                bean.setIdSolicitud(rs.getInt(1));
                bean.setTipoSolicitud(rs.getString(2));
                bean.setFechaIngreso(LocalDate.parse(rs.getString(3), fmtSQL));
                bean.setEstadoActual(rs.getInt(4));
                bean.setCategoriaMotivo(rs.getString(7));
                bean.setDescripcion(rs.getString(8));                
                // Recuperar CompraReclamada
                bean.setCompra(compraDAO.buscarPorSolicitud(bean.getIdSolicitud()));
                // Recuperar DepartamentoEvaluador
                int codigoDepartamento = rs.getInt(6);
                bean.setDepartamentoEvaluador(departamentoDAO.buscarPorCodigo(codigoDepartamento));
                // Agrega el objeto formado a la lista
                lista.add(bean);
            }
            con.close();
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }        
        return lista;
    }
    
    public List listarPorDepartamento(int codigoDepartamento) {
        List<Solicitud> lista = new ArrayList<>();
        String sql = "{CALL listarSolicitudesPorDepartamento(?)}";
        
        try {
            // Conecta y prepara la consulta
            con = conectar.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigoDepartamento);
            // Ejecuta la consulta
            rs = ps.executeQuery();
            compraDAO = new CompraDAO();
            departamentoDAO = new DepartamentoDAO();
            while (rs.next()) { 
                // Convierte el resultado de la consulta en un objeto
                Solicitud bean = new Solicitud();
                bean.setIdSolicitud(rs.getInt(1));
                bean.setTipoSolicitud(rs.getString(2));
                bean.setFechaIngreso(LocalDate.parse(rs.getString(3), fmtSQL));
                bean.setEstadoActual(rs.getInt(4));
                bean.setCategoriaMotivo(rs.getString(7));
                bean.setDescripcion(rs.getString(8));                
                // Recuperar CompraReclamada
                bean.setCompra(compraDAO.buscarPorSolicitud(bean.getIdSolicitud()));
                // Recuperar DepartamentoEvaluador
                codigoDepartamento = rs.getInt(6);
                bean.setDepartamentoEvaluador(departamentoDAO.buscarPorCodigo(codigoDepartamento));
                // Agrega el objeto formado a la lista
                lista.add(bean);
            }
            con.close();
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }        
        return lista;
    }
    
    public List listarPorFecha(LocalDate fechaInicio, LocalDate fechaFin) {
        List<Solicitud> lista = new ArrayList<>();
        String sql = "{CALL listarSolicitudesPorFecha(?, ?)}";        
        try {
            // Conecta y prepara la consulta
            con = conectar.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaInicio.format(fmtSQL));
            ps.setString(2, fechaFin.format(fmtSQL));
            // Ejecuta la consulta
            rs = ps.executeQuery();
            compraDAO = new CompraDAO();
            departamentoDAO = new DepartamentoDAO();
            while (rs.next()) { 
                // Convierte el resultado de la consulta en un objeto
                Solicitud bean = new Solicitud();
                bean.setIdSolicitud(rs.getInt(1));
                bean.setTipoSolicitud(rs.getString(2));
                bean.setFechaIngreso(LocalDate.parse(rs.getString(3), fmtSQL));
                bean.setEstadoActual(rs.getInt(4));
                bean.setCategoriaMotivo(rs.getString(8));
                bean.setDescripcion(rs.getString(9));                
                // Recuperar CompraReclamada
                bean.setCompra(compraDAO.buscarPorSolicitud(bean.getIdSolicitud()));
                // Recuperar DepartamentoEvaluador
                int codigoDepartamento = rs.getInt(6);
                bean.setDepartamentoEvaluador(departamentoDAO.buscarPorCodigo(codigoDepartamento));
                // Agrega el objeto formado a la lista
                lista.add(bean);
            }
            con.close();
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }        
        return lista;
    }
    
    public List listarPorEstadoyFecha(int estado, LocalDate fechaInicio, LocalDate fechaFin) {
        List<Solicitud> lista = new ArrayList<>();
        String sql = "{CALL listarSolicitudesPorEstadoYFecha(?, ? ,?)}";
        
        try {
            // Conecta y prepara la consulta
            con = conectar.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, estado);
            ps.setString(2, fechaInicio.format(fmtSQL));
            ps.setString(3, fechaFin.format(fmtSQL));
            // Ejecuta la consulta
            rs = ps.executeQuery();
            compraDAO = new CompraDAO();
            departamentoDAO = new DepartamentoDAO();
            while (rs.next()) { 
                // Convierte el resultado de la consulta en un objeto
                Solicitud bean = new Solicitud();
                bean.setIdSolicitud(rs.getInt(1));
                bean.setTipoSolicitud(rs.getString(2));
                bean.setFechaIngreso(LocalDate.parse(rs.getString(3), fmtSQL));
                bean.setEstadoActual(rs.getInt(4));
                bean.setCategoriaMotivo(rs.getString(8));
                bean.setDescripcion(rs.getString(9));                
                // Recuperar CompraReclamada
                bean.setCompra(compraDAO.buscarPorSolicitud(bean.getIdSolicitud()));
                // Recuperar DepartamentoEvaluador
                int codigoDepartamento = rs.getInt(6);
                bean.setDepartamentoEvaluador(departamentoDAO.buscarPorCodigo(codigoDepartamento));
                // Agrega el objeto formado a la lista
                lista.add(bean);
            }
            con.close();
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }        
        return lista;
    }
    
    public List listarPorEstadoyCliente(int estado, int codigoCliente) {
        List<Solicitud> lista = new ArrayList<>();
        String sql = "{CALL listarSolicitudesPorEstadoYCliente(?, ?)}";
        
        try {
            // Conecta y prepara la consulta
            con = conectar.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, estado);
            ps.setInt(2, codigoCliente);
            // Ejecuta la consulta
            rs = ps.executeQuery();
            compraDAO = new CompraDAO();
            departamentoDAO = new DepartamentoDAO();
            while (rs.next()) { 
                // Convierte el resultado de la consulta en un objeto
                Solicitud bean = new Solicitud();
                bean.setIdSolicitud(rs.getInt(1));
                bean.setTipoSolicitud(rs.getString(2));
                bean.setFechaIngreso(LocalDate.parse(rs.getString(3), fmtSQL));
                bean.setEstadoActual(rs.getInt(4));
                bean.setCategoriaMotivo(rs.getString(7));
                bean.setDescripcion(rs.getString(8));                
                // Recuperar CompraReclamada
                bean.setCompra(compraDAO.buscarPorSolicitud(bean.getIdSolicitud()));
                // Recuperar DepartamentoEvaluador
                int codigoDepartamento = rs.getInt(6);
                bean.setDepartamentoEvaluador(departamentoDAO.buscarPorCodigo(codigoDepartamento));
                // Agrega el objeto formado a la lista
                lista.add(bean);
            }
            con.close();
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }        
        return lista;
    }
    
    public List listarPorEstadoyDepartamento(int estado, int codigoDepartamento) {
        List<Solicitud> lista = new ArrayList<>();
        String sql = "{CALL listarSolicitudesPorEstadoYDepartamento(?, ?)}";
        
        try {
            // Conecta y prepara la consulta
            con = conectar.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, estado);
            ps.setInt(2, codigoDepartamento);
            // Ejecuta la consulta
            rs = ps.executeQuery();
            compraDAO = new CompraDAO();
            departamentoDAO = new DepartamentoDAO();
            while (rs.next()) { 
                // Convierte el resultado de la consulta en un objeto
                Solicitud bean = new Solicitud();
                bean.setIdSolicitud(rs.getInt(1));
                bean.setTipoSolicitud(rs.getString(2));
                bean.setFechaIngreso(LocalDate.parse(rs.getString(3), fmtSQL));
                bean.setEstadoActual(rs.getInt(4));
                bean.setCategoriaMotivo(rs.getString(7));
                bean.setDescripcion(rs.getString(8));                
                // Recuperar CompraReclamada
                bean.setCompra(compraDAO.buscarPorSolicitud(bean.getIdSolicitud()));
                // Recuperar DepartamentoEvaluador
                codigoDepartamento = rs.getInt(6);
                bean.setDepartamentoEvaluador(departamentoDAO.buscarPorCodigo(codigoDepartamento));
                // Agrega el objeto formado a la lista
                lista.add(bean);
            }
            con.close();
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }        
        return lista;
    }
    
    public List listarPorEncuestayCliente(int estado, int codigoCliente) {
        List<Solicitud> lista = new ArrayList<>();
        String sql = "{ CALL listarSolicitudesPorEncuestayCliente(?, ?) }";
        
        try {
            // Conecta y prepara la consulta
            con = conectar.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, estado);
            ps.setInt(2, codigoCliente);
            // Ejecuta la consulta
            rs = ps.executeQuery();
            compraDAO = new CompraDAO();
            encuestaDAO = new EncuestaDAO();
            departamentoDAO = new DepartamentoDAO();
            while (rs.next()) { 
                // Convierte el resultado de la consulta en un objeto
                Solicitud bean = new Solicitud();
                bean.setIdSolicitud(rs.getInt(1));
                bean.setTipoSolicitud(rs.getString(2));
                bean.setFechaIngreso(LocalDate.parse(rs.getString(3), fmtSQL));
                bean.setEstadoActual(rs.getInt(4));
                bean.setCategoriaMotivo(rs.getString(8));
                bean.setDescripcion(rs.getString(9));                
                // Recuperar CompraReclamada
                bean.setCompra(compraDAO.buscarPorSolicitud(bean.getIdSolicitud()));
                // Recuperar Encuesta
                bean.setEncuesta(encuestaDAO.buscarPorSolicitud(bean.getIdSolicitud()));
                // Recuperar DepartamentoEvaluador
                int codigoDepartamento = rs.getInt(6);
                bean.setDepartamentoEvaluador(departamentoDAO.buscarPorCodigo(codigoDepartamento));
                // Agrega el objeto formado a la lista
                lista.add(bean);
            }
            con.close();
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }        
        return lista;
    }
    
    public Solicitud buscarPorId(int id) {
        // Si no se encuentra ninguna coincidencia, devuelve un objeto de id = -1
        Solicitud bean = new Solicitud();
        bean.setIdSolicitud(-1);
        String sql = "{CALL buscarSolicitudPorId(?)}";
        
        try {
            // Conecta y prepara la consulta
            con = conectar.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            // Ejecuta la consulta
            rs = ps.executeQuery();
            compraDAO = new CompraDAO();
            departamentoDAO = new DepartamentoDAO();
            while (rs.next()) { // Solo debería contener una fila
                // Convierte el resultado de la consulta en un objeto
                bean.setIdSolicitud(rs.getInt(1));
                bean.setTipoSolicitud(rs.getString(2));
                bean.setFechaIngreso(LocalDate.parse(rs.getString(3), fmtSQL));
                bean.setEstadoActual(rs.getInt(4));
                bean.setCategoriaMotivo(rs.getString(7));
                bean.setDescripcion(rs.getString(8));                
                // Recuperar CompraReclamada
                bean.setCompra(compraDAO.buscarPorSolicitud(id));
                // Recuperar DepartamentoEvaluador
                int codigoDepartamento = rs.getInt(6);
                bean.setDepartamentoEvaluador(departamentoDAO.buscarPorCodigo(codigoDepartamento));
            }
            con.close();
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }        
        return bean;
    }
    
}
