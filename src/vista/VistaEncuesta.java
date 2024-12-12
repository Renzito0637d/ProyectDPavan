/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author Renzo
 */
public class VistaEncuesta extends javax.swing.JPanel {

    /**
     * Creates new form VistaEncuesta
     */
    public VistaEncuesta() {
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

        btngrpPregunta1 = new javax.swing.ButtonGroup();
        btngrpPregunta2 = new javax.swing.ButtonGroup();
        btngrpPregunta3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpEncuesta = new javax.swing.JPanel();
        pnlHead = new javax.swing.JPanel();
        labTitulo = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        pnlP1 = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        labSubTitulo1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        labPregunta1 = new javax.swing.JLabel();
        pnlDireccion = new javax.swing.JPanel();
        rbtnP1_respuesta1 = new javax.swing.JRadioButton();
        rbtnP1_respuesta2 = new javax.swing.JRadioButton();
        rbtnP1_respuesta3 = new javax.swing.JRadioButton();
        rbtnP1_respuesta4 = new javax.swing.JRadioButton();
        rbtnP1_respuesta5 = new javax.swing.JRadioButton();
        pnlP2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        labSubTitulo2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        labPregunta2 = new javax.swing.JLabel();
        pnlDireccion1 = new javax.swing.JPanel();
        rbtnP2_respuesta1 = new javax.swing.JRadioButton();
        rbtnP2_respuesta2 = new javax.swing.JRadioButton();
        rbtnP2_respuesta3 = new javax.swing.JRadioButton();
        rbtnP2_respuesta4 = new javax.swing.JRadioButton();
        rbtnP2_respuesta5 = new javax.swing.JRadioButton();
        pnlP3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        labSubTitulo3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        labPregunta3 = new javax.swing.JLabel();
        pnlDireccion2 = new javax.swing.JPanel();
        rbtnP3_respuesta1 = new javax.swing.JRadioButton();
        rbtnP3_respuesta2 = new javax.swing.JRadioButton();
        rbtnP3_respuesta3 = new javax.swing.JRadioButton();
        rbtnP3_respuesta4 = new javax.swing.JRadioButton();
        rbtnP3_respuesta5 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        btnCompletarEncuesta = new javax.swing.JButton();
        btnVolverEncuesta = new javax.swing.JButton();

        jpEncuesta.setMaximumSize(new java.awt.Dimension(2147483647, 800));
        jpEncuesta.setMinimumSize(new java.awt.Dimension(736, 100));
        jpEncuesta.setPreferredSize(new java.awt.Dimension(736, 700));

        pnlHead.setLayout(new java.awt.BorderLayout());

        labTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitulo.setText("Encuesta de Satisfacción");
        labTitulo.setPreferredSize(new java.awt.Dimension(168, 30));
        pnlHead.add(labTitulo, java.awt.BorderLayout.PAGE_START);

        pnlP1.setLayout(new java.awt.CardLayout());

        jPanel.setLayout(new java.awt.BorderLayout(0, 5));

        labSubTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labSubTitulo1.setText("PREGUNTA 1");
        labSubTitulo1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        labSubTitulo1.setMaximumSize(new java.awt.Dimension(198, 20));
        labSubTitulo1.setMinimumSize(new java.awt.Dimension(198, 20));
        labSubTitulo1.setPreferredSize(new java.awt.Dimension(198, 20));
        jPanel.add(labSubTitulo1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.CardLayout(10, 10));

        jPanel4.setLayout(new java.awt.BorderLayout());

        labPregunta1.setText("¿Cómo calificarías tu experiencia general con nuestro servicio de atención de quejas y reclamos?");
        jPanel4.add(labPregunta1, java.awt.BorderLayout.PAGE_START);

        pnlDireccion.setLayout(new java.awt.GridLayout(5, 0));

        btngrpPregunta1.add(rbtnP1_respuesta1);
        rbtnP1_respuesta1.setText("Muy Insatisfactorio");
        pnlDireccion.add(rbtnP1_respuesta1);

        btngrpPregunta1.add(rbtnP1_respuesta2);
        rbtnP1_respuesta2.setText("Insatisfactorio");
        pnlDireccion.add(rbtnP1_respuesta2);

        btngrpPregunta1.add(rbtnP1_respuesta3);
        rbtnP1_respuesta3.setText("Regular");
        pnlDireccion.add(rbtnP1_respuesta3);

        btngrpPregunta1.add(rbtnP1_respuesta4);
        rbtnP1_respuesta4.setText("Satisfactorio");
        pnlDireccion.add(rbtnP1_respuesta4);

        btngrpPregunta1.add(rbtnP1_respuesta5);
        rbtnP1_respuesta5.setText("Excelente");
        pnlDireccion.add(rbtnP1_respuesta5);

        jPanel4.add(pnlDireccion, java.awt.BorderLayout.PAGE_END);

        jPanel3.add(jPanel4, "card2");

        jPanel.add(jPanel3, java.awt.BorderLayout.CENTER);

        pnlP1.add(jPanel, "card2");

        labSubTitulo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labSubTitulo2.setText("PREGUNTA 2");
        labSubTitulo2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        labSubTitulo2.setMaximumSize(new java.awt.Dimension(198, 20));
        labSubTitulo2.setMinimumSize(new java.awt.Dimension(198, 20));
        labSubTitulo2.setPreferredSize(new java.awt.Dimension(198, 20));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labPregunta2.setText("¿Qué tan receptivo ha sido nuestro personal a tus preguntas y preocupaciones?");

        pnlDireccion1.setLayout(new java.awt.GridLayout(5, 0));

        btngrpPregunta2.add(rbtnP2_respuesta1);
        rbtnP2_respuesta1.setText("Nada receptivos");
        pnlDireccion1.add(rbtnP2_respuesta1);

        btngrpPregunta2.add(rbtnP2_respuesta2);
        rbtnP2_respuesta2.setText("Muy poco receptivos");
        pnlDireccion1.add(rbtnP2_respuesta2);

        btngrpPregunta2.add(rbtnP2_respuesta3);
        rbtnP2_respuesta3.setText("Poco receptivos");
        rbtnP2_respuesta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnP2_respuesta3ActionPerformed(evt);
            }
        });
        pnlDireccion1.add(rbtnP2_respuesta3);

        btngrpPregunta2.add(rbtnP2_respuesta4);
        rbtnP2_respuesta4.setText("Moderadamente receptivos");
        pnlDireccion1.add(rbtnP2_respuesta4);

        btngrpPregunta2.add(rbtnP2_respuesta5);
        rbtnP2_respuesta5.setText("Muy receptivos");
        pnlDireccion1.add(rbtnP2_respuesta5);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labPregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(labPregunta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(labSubTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(labSubTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlP2Layout = new javax.swing.GroupLayout(pnlP2);
        pnlP2.setLayout(pnlP2Layout);
        pnlP2Layout.setHorizontalGroup(
            pnlP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlP2Layout.setVerticalGroup(
            pnlP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlP3.setLayout(new java.awt.CardLayout());

        jPanel8.setLayout(new java.awt.BorderLayout(0, 5));

        labSubTitulo3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labSubTitulo3.setText("PREGUNTA 3");
        labSubTitulo3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        labSubTitulo3.setMaximumSize(new java.awt.Dimension(198, 20));
        labSubTitulo3.setMinimumSize(new java.awt.Dimension(198, 20));
        labSubTitulo3.setPreferredSize(new java.awt.Dimension(198, 20));
        jPanel8.add(labSubTitulo3, java.awt.BorderLayout.PAGE_START);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new java.awt.CardLayout(10, 10));

        jPanel13.setLayout(new java.awt.BorderLayout());

        labPregunta3.setText("¿Cuáles son las probabilidades de que vuelvas a comprar nuestros productos?");
        jPanel13.add(labPregunta3, java.awt.BorderLayout.PAGE_START);

        pnlDireccion2.setLayout(new java.awt.GridLayout(5, 0));

        btngrpPregunta3.add(rbtnP3_respuesta1);
        rbtnP3_respuesta1.setText("Muy Improbable");
        pnlDireccion2.add(rbtnP3_respuesta1);

        btngrpPregunta3.add(rbtnP3_respuesta2);
        rbtnP3_respuesta2.setText("Improbable");
        pnlDireccion2.add(rbtnP3_respuesta2);

        btngrpPregunta3.add(rbtnP3_respuesta3);
        rbtnP3_respuesta3.setText("Neutro");
        pnlDireccion2.add(rbtnP3_respuesta3);

        btngrpPregunta3.add(rbtnP3_respuesta4);
        rbtnP3_respuesta4.setText("Probable");
        pnlDireccion2.add(rbtnP3_respuesta4);

        btngrpPregunta3.add(rbtnP3_respuesta5);
        rbtnP3_respuesta5.setText("Muy probable");
        pnlDireccion2.add(rbtnP3_respuesta5);

        jPanel13.add(pnlDireccion2, java.awt.BorderLayout.PAGE_END);

        jPanel9.add(jPanel13, "card2");

        jPanel8.add(jPanel9, java.awt.BorderLayout.CENTER);

        pnlP3.add(jPanel8, "card2");

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlP1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlP3, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addComponent(pnlP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnlP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnlP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpEncuestaLayout = new javax.swing.GroupLayout(jpEncuesta);
        jpEncuesta.setLayout(jpEncuestaLayout);
        jpEncuestaLayout.setHorizontalGroup(
            jpEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHead, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jpEncuestaLayout.setVerticalGroup(
            jpEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEncuestaLayout.createSequentialGroup()
                .addComponent(pnlHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(pnlBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jpEncuesta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        btnCompletarEncuesta.setText("Completar Encuesta");

        btnVolverEncuesta.setText("Volver");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(btnCompletarEncuesta)
                .addGap(41, 41, 41)
                .addComponent(btnVolverEncuesta)
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompletarEncuesta)
                    .addComponent(btnVolverEncuesta))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnP2_respuesta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnP2_respuesta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnP2_respuesta3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCompletarEncuesta;
    public javax.swing.JButton btnVolverEncuesta;
    private javax.swing.ButtonGroup btngrpPregunta1;
    private javax.swing.ButtonGroup btngrpPregunta2;
    private javax.swing.ButtonGroup btngrpPregunta3;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpEncuesta;
    private javax.swing.JLabel labPregunta1;
    private javax.swing.JLabel labPregunta2;
    private javax.swing.JLabel labPregunta3;
    private javax.swing.JLabel labSubTitulo1;
    private javax.swing.JLabel labSubTitulo2;
    private javax.swing.JLabel labSubTitulo3;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlDireccion;
    private javax.swing.JPanel pnlDireccion1;
    private javax.swing.JPanel pnlDireccion2;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlP1;
    private javax.swing.JPanel pnlP2;
    private javax.swing.JPanel pnlP3;
    public javax.swing.JRadioButton rbtnP1_respuesta1;
    public javax.swing.JRadioButton rbtnP1_respuesta2;
    public javax.swing.JRadioButton rbtnP1_respuesta3;
    public javax.swing.JRadioButton rbtnP1_respuesta4;
    public javax.swing.JRadioButton rbtnP1_respuesta5;
    public javax.swing.JRadioButton rbtnP2_respuesta1;
    public javax.swing.JRadioButton rbtnP2_respuesta2;
    public javax.swing.JRadioButton rbtnP2_respuesta3;
    public javax.swing.JRadioButton rbtnP2_respuesta4;
    public javax.swing.JRadioButton rbtnP2_respuesta5;
    public javax.swing.JRadioButton rbtnP3_respuesta1;
    public javax.swing.JRadioButton rbtnP3_respuesta2;
    public javax.swing.JRadioButton rbtnP3_respuesta3;
    public javax.swing.JRadioButton rbtnP3_respuesta4;
    public javax.swing.JRadioButton rbtnP3_respuesta5;
    // End of variables declaration//GEN-END:variables
}