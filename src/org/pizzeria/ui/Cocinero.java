/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.ui;

import java.awt.event.WindowEvent;

/**
 *
 * @author Notebook3
 */
public class Cocinero extends javax.swing.JFrame {
    /**
     * Creates new form Cocinero
     */
    public Cocinero() {
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

        jbtn_aceptar = new javax.swing.JButton();
        jtxt_nombre = new javax.swing.JTextField();
        jbtn_cancelar = new javax.swing.JButton();
        jtxt_nombre1 = new javax.swing.JTextField();
        jtxt_nombre2 = new javax.swing.JTextField();
        jlbl_dni = new javax.swing.JLabel();
        jtxt_nombre3 = new javax.swing.JTextField();
        jlbl_direccion = new javax.swing.JLabel();
        jtxt_nombre4 = new javax.swing.JTextField();
        jlbl_telefono = new javax.swing.JLabel();
        jlbl_nombre = new javax.swing.JLabel();
        jlbl_apellido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario de Cocinero");

        jbtn_aceptar.setText("Aceptar");
        jbtn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_aceptarActionPerformed(evt);
            }
        });

        jtxt_nombre.setToolTipText("");
        jtxt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombreActionPerformed(evt);
            }
        });

        jbtn_cancelar.setText("Cancelar");
        jbtn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cancelarActionPerformed(evt);
            }
        });

        jtxt_nombre1.setToolTipText("");
        jtxt_nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombre1ActionPerformed(evt);
            }
        });

        jtxt_nombre2.setToolTipText("");
        jtxt_nombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombre2ActionPerformed(evt);
            }
        });

        jlbl_dni.setText("D.N.I");

        jtxt_nombre3.setToolTipText("");
        jtxt_nombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombre3ActionPerformed(evt);
            }
        });

        jlbl_direccion.setText("Dirección");

        jtxt_nombre4.setToolTipText("");
        jtxt_nombre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombre4ActionPerformed(evt);
            }
        });

        jlbl_telefono.setText("Telefono");

        jlbl_nombre.setText("Nombre");

        jlbl_apellido.setText("Apellido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jbtn_aceptar)
                .addGap(59, 59, 59)
                .addComponent(jbtn_cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_dni)
                    .addComponent(jlbl_nombre)
                    .addComponent(jlbl_apellido)
                    .addComponent(jlbl_direccion)
                    .addComponent(jlbl_telefono))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                    .addComponent(jtxt_nombre1)
                    .addComponent(jtxt_nombre2)
                    .addComponent(jtxt_nombre3)
                    .addComponent(jtxt_nombre4))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_nombre)
                    .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_apellido)
                    .addComponent(jtxt_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_dni))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_direccion))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_nombre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_telefono))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_aceptar)
                    .addComponent(jbtn_cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_aceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_aceptarActionPerformed

    private void jtxt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_nombreActionPerformed

    private void jbtn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cancelarActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jbtn_cancelarActionPerformed

    private void jtxt_nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_nombre1ActionPerformed

    private void jtxt_nombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_nombre2ActionPerformed

    private void jtxt_nombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_nombre3ActionPerformed

    private void jtxt_nombre4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombre4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_nombre4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cocinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Cocinero().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_aceptar;
    private javax.swing.JButton jbtn_cancelar;
    private javax.swing.JLabel jlbl_apellido;
    private javax.swing.JLabel jlbl_direccion;
    private javax.swing.JLabel jlbl_dni;
    private javax.swing.JLabel jlbl_nombre;
    private javax.swing.JLabel jlbl_telefono;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_nombre1;
    private javax.swing.JTextField jtxt_nombre2;
    private javax.swing.JTextField jtxt_nombre3;
    private javax.swing.JTextField jtxt_nombre4;
    // End of variables declaration//GEN-END:variables
}