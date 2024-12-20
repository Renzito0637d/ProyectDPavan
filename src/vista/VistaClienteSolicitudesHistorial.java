/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author Renzo
 */
public class VistaClienteSolicitudesHistorial extends javax.swing.JPanel {

    /**
     * Creates new form VistaClienteSolicitudesHistorial
     */
    public VistaClienteSolicitudesHistorial() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jpVerSolicitud = new javax.swing.JPanel();
        jpHead = new javax.swing.JPanel();
        pnlHead = new javax.swing.JPanel();
        labTitulo = new javax.swing.JLabel();
        pnlFiltroEstado = new javax.swing.JPanel();
        labFiltroEstado = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        cbxFiltrarEstadoSol = new javax.swing.JComboBox<>();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(15, 32767));
        btnActualizarListaSol = new javax.swing.JButton();
        pnlTablaS = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbSolicitudes = new javax.swing.JTable();
        jpBody = new javax.swing.JPanel();
        labSubTitulo1 = new javax.swing.JLabel();
        pnlDetalle = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDetalleSolicitud = new javax.swing.JTextArea();
        jpBottom = new javax.swing.JPanel();
        labSubTitulo2 = new javax.swing.JLabel();
        pnlSeguimiento = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnlTablaE = new javax.swing.JPanel();
        labInfo2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbEvaluaciones = new javax.swing.JTable();
        pnlInfoEval = new javax.swing.JPanel();
        labSubTitulo3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txaDetalleEvaluacion = new javax.swing.JTextArea();

        jScrollPane1.setBorder(null);

        jpVerSolicitud.setPreferredSize(new java.awt.Dimension(400, 900));
        jpVerSolicitud.setLayout(new java.awt.BorderLayout(5, 5));

        jpHead.setLayout(new java.awt.BorderLayout(0, 10));

        pnlHead.setPreferredSize(new java.awt.Dimension(193, 75));
        pnlHead.setLayout(new java.awt.GridLayout(2, 0, 0, 15));

        labTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitulo.setText("Mis Solicitudes");
        pnlHead.add(labTitulo);

        pnlFiltroEstado.setPreferredSize(new java.awt.Dimension(200, 40));
        pnlFiltroEstado.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        labFiltroEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labFiltroEstado.setText("Filtrar por Estado: ");
        pnlFiltroEstado.add(labFiltroEstado);
        pnlFiltroEstado.add(filler4);

        cbxFiltrarEstadoSol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "En Espera", "En Trámite", "Finalizado" }));
        cbxFiltrarEstadoSol.setMaximumSize(new java.awt.Dimension(100, 80));
        pnlFiltroEstado.add(cbxFiltrarEstadoSol);
        pnlFiltroEstado.add(filler6);

        btnActualizarListaSol.setText("Actualizar Lista de Mis Solicitudes");
        pnlFiltroEstado.add(btnActualizarListaSol);

        pnlHead.add(pnlFiltroEstado);

        jpHead.add(pnlHead, java.awt.BorderLayout.PAGE_START);

        pnlTablaS.setMaximumSize(new java.awt.Dimension(2147483647, 180));
        pnlTablaS.setPreferredSize(new java.awt.Dimension(579, 170));
        pnlTablaS.setRequestFocusEnabled(false);

        tbSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tipo de solicitud", "Cliente", "Fecha de ingreso", "Estado actual", "Departamento evaluador"
            }
        ));
        jScrollPane4.setViewportView(tbSolicitudes);

        javax.swing.GroupLayout pnlTablaSLayout = new javax.swing.GroupLayout(pnlTablaS);
        pnlTablaS.setLayout(pnlTablaSLayout);
        pnlTablaSLayout.setHorizontalGroup(
            pnlTablaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );
        pnlTablaSLayout.setVerticalGroup(
            pnlTablaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        jpHead.add(pnlTablaS, java.awt.BorderLayout.CENTER);

        jpVerSolicitud.add(jpHead, java.awt.BorderLayout.PAGE_START);

        jpBody.setMaximumSize(new java.awt.Dimension(800, 100));
        jpBody.setPreferredSize(new java.awt.Dimension(579, 100));
        jpBody.setLayout(new java.awt.BorderLayout());

        labSubTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labSubTitulo1.setText("Detalles de la Solicitud seleccionada");
        labSubTitulo1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        labSubTitulo1.setMaximumSize(new java.awt.Dimension(198, 20));
        labSubTitulo1.setMinimumSize(new java.awt.Dimension(198, 20));
        labSubTitulo1.setPreferredSize(new java.awt.Dimension(198, 20));
        jpBody.add(labSubTitulo1, java.awt.BorderLayout.PAGE_START);

        pnlDetalle.setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        txaDetalleSolicitud.setEditable(false);
        txaDetalleSolicitud.setColumns(20);
        txaDetalleSolicitud.setRows(5);
        txaDetalleSolicitud.setFocusable(false);
        jScrollPane2.setViewportView(txaDetalleSolicitud);

        jPanel1.add(jScrollPane2);

        pnlDetalle.add(jPanel1, "card3");

        jpBody.add(pnlDetalle, java.awt.BorderLayout.CENTER);

        jpVerSolicitud.add(jpBody, java.awt.BorderLayout.CENTER);

        jpBottom.setPreferredSize(new java.awt.Dimension(452, 520));
        jpBottom.setLayout(new java.awt.BorderLayout());

        labSubTitulo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labSubTitulo2.setText("Seguimiento de la Solicitud seleccionada");
        jpBottom.add(labSubTitulo2, java.awt.BorderLayout.PAGE_START);

        pnlSeguimiento.setPreferredSize(new java.awt.Dimension(411, 500));
        pnlSeguimiento.setLayout(new java.awt.CardLayout(3, 5));

        jPanel2.setPreferredSize(new java.awt.Dimension(405, 400));
        jPanel2.setLayout(new java.awt.BorderLayout());

        pnlTablaE.setMaximumSize(new java.awt.Dimension(2147483647, 130));
        pnlTablaE.setPreferredSize(new java.awt.Dimension(579, 120));
        pnlTablaE.setRequestFocusEnabled(false);
        pnlTablaE.setLayout(new java.awt.BorderLayout());

        labInfo2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labInfo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labInfo2.setText("Seleccione una fila para mostrar los detalles y comentarios de la Evaluación correspondiente.");
        labInfo2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        labInfo2.setMaximumSize(new java.awt.Dimension(411, 20));
        labInfo2.setPreferredSize(new java.awt.Dimension(411, 20));
        pnlTablaE.add(labInfo2, java.awt.BorderLayout.PAGE_END);

        tbEvaluaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Número Evaluación", "Fecha", "Hora", "Estado", "Evaluador"
            }
        ));
        jScrollPane5.setViewportView(tbEvaluaciones);

        pnlTablaE.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        jPanel2.add(pnlTablaE, java.awt.BorderLayout.PAGE_START);

        pnlInfoEval.setPreferredSize(new java.awt.Dimension(411, 80));

        labSubTitulo3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labSubTitulo3.setText("Información");

        txaDetalleEvaluacion.setColumns(20);
        txaDetalleEvaluacion.setRows(5);
        jScrollPane6.setViewportView(txaDetalleEvaluacion);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlInfoEvalLayout = new javax.swing.GroupLayout(pnlInfoEval);
        pnlInfoEval.setLayout(pnlInfoEvalLayout);
        pnlInfoEvalLayout.setHorizontalGroup(
            pnlInfoEvalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoEvalLayout.createSequentialGroup()
                .addComponent(labSubTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlInfoEvalLayout.setVerticalGroup(
            pnlInfoEvalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoEvalLayout.createSequentialGroup()
                .addComponent(labSubTitulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(pnlInfoEval, java.awt.BorderLayout.CENTER);

        pnlSeguimiento.add(jPanel2, "card2");

        jpBottom.add(pnlSeguimiento, java.awt.BorderLayout.PAGE_END);

        jpVerSolicitud.add(jpBottom, java.awt.BorderLayout.PAGE_END);

        jScrollPane1.setViewportView(jpVerSolicitud);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarListaSol;
    public javax.swing.JComboBox<String> cbxFiltrarEstadoSol;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpBottom;
    private javax.swing.JPanel jpHead;
    private javax.swing.JPanel jpVerSolicitud;
    private javax.swing.JLabel labFiltroEstado;
    private javax.swing.JLabel labInfo2;
    private javax.swing.JLabel labSubTitulo1;
    private javax.swing.JLabel labSubTitulo2;
    private javax.swing.JLabel labSubTitulo3;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JPanel pnlDetalle;
    private javax.swing.JPanel pnlFiltroEstado;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlInfoEval;
    private javax.swing.JPanel pnlSeguimiento;
    private javax.swing.JPanel pnlTablaE;
    private javax.swing.JPanel pnlTablaS;
    public javax.swing.JTable tbEvaluaciones;
    public javax.swing.JTable tbSolicitudes;
    public javax.swing.JTextArea txaDetalleEvaluacion;
    public javax.swing.JTextArea txaDetalleSolicitud;
    // End of variables declaration//GEN-END:variables
}
