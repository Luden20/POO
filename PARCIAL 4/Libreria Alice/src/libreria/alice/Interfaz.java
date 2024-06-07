/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libreria.alice;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RODRIGUEZ-PC
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() 
    {
        initComponents();
        tabla = new DefaultTableModel();
        jTable1.setModel(tabla);
        conexion = new ConexionSQLite("D:\\Universidad\\POO\\Bases de Datos SQLite\\Librossssssssssssssssssssssssssssss.db");
        conexion.MostrarTabla("SELECT * FROM Libros;", tabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBOrdenar = new javax.swing.JButton();
        JCBGenero = new javax.swing.JComboBox<>();
        JBAnio = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JBBuscarNombre = new javax.swing.JButton();
        JBBuscarAutor = new javax.swing.JButton();
        TFTitulo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(4, 50, 91));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 650, 300));

        JBOrdenar.setBackground(new java.awt.Color(3, 133, 135));
        JBOrdenar.setForeground(new java.awt.Color(242, 242, 242));
        JBOrdenar.setText("Ordenar por Defecto");
        JBOrdenar.setActionCommand("Ordenar por Codigo");
        JBOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBOrdenarActionPerformed(evt);
            }
        });
        getContentPane().add(JBOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 262, -1));

        JCBGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos los Generos", "Accion", "Aventura", "Ciencia Ficcion", "Cuento", "Epopeya", "Fantasia", "Ficcion", "Misterio", "Poesia", "Realismo Mágico", "Romance", "Terror", "Tragedia" }));
        JCBGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(JCBGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 262, -1));

        JBAnio.setBackground(new java.awt.Color(3, 133, 135));
        JBAnio.setForeground(new java.awt.Color(242, 242, 242));
        JBAnio.setText("Ordenar por Año");
        JBAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAnioActionPerformed(evt);
            }
        });
        getContentPane().add(JBAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 262, -1));

        jButton1.setBackground(new java.awt.Color(3, 133, 135));
        jButton1.setForeground(new java.awt.Color(242, 242, 242));
        jButton1.setText("Agrupar por Editorial");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 262, -1));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(243, 206, 80));
        jLabel2.setText("Sebas Wonderland");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Catalogo Digital");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(243, 206, 80));
        jLabel4.setText("La imaginacion es la unica arma en la guerra contra la realidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libreria/alice/alice-removebg-preview__1_-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libreria/alice/sombrerero-loco-pegatina-removebg-preview__1_-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(1, 90, 149));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Busqueda");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        JBBuscarNombre.setBackground(new java.awt.Color(3, 133, 135));
        JBBuscarNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBBuscarNombre.setForeground(new java.awt.Color(242, 242, 242));
        JBBuscarNombre.setText("Por Nombre");
        JBBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarNombreActionPerformed(evt);
            }
        });
        jPanel3.add(JBBuscarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        JBBuscarAutor.setBackground(new java.awt.Color(3, 133, 135));
        JBBuscarAutor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBBuscarAutor.setForeground(new java.awt.Color(242, 242, 242));
        JBBuscarAutor.setText("Por Autor");
        JBBuscarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarAutorActionPerformed(evt);
            }
        });
        jPanel3.add(JBBuscarAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 90, -1));

        TFTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFTituloActionPerformed(evt);
            }
        });
        jPanel3.add(TFTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 262, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 300, 320));

        jPanel1.setBackground(new java.awt.Color(7, 31, 64));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 470, 90));

        jPanel2.setBackground(new java.awt.Color(4, 50, 91));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBOrdenarActionPerformed
        // TODO add your handling code here:
        conexion.MostrarTabla("SELECT * FROM Libros ORDER BY Codigo;", tabla);
    }//GEN-LAST:event_JBOrdenarActionPerformed

    private void JCBGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBGeneroActionPerformed
        // TODO add your handling code here:
        genero = JCBGenero.getSelectedItem().toString();
        if (genero != "Todos los Generos")
        {
            conexion.MostrarTabla("SELECT * from Libros where Genero = '" + genero +"';", tabla);
        }       
        else
        {
            conexion.MostrarTabla("SELECT * FROM Libros ORDER BY Codigo;", tabla);
        }
    }//GEN-LAST:event_JCBGeneroActionPerformed

    private void JBAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAnioActionPerformed
        // TODO add your handling code here:
        conexion.MostrarTabla("SELECT * FROM Libros ORDER BY Año;", tabla);
    }//GEN-LAST:event_JBAnioActionPerformed

    private void TFTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFTituloActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TFTituloActionPerformed

    private void JBBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarNombreActionPerformed
        // TODO add your handling code here:
        titulo = TFTitulo.getText().toString();
        conexion.MostrarTabla("select * from Libros where Nombre like ('%" + titulo +"%');", tabla);
    }//GEN-LAST:event_JBBuscarNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        conexion.MostrarTabla("SELECT Editorial,COUNT(*) FROM Libros GROUP BY Editorial;", tabla);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBBuscarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarAutorActionPerformed
        // TODO add your handling code here:
        titulo = TFTitulo.getText().toString();
        conexion.MostrarTabla("select * from Libros where Autor like ('%" + titulo +"%');", tabla);
    }//GEN-LAST:event_JBBuscarAutorActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAnio;
    private javax.swing.JButton JBBuscarAutor;
    private javax.swing.JButton JBBuscarNombre;
    private javax.swing.JButton JBOrdenar;
    private javax.swing.JComboBox<String> JCBGenero;
    private javax.swing.JTextField TFTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
    private DefaultTableModel tabla;
    private ConexionSQLite conexion;
    private String genero;
    private String titulo;
}
