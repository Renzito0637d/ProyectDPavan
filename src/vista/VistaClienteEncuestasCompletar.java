/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Renzo
 */
public class VistaClienteEncuestasCompletar extends javax.swing.JPanel {

    /**
     * Creates new form VistaClienteCuentaDetalles
     */
    public VistaClienteEncuestasCompletar() {
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

        labEncuestas = new javax.swing.JLabel();
        btnActualizarListaEncuestas = new javax.swing.JButton();
        scrlTablaSolicitudes1 = new javax.swing.JScrollPane();
        tbEncuestas = new javax.swing.JTable();
        labInfo3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        labEncuestas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labEncuestas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labEncuestas.setText("Encuestas por completar");
        labEncuestas.setPreferredSize(new java.awt.Dimension(168, 30));

        btnActualizarListaEncuestas.setText("Actualizar Lista de Encuestas");
        btnActualizarListaEncuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarListaEncuestasActionPerformed(evt);
            }
        });

        scrlTablaSolicitudes1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrlTablaSolicitudes1.setMaximumSize(new java.awt.Dimension(32767, 200));
        scrlTablaSolicitudes1.setPreferredSize(new java.awt.Dimension(452, 150));

        tbEncuestas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"123", "QUEJA", "Luis Gonzales", "12-05-2020", "FINALIZADO", "Gerencia"}
            },
            new String [] {
                "ID", "Tipo de Solicitud", "Cliente", "Fecha Ingreso", "Estado actual", "Departamento Evaluador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEncuestas.setMaximumSize(new java.awt.Dimension(450, 200));
        tbEncuestas.setPreferredSize(new java.awt.Dimension(450, 200));
        tbEncuestas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEncuestasMouseClicked(evt);
            }
        });
        scrlTablaSolicitudes1.setViewportView(tbEncuestas);

        labInfo3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labInfo3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labInfo3.setText("Seleccione una fila para poder ver la encuesta al lado derecho");
        labInfo3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        labInfo3.setMaximumSize(new java.awt.Dimension(411, 20));
        labInfo3.setPreferredSize(new java.awt.Dimension(411, 20));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel1.setText("Seleciona una fila..");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labEncuestas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labInfo3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrlTablaSolicitudes1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                            .addComponent(btnActualizarListaEncuestas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labEncuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnActualizarListaEncuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrlTablaSolicitudes1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labInfo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 104, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarListaEncuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarListaEncuestasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarListaEncuestasActionPerformed

    private void tbEncuestasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEncuestasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbEncuestasMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarListaEncuestas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labEncuestas;
    private javax.swing.JLabel labInfo3;
    private javax.swing.JScrollPane scrlTablaSolicitudes1;
    public javax.swing.JTable tbEncuestas;
    // End of variables declaration//GEN-END:variables
}
