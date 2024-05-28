/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Medicinas;

import Medicinas.ALMACENAMIENTO_CLIENTES;
import javax.swing.JOptionPane;
public class CreacionCliente extends javax.swing.JFrame {
    private ALMACENAMIENTO_CLIENTES CLIENTES;
    public CreacionCliente(ALMACENAMIENTO_CLIENTES CLIENTES) {
        this.CLIENTES = CLIENTES;
        initComponents();
    }

    private CreacionCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TT_CONTRASENA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TT_APELLIDO = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TT_NOMBRE = new javax.swing.JTextField();
        TT_CEDULA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TT_DIRECCION = new javax.swing.JTextField();
        REGISTRAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(7, 31, 64));
        jPanel3.setPreferredSize(new java.awt.Dimension(700, 350));

        jPanel4.setBackground(new java.awt.Color(4, 50, 91));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(244, 244, 244));
        jLabel1.setText("Cedula (Usuario):");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(243, 206, 80));
        jLabel3.setText("Registro");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(244, 244, 244));
        jLabel4.setText("Contraseña:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        TT_CONTRASENA.setBackground(new java.awt.Color(1, 90, 149));
        TT_CONTRASENA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TT_CONTRASENA.setForeground(new java.awt.Color(244, 244, 244));
        jPanel4.add(TT_CONTRASENA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 170, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(244, 244, 244));
        jLabel6.setText("Nombre:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        TT_APELLIDO.setBackground(new java.awt.Color(1, 90, 149));
        TT_APELLIDO.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TT_APELLIDO.setForeground(new java.awt.Color(244, 244, 244));
        jPanel4.add(TT_APELLIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 170, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(244, 244, 244));
        jLabel7.setText("Apellido:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        TT_NOMBRE.setBackground(new java.awt.Color(1, 90, 149));
        TT_NOMBRE.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TT_NOMBRE.setForeground(new java.awt.Color(244, 244, 244));
        jPanel4.add(TT_NOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 170, -1));

        TT_CEDULA.setBackground(new java.awt.Color(1, 90, 149));
        TT_CEDULA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TT_CEDULA.setForeground(new java.awt.Color(244, 244, 244));
        jPanel4.add(TT_CEDULA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 170, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(244, 244, 244));
        jLabel8.setText("Dirección");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        TT_DIRECCION.setBackground(new java.awt.Color(1, 90, 149));
        TT_DIRECCION.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TT_DIRECCION.setForeground(new java.awt.Color(244, 244, 244));
        jPanel4.add(TT_DIRECCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 170, -1));

        REGISTRAR.setBackground(new java.awt.Color(3, 133, 135));
        REGISTRAR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        REGISTRAR.setForeground(new java.awt.Color(244, 244, 244));
        REGISTRAR.setText("Registrarse");
        REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARActionPerformed(evt);
            }
        });
        jPanel4.add(REGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARActionPerformed
        if(Utilidades.ValidarLongitud(TT_CEDULA.getText(),13)&&Utilidades.ValidarLongitud(TT_NOMBRE.getText(), 15)&&Utilidades.ValidarLongitud(TT_APELLIDO.getText(),15)&&
            Utilidades.ValidarLongitud(TT_DIRECCION.getText(),30)&& Utilidades.ValidarLongitud(TT_CONTRASENA.getText(),8))
        {
            if(CLIENTES.Existe(Utilidades.Aumentar_Espacios(TT_CEDULA.getText(),13)))
            {
                JOptionPane.showMessageDialog(this,"Este usuario ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                CLIENTES.Ingresar_Cliente(
                    Utilidades.Aumentar_Espacios(TT_CEDULA.getText(),13), 
                    Utilidades.Aumentar_Espacios(TT_NOMBRE.getText(), 15),
                    Utilidades.Aumentar_Espacios(TT_APELLIDO.getText(),15) ,
                    Utilidades.Aumentar_Espacios(TT_DIRECCION.getText(),30), 
                    Utilidades.Aumentar_Espacios(TT_CONTRASENA.getText(),8));
                    JOptionPane.showMessageDialog(null, "Usuario Creado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Demasiados caracteres", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_REGISTRARActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreacionCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton REGISTRAR;
    private javax.swing.JTextField TT_APELLIDO;
    private javax.swing.JTextField TT_CEDULA;
    private javax.swing.JTextField TT_CONTRASENA;
    private javax.swing.JTextField TT_DIRECCION;
    private javax.swing.JTextField TT_NOMBRE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
