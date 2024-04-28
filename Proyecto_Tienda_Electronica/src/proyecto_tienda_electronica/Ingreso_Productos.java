/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_tienda_electronica;
import java.util.LinkedHashMap;
import javax.swing.JOptionPane;
/*
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset; 
import org.jfree.chart.plot.PiePlot; 
import org.jfree.chart.ChartFrame;
import org.jfree.data.category.DefaultCategoryDataset;
*/

public class Ingreso_Productos extends javax.swing.JFrame {

    /**
     * Creates new form Ingreso_Productos
     */
    public Ingreso_Productos() {
        initComponents();
        Existencias = new LinkedHashMap<String, Categoria>();
        Componentes = 0;
        Consolas = 0;
        Celulares = 0;
        Computadores = 0;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Principal = new javax.swing.JPanel();
        Panel_Ingreso_Productos_Nuevos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CBCategoria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        TFCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFDescripcion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        CBCantidad = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        BotonIngresoNuevo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Panel_Ingreso_Productos_Existente = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CBCategoriaIngreso = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        CBProductoIngreso = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        CBCantidadIngreso = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        ButtonIngresoExistente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        Panel_Principal.setBackground(new java.awt.Color(102, 102, 0));
        Panel_Principal.setLayout(new javax.swing.BoxLayout(Panel_Principal, javax.swing.BoxLayout.LINE_AXIS));

        Panel_Ingreso_Productos_Nuevos.setBackground(new java.awt.Color(153, 255, 153));
        Panel_Ingreso_Productos_Nuevos.setLayout(new java.awt.GridLayout(8, 2, 5, 30));

        jLabel1.setText("Ingreso");
        Panel_Ingreso_Productos_Nuevos.add(jLabel1);

        jLabel2.setText("Productos nuevos");
        Panel_Ingreso_Productos_Nuevos.add(jLabel2);

        jLabel9.setText("Categoria");
        Panel_Ingreso_Productos_Nuevos.add(jLabel9);

        CBCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Categoria)", "Componentes", "Consolas", "Celulares", "Computadores" }));
        CBCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCategoriaActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Nuevos.add(CBCategoria);

        jLabel3.setText("Codigo");
        Panel_Ingreso_Productos_Nuevos.add(jLabel3);

        TFCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCodigoActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Nuevos.add(TFCodigo);

        jLabel4.setText("Nombre");
        Panel_Ingreso_Productos_Nuevos.add(jLabel4);
        Panel_Ingreso_Productos_Nuevos.add(TFNombre);

        jLabel5.setText("Precio");
        Panel_Ingreso_Productos_Nuevos.add(jLabel5);
        Panel_Ingreso_Productos_Nuevos.add(TFPrecio);

        jLabel6.setText("Descripcion");
        Panel_Ingreso_Productos_Nuevos.add(jLabel6);
        Panel_Ingreso_Productos_Nuevos.add(TFDescripcion);

        jLabel15.setText("Cantidad");
        Panel_Ingreso_Productos_Nuevos.add(jLabel15);

        CBCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));
        CBCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCantidadActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Nuevos.add(CBCantidad);

        jLabel16.setText(".");
        Panel_Ingreso_Productos_Nuevos.add(jLabel16);

        BotonIngresoNuevo.setText("Ingresar");
        BotonIngresoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresoNuevoActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Nuevos.add(BotonIngresoNuevo);

        Panel_Principal.add(Panel_Ingreso_Productos_Nuevos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        Panel_Principal.add(jPanel3);

        Panel_Ingreso_Productos_Existente.setBackground(new java.awt.Color(204, 255, 204));
        Panel_Ingreso_Productos_Existente.setLayout(new java.awt.GridLayout(5, 2, 10, 30));

        jLabel8.setText("Ingreso");
        Panel_Ingreso_Productos_Existente.add(jLabel8);

        jLabel10.setText("Productos existentes");
        Panel_Ingreso_Productos_Existente.add(jLabel10);

        jLabel11.setText("Categoria");
        Panel_Ingreso_Productos_Existente.add(jLabel11);

        CBCategoriaIngreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Componente)", "Componentes", "Consolas", "Celulares", "Computadores" }));
        CBCategoriaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCategoriaIngresoActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Existente.add(CBCategoriaIngreso);

        jLabel12.setText("Producto");
        Panel_Ingreso_Productos_Existente.add(jLabel12);

        CBProductoIngreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel_Ingreso_Productos_Existente.add(CBProductoIngreso);

        jLabel13.setText("Cantidad a ingresar");
        Panel_Ingreso_Productos_Existente.add(jLabel13);

        CBCantidadIngreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));
        Panel_Ingreso_Productos_Existente.add(CBCantidadIngreso);
        Panel_Ingreso_Productos_Existente.add(jLabel14);

        ButtonIngresoExistente.setText("Ingresar");
        ButtonIngresoExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIngresoExistenteActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Existente.add(ButtonIngresoExistente);

        Panel_Principal.add(Panel_Ingreso_Productos_Existente);

        getContentPane().add(Panel_Principal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBCategoriaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCategoriaIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCategoriaIngresoActionPerformed

    private void ButtonIngresoExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIngresoExistenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonIngresoExistenteActionPerformed

    private void TFCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCodigoActionPerformed

    private void BotonIngresoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresoNuevoActionPerformed
        // TODO add your handling code here:
        /**Verificar Campos Validos*/
        if (validar())
        {
            if (existe(TFCodigo.getText()))
            {
                JOptionPane.showMessageDialog(this,"El producto ya esta registrado", "Error", JOptionPane.ERROR_MESSAGE);
                reset();
            }
            else
            {
                System.out.println("Se ingresó " + new Producto(TFCodigo.getText(), TFNombre.getText(), Double.parseDouble(TFPrecio.getText()), TFDescripcion.getText(), Integer.parseInt(CBCantidad.getSelectedItem().toString())));
                Existencias.get(CBCategoria.getSelectedItem().toString()).agregarProducto(new Producto(TFCodigo.getText(), TFNombre.getText(), Double.parseDouble(TFPrecio.getText()), TFDescripcion.getText(), Integer.parseInt(CBCantidad.getSelectedItem().toString())));
                /**Actualizacion de cantidades y limpieza de campos*/
                cantidades(CBCategoria.getSelectedItem().toString());
                reset();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Ingrese bien los datos oe", "ERROR 404", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonIngresoNuevoActionPerformed

    private void CBCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCantidadActionPerformed

    private void CBCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(Ingreso_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso_Productos().setVisible(true);
            }
        });
    }
    
    public boolean validar()
    {
        return !"".equals(TFCodigo.getText())&&!"".equals(TFNombre.getText())&&!"".equals(TFPrecio.getText())&&!"".equals(TFDescripcion.getText());
    }
    
    public boolean existe(String TFCodigo)
    {
        return Existencias.containsKey(TFCodigo);
    }
    
    public void reset()
    {
        CBCategoria.setSelectedIndex(0);
        TFCodigo.setText("");
        TFNombre.setText("");
        TFPrecio.setText("");
        TFDescripcion.setText("");
        CBCantidad.setSelectedIndex(0);
    }
    
    private void cantidades (String Categoria)
    {
        switch (Categoria)
        {
            case "Componentes" -> Componentes++;
            case "Consolas" -> Consolas++;
            case "Celulares" -> Celulares++;
            case "Computadores" -> Computadores++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIngresoNuevo;
    private javax.swing.JButton ButtonIngresoExistente;
    private javax.swing.JComboBox<String> CBCantidad;
    private javax.swing.JComboBox<String> CBCantidadIngreso;
    private javax.swing.JComboBox<String> CBCategoria;
    private javax.swing.JComboBox<String> CBCategoriaIngreso;
    private javax.swing.JComboBox<String> CBProductoIngreso;
    private javax.swing.JPanel Panel_Ingreso_Productos_Existente;
    private javax.swing.JPanel Panel_Ingreso_Productos_Nuevos;
    private javax.swing.JPanel Panel_Principal;
    private javax.swing.JTextField TFCodigo;
    private javax.swing.JTextField TFDescripcion;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTextField TFPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
    private LinkedHashMap<String,Categoria>Existencias;
    private int Componentes, Consolas, Celulares, Computadores;
}
