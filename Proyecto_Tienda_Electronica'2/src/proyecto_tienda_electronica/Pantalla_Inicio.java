/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_tienda_electronica;

import java.util.LinkedHashMap;
import javax.swing.JFrame;

/**
 *
 * @author polip
 */
public class Pantalla_Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla_Inicio
     * @param aux
     */
    public Pantalla_Inicio(Inventariado aux) {
        initComponents();
        this.inventariado=aux;
    }

    private Pantalla_Inicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Tienda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(156, 210, 211));
        jPanel1.setLayout(new java.awt.GridLayout(3, 4, 40, 80));
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel2);

        jButton2.setBackground(new java.awt.Color(242, 230, 207));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(74, 110, 176));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_tienda_electronica/management_inventory_icon_216505.png"))); // NOI18N
        jButton2.setText("Gestion de la tienda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        Tienda.setBackground(new java.awt.Color(242, 230, 207));
        Tienda.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Tienda.setForeground(new java.awt.Color(74, 110, 176));
        Tienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_tienda_electronica/ecommerce_home_market_mart_shop_shopping_store_icon_123207.png"))); // NOI18N
        Tienda.setText("Tienda");
        Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiendaActionPerformed(evt);
            }
        });
        jPanel1.add(Tienda);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiendaActionPerformed
        // TODO add your handling code here:
        Ingreso_Cliente a=new Ingreso_Cliente(inventariado);
        a.setTitle("Menu");
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        a.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_TiendaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Password a=new Password(inventariado);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        a.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButton2ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tienda;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private Inventariado inventariado;
}
