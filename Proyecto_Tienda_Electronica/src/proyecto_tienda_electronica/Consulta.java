/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_tienda_electronica;

/**
 *
 * @author polip
 */
public class Consulta extends javax.swing.JFrame {

    /**
     * Creates new form Consulta
     */
    public Consulta() {
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

        Panel_Superior = new javax.swing.JPanel();
        UsuarioTx = new javax.swing.JLabel();
        Panel_Principal = new javax.swing.JPanel();
        Panel_Ver = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        CODIGO_JL = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PRODUCTO_JL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PRECIO_JL = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Panel_Informacion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        Panel_Superior.setBackground(new java.awt.Color(255, 255, 204));
        Panel_Superior.setAlignmentY(0.25F);
        Panel_Superior.setMaximumSize(new java.awt.Dimension(32767, 327));
        Panel_Superior.setLayout(new java.awt.GridLayout(1, 1));

        UsuarioTx.setText("Bienvenido usuario");
        Panel_Superior.add(UsuarioTx);

        getContentPane().add(Panel_Superior);

        Panel_Principal.setLayout(new javax.swing.BoxLayout(Panel_Principal, javax.swing.BoxLayout.X_AXIS));

        Panel_Ver.setBackground(new java.awt.Color(0, 102, 102));
        Panel_Ver.setLayout(new java.awt.GridLayout(6, 3));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        Panel_Ver.add(jComboBox1);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel_Ver.add(jComboBox3);

        jLabel1.setText("CODIGO");
        Panel_Ver.add(jLabel1);

        CODIGO_JL.setText("jLabel2");
        Panel_Ver.add(CODIGO_JL);

        jLabel5.setText("PRODUCTO");
        Panel_Ver.add(jLabel5);

        PRODUCTO_JL.setText("jLabel3");
        Panel_Ver.add(PRODUCTO_JL);

        jLabel4.setText("PRECIO");
        Panel_Ver.add(jLabel4);

        PRECIO_JL.setText("jLabel6");
        Panel_Ver.add(PRECIO_JL);

        jLabel7.setText("CANTIDAD");
        Panel_Ver.add(jLabel7);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel_Ver.add(jComboBox4);
        Panel_Ver.add(jLabel8);

        jButton1.setText("jButton1");
        Panel_Ver.add(jButton1);

        Panel_Principal.add(Panel_Ver);

        Panel_Informacion.setBackground(new java.awt.Color(102, 204, 0));
        Panel_Informacion.setLayout(new javax.swing.BoxLayout(Panel_Informacion, javax.swing.BoxLayout.PAGE_AXIS));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Panel_Informacion.add(jScrollPane1);

        jPanel1.setBackground(new java.awt.Color(51, 255, 153));
        jPanel1.setLayout(new java.awt.GridLayout(1, 3));

        jLabel3.setText("Total a pagar");
        jPanel1.add(jLabel3);

        jLabel2.setText("Total");
        jPanel1.add(jLabel2);

        jButton2.setText("Pagar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        Panel_Informacion.add(jPanel1);

        Panel_Principal.add(Panel_Informacion);

        getContentPane().add(Panel_Principal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CODIGO_JL;
    private javax.swing.JLabel PRECIO_JL;
    private javax.swing.JLabel PRODUCTO_JL;
    private javax.swing.JPanel Panel_Informacion;
    private javax.swing.JPanel Panel_Principal;
    private javax.swing.JPanel Panel_Superior;
    private javax.swing.JPanel Panel_Ver;
    private javax.swing.JLabel UsuarioTx;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
