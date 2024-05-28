package Medicinas;

import Medicinas.ALMACENAMIENTO_CLIENTES;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {
    public Menu(Almacenamiento_Medicinas MEDICINAS, ALMACENAMIENTO_CLIENTES CLIENTES,Almacenamiento_Medicinas FAC) {
        this.MEDICINAS = MEDICINAS;
        this.FACTURA=FAC;
        this.CLIENTES = CLIENTES;
        initComponents();
    }

    private Menu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TT_USUARIO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        INGRESO = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TT_PASSWORD = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(4, 50, 91));
        jPanel3.setPreferredSize(new java.awt.Dimension(700, 350));

        jPanel4.setBackground(new java.awt.Color(1, 90, 149));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("USUARIO:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 63, -1, -1));

        TT_USUARIO.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel4.add(TT_USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 170, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("BIENVENIDO ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("CONTRASEÑA:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 109, -1, -1));

        INGRESO.setBackground(new java.awt.Color(3, 133, 135));
        INGRESO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        INGRESO.setForeground(new java.awt.Color(242, 242, 242));
        INGRESO.setText("INGRESAR");
        INGRESO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESOActionPerformed(evt);
            }
        });
        jPanel4.add(INGRESO, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        jButton2.setBackground(new java.awt.Color(3, 133, 135));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(242, 242, 242));
        jButton2.setText("No tengo cuenta");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));
        jPanel4.add(TT_PASSWORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 170, 30));

        jPanel5.setBackground(new java.awt.Color(7, 31, 64));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(243, 206, 80));
        jLabel2.setText("Farmacias \"Doctoñito\"");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel2)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CreacionCliente a = new CreacionCliente(CLIENTES);
        a.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        //a.setExtendedState(JFrame.MAXIMIZED_BOTH);
        a.setTitle("Regístrate");
        a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void INGRESOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESOActionPerformed
        boolean administracion = false;
        boolean usuario = false;
        if(TT_USUARIO.getText().length()<13 &&Utilidades.PasswordToString(TT_PASSWORD).length()<8)
        {
            String Usuario = Utilidades.rellenarEspacios(TT_USUARIO.getText(),13);
            String Contrasena = Utilidades.rellenarEspacios(Utilidades.PasswordToString(TT_PASSWORD),8);           
            administracion = comprobadmin(TT_USUARIO.getText(),new String(TT_PASSWORD.getPassword()));
            usuario=CLIENTES.ComprobarPassWord(Usuario, Contrasena);
            if (administracion)
            {
                Ingreso_Productos a = new Ingreso_Productos(MEDICINAS,CLIENTES);
                a.setTitle("Administracion");
                a.setVisible(true);
                a.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                a.setExtendedState(JFrame.MAXIMIZED_BOTH);
                Setear();
            }
            else if(usuario){
                Consulta a = new Consulta(CLIENTES,MEDICINAS,Usuario,FACTURA);
                a.setTitle("CLIENTE");
                a.setVisible(true);
                a.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                a.setExtendedState(JFrame.MAXIMIZED_BOTH);
                Setear();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Uusario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }  
        else
        {
            JOptionPane.showMessageDialog(this,"Demasiados caracteres", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_INGRESOActionPerformed
    public boolean comprobadmin(String Usuario, String Contrasena)
    {
        if("Admin".equals(Usuario) && "123".equals(Contrasena)){
            return true;
        }
        return false;
    }
    public void Setear(){
        TT_USUARIO.setText("");
        TT_PASSWORD.setText("");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton INGRESO;
    private javax.swing.JPasswordField TT_PASSWORD;
    private javax.swing.JTextField TT_USUARIO;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
    private Almacenamiento_Medicinas MEDICINAS;
    private Almacenamiento_Medicinas FACTURA;
    private ALMACENAMIENTO_CLIENTES CLIENTES;
}
