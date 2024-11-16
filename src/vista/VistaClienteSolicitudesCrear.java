/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import modelo.Articulo;

/**
 *
 * @author Renzo
 */
public class VistaClienteSolicitudesCrear extends javax.swing.JPanel {

    /**
     * Creates new form VistaClienteSolicitudesCrear
     */
    public VistaClienteSolicitudesCrear() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpCategoriaBien = new javax.swing.ButtonGroup();
        btngrpTipoSolicitud = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpCrearSolicitud = new javax.swing.JPanel();
        labTituloCliente = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        pnlCompra = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        labSubTitulo5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        pnlGrid = new javax.swing.JPanel();
        labFecha = new javax.swing.JLabel();
        labCanal = new javax.swing.JLabel();
        datePickerFechaCompra = new vista.DatePickerCustom();
        cbxCanalCompra = new javax.swing.JComboBox<>();
        labMonto = new javax.swing.JLabel();
        labVacio = new javax.swing.JLabel();
        txtMontoCompra = new javax.swing.JTextField();
        labVacio1 = new javax.swing.JLabel();
        labInformacion = new javax.swing.JLabel();
        pnlDireccion = new javax.swing.JPanel();
        labDireccion = new javax.swing.JLabel();
        txtDireccionCompra = new javax.swing.JTextField();
        pnlBien = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        labSubTitulo6 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        pnlCategoria = new javax.swing.JPanel();
        labCategoriaBien = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        rbtnProducto = new javax.swing.JRadioButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        rbtnServicio = new javax.swing.JRadioButton();
        labSeleccione = new javax.swing.JLabel();
        pnlNombreBien = new javax.swing.JPanel();
        cbxNombreServicio = new javax.swing.JComboBox<>();
        cbxNombreProducto = new javax.swing.JComboBox<>();
        pnlDetalles = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        labSubTitulo10 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        pnlTipo = new javax.swing.JPanel();
        labTipoSolicitud = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        rbtnQueja = new javax.swing.JRadioButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        rbtnReclamo = new javax.swing.JRadioButton();
        pnlMotivo = new javax.swing.JPanel();
        labSeleccione1 = new javax.swing.JLabel();
        cbxMotivoSolicitud = new javax.swing.JComboBox<>();
        pnlDescripcion = new javax.swing.JPanel();
        labSubTitulo11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaDescripcionSolicitud = new javax.swing.JTextArea();
        pnlBotonesSol = new javax.swing.JPanel();
        btnCrearSolicitud = new javax.swing.JButton();
        btnLimpiarSolicitud = new javax.swing.JButton();

        jScrollPane1.setBorder(null);

        jpCrearSolicitud.setMaximumSize(new java.awt.Dimension(2147483647, 800));
        jpCrearSolicitud.setMinimumSize(new java.awt.Dimension(736, 100));
        jpCrearSolicitud.setPreferredSize(new java.awt.Dimension(736, 750));
        jpCrearSolicitud.setLayout(new java.awt.BorderLayout(0, 15));

        labTituloCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labTituloCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTituloCliente.setText("Solicitud de Queja o Reclamo");
        labTituloCliente.setPreferredSize(new java.awt.Dimension(168, 30));
        jpCrearSolicitud.add(labTituloCliente, java.awt.BorderLayout.PAGE_START);

        pnlBody.setLayout(new java.awt.BorderLayout(0, 20));

        pnlCompra.setLayout(new java.awt.CardLayout());

        jPanel8.setLayout(new java.awt.BorderLayout());

        labSubTitulo5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labSubTitulo5.setText("Detalles de la Compra");
        labSubTitulo5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        labSubTitulo5.setMaximumSize(new java.awt.Dimension(198, 20));
        labSubTitulo5.setMinimumSize(new java.awt.Dimension(198, 20));
        labSubTitulo5.setPreferredSize(new java.awt.Dimension(198, 20));
        jPanel8.add(labSubTitulo5, java.awt.BorderLayout.PAGE_START);

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setLayout(new java.awt.CardLayout(5, 5));

        jPanel9.setLayout(new java.awt.BorderLayout());

        pnlGrid.setLayout(new java.awt.GridLayout(5, 2, 10, 3));

        labFecha.setText("Fecha del Incidente (dia/mes/año)");
        pnlGrid.add(labFecha);

        labCanal.setText("Canal de Compra");
        pnlGrid.add(labCanal);
        pnlGrid.add(datePickerFechaCompra);

        cbxCanalCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Tienda Física", "Tienda Virtual (Delivery)" }));
        pnlGrid.add(cbxCanalCompra);

        labMonto.setText("Monto reclamado (S/.)");
        pnlGrid.add(labMonto);
        pnlGrid.add(labVacio);

        txtMontoCompra.setText("0.00");
        pnlGrid.add(txtMontoCompra);
        pnlGrid.add(labVacio1);

        labInformacion.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labInformacion.setText("(Coloque 0 en este campo si no solicita ningún reembolso monetario)");
        pnlGrid.add(labInformacion);

        jPanel9.add(pnlGrid, java.awt.BorderLayout.PAGE_START);

        pnlDireccion.setLayout(new java.awt.BorderLayout(0, 5));

        labDireccion.setText("Dirección Física del establecimiento donde hizo la compra");
        pnlDireccion.add(labDireccion, java.awt.BorderLayout.PAGE_START);
        pnlDireccion.add(txtDireccionCompra, java.awt.BorderLayout.CENTER);

        jPanel9.add(pnlDireccion, java.awt.BorderLayout.PAGE_END);

        jPanel13.add(jPanel9, "card2");

        jPanel8.add(jPanel13, java.awt.BorderLayout.CENTER);

        pnlCompra.add(jPanel8, "card2");

        pnlBody.add(pnlCompra, java.awt.BorderLayout.PAGE_START);

        pnlBien.setPreferredSize(new java.awt.Dimension(393, 200));
        pnlBien.setLayout(new java.awt.CardLayout());

        jPanel10.setLayout(new java.awt.BorderLayout());

        labSubTitulo6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labSubTitulo6.setText("Identificación del Bien contratado");
        labSubTitulo6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        labSubTitulo6.setMaximumSize(new java.awt.Dimension(198, 20));
        labSubTitulo6.setMinimumSize(new java.awt.Dimension(198, 20));
        labSubTitulo6.setPreferredSize(new java.awt.Dimension(198, 20));
        jPanel10.add(labSubTitulo6, java.awt.BorderLayout.PAGE_START);

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setPreferredSize(new java.awt.Dimension(383, 200));
        jPanel14.setLayout(new java.awt.CardLayout(5, 5));

        jPanel11.setLayout(new java.awt.BorderLayout());

        pnlCategoria.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        labCategoriaBien.setText("Seleccione la Categoría del Bien: ");
        pnlCategoria.add(labCategoriaBien);
        pnlCategoria.add(filler1);

        btngrpCategoriaBien.add(rbtnProducto);
        rbtnProducto.setText("Producto");
        rbtnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnProductoActionPerformed(evt);
            }
        });
        pnlCategoria.add(rbtnProducto);
        pnlCategoria.add(filler2);

        btngrpCategoriaBien.add(rbtnServicio);
        rbtnServicio.setSelected(true);
        rbtnServicio.setText("Servicio");
        pnlCategoria.add(rbtnServicio);

        jPanel11.add(pnlCategoria, java.awt.BorderLayout.PAGE_START);

        labSeleccione.setText("Escriba o seleccione el nombre del Producto / Servicio:");
        jPanel11.add(labSeleccione, java.awt.BorderLayout.CENTER);

        pnlNombreBien.setLayout(new javax.swing.BoxLayout(pnlNombreBien, javax.swing.BoxLayout.Y_AXIS));

        cbxNombreServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Atención al Cliente", "Delivery", "Infraestructura", "Operación en caja", "Pago online" }));
        pnlNombreBien.add(cbxNombreServicio);

        cbxNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNombreProductoActionPerformed(evt);
            }
        });
        pnlNombreBien.add(cbxNombreProducto);

        jPanel11.add(pnlNombreBien, java.awt.BorderLayout.PAGE_END);

        jPanel14.add(jPanel11, "card2");

        jPanel10.add(jPanel14, java.awt.BorderLayout.CENTER);

        pnlBien.add(jPanel10, "card2");

        pnlBody.add(pnlBien, java.awt.BorderLayout.CENTER);

        pnlDetalles.setPreferredSize(new java.awt.Dimension(393, 270));
        pnlDetalles.setLayout(new java.awt.CardLayout());

        jPanel12.setLayout(new java.awt.BorderLayout());

        labSubTitulo10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labSubTitulo10.setText("Detalles de la Queja / Reclamo");
        labSubTitulo10.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        labSubTitulo10.setMaximumSize(new java.awt.Dimension(198, 20));
        labSubTitulo10.setMinimumSize(new java.awt.Dimension(198, 20));
        labSubTitulo10.setPreferredSize(new java.awt.Dimension(198, 20));
        jPanel12.add(labSubTitulo10, java.awt.BorderLayout.PAGE_START);

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel18.setPreferredSize(new java.awt.Dimension(383, 200));
        jPanel18.setLayout(new java.awt.CardLayout(5, 5));

        jPanel19.setLayout(new java.awt.BorderLayout());

        pnlTipo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        labTipoSolicitud.setText("Seleccione el Tipo de Solicitud: ");
        pnlTipo.add(labTipoSolicitud);
        pnlTipo.add(filler3);

        btngrpTipoSolicitud.add(rbtnQueja);
        rbtnQueja.setText("QUEJA");
        pnlTipo.add(rbtnQueja);
        pnlTipo.add(filler5);

        btngrpTipoSolicitud.add(rbtnReclamo);
        rbtnReclamo.setText("RECLAMO");
        pnlTipo.add(rbtnReclamo);

        jPanel19.add(pnlTipo, java.awt.BorderLayout.PAGE_START);

        pnlMotivo.setPreferredSize(new java.awt.Dimension(387, 80));
        pnlMotivo.setLayout(new java.awt.GridLayout(2, 0));

        labSeleccione1.setText("¿Cual de las siguientes opciones describe mejor el motivo de su solicitud?");
        pnlMotivo.add(labSeleccione1);

        cbxMotivoSolicitud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Mal servicio", "Problemas en el pago", "Producto en mal estado", "Producto no corresponde al pedido", "Otros" }));
        pnlMotivo.add(cbxMotivoSolicitud);

        jPanel19.add(pnlMotivo, java.awt.BorderLayout.CENTER);

        pnlDescripcion.setPreferredSize(new java.awt.Dimension(411, 140));
        pnlDescripcion.setLayout(new java.awt.BorderLayout());

        labSubTitulo11.setText("Describa el motivo de su molestia:");
        pnlDescripcion.add(labSubTitulo11, java.awt.BorderLayout.PAGE_START);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        txaDescripcionSolicitud.setColumns(20);
        txaDescripcionSolicitud.setRows(5);
        jScrollPane4.setViewportView(txaDescripcionSolicitud);

        jPanel7.add(jScrollPane4);

        jPanel6.add(jPanel7, java.awt.BorderLayout.CENTER);

        pnlDescripcion.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel19.add(pnlDescripcion, java.awt.BorderLayout.PAGE_END);

        jPanel18.add(jPanel19, "card2");

        jPanel12.add(jPanel18, java.awt.BorderLayout.CENTER);

        pnlDetalles.add(jPanel12, "card2");

        pnlBody.add(pnlDetalles, java.awt.BorderLayout.PAGE_END);

        jpCrearSolicitud.add(pnlBody, java.awt.BorderLayout.CENTER);

        pnlBotonesSol.setPreferredSize(new java.awt.Dimension(82, 40));

        btnCrearSolicitud.setText("Crear Solicitud");
        pnlBotonesSol.add(btnCrearSolicitud);

        btnLimpiarSolicitud.setText("Limpiar");
        btnLimpiarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarSolicitudActionPerformed(evt);
            }
        });
        pnlBotonesSol.add(btnLimpiarSolicitud);

        jpCrearSolicitud.add(pnlBotonesSol, java.awt.BorderLayout.PAGE_END);

        jScrollPane1.setViewportView(jpCrearSolicitud);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNombreProductoActionPerformed

    private void btnLimpiarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarSolicitudActionPerformed

    private void rbtnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCrearSolicitud;
    public javax.swing.JButton btnLimpiarSolicitud;
    private javax.swing.ButtonGroup btngrpCategoriaBien;
    private javax.swing.ButtonGroup btngrpTipoSolicitud;
    public javax.swing.JComboBox<String> cbxCanalCompra;
    public javax.swing.JComboBox<String> cbxMotivoSolicitud;
    public javax.swing.JComboBox<Articulo> cbxNombreProducto;
    public javax.swing.JComboBox<String> cbxNombreServicio;
    public vista.DatePickerCustom datePickerFechaCompra;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel jpCrearSolicitud;
    private javax.swing.JLabel labCanal;
    private javax.swing.JLabel labCategoriaBien;
    private javax.swing.JLabel labDireccion;
    private javax.swing.JLabel labFecha;
    private javax.swing.JLabel labInformacion;
    private javax.swing.JLabel labMonto;
    private javax.swing.JLabel labSeleccione;
    private javax.swing.JLabel labSeleccione1;
    private javax.swing.JLabel labSubTitulo10;
    private javax.swing.JLabel labSubTitulo11;
    private javax.swing.JLabel labSubTitulo5;
    private javax.swing.JLabel labSubTitulo6;
    private javax.swing.JLabel labTipoSolicitud;
    private javax.swing.JLabel labTituloCliente;
    private javax.swing.JLabel labVacio;
    private javax.swing.JLabel labVacio1;
    private javax.swing.JPanel pnlBien;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlBotonesSol;
    private javax.swing.JPanel pnlCategoria;
    private javax.swing.JPanel pnlCompra;
    private javax.swing.JPanel pnlDescripcion;
    private javax.swing.JPanel pnlDetalles;
    private javax.swing.JPanel pnlDireccion;
    private javax.swing.JPanel pnlGrid;
    private javax.swing.JPanel pnlMotivo;
    private javax.swing.JPanel pnlNombreBien;
    private javax.swing.JPanel pnlTipo;
    public javax.swing.JRadioButton rbtnProducto;
    public javax.swing.JRadioButton rbtnQueja;
    public javax.swing.JRadioButton rbtnReclamo;
    public javax.swing.JRadioButton rbtnServicio;
    public javax.swing.JTextArea txaDescripcionSolicitud;
    public javax.swing.JTextField txtDireccionCompra;
    public javax.swing.JTextField txtMontoCompra;
    // End of variables declaration//GEN-END:variables
}
