package proyecto_hospital;
import java.util.LinkedHashMap;
public class Interface_REG extends javax.swing.JFrame {
    private LinkedHashMap<String,Medico> ListaDMedicos;
    public Interface_REG(LinkedHashMap ListaDMedicos) {
        this.ListaDMedicos=ListaDMedicos;
        initComponents();
    }

    private Interface_REG() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Encabezado = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TT_CED = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TT_NOM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TT_APE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TT_CONT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TT_NL = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CT_ESP = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        BT_REG = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        Encabezado.setBackground(new java.awt.Color(0, 102, 102));
        Encabezado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO DE DOCTOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 3, 24), new java.awt.Color(255, 204, 0))); // NOI18N
        Encabezado.setForeground(new java.awt.Color(102, 0, 102));
        Encabezado.setPreferredSize(new java.awt.Dimension(400, 30));

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Encabezado, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel6.setBackground(new java.awt.Color(153, 255, 153));
        jPanel6.setLayout(new java.awt.GridLayout(6, 2, 30, 30));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cedula");
        jPanel6.add(jLabel3);

        TT_CED.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        jPanel6.add(TT_CED);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre");
        jPanel6.add(jLabel4);

        TT_NOM.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        jPanel6.add(TT_NOM);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Apellido");
        jPanel6.add(jLabel5);

        TT_APE.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        jPanel6.add(TT_APE);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contacto");
        jPanel6.add(jLabel6);

        TT_CONT.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        jPanel6.add(TT_CONT);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NLicencia");
        jPanel6.add(jLabel7);

        TT_NL.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        jPanel6.add(TT_NL);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Especialidad");
        jPanel6.add(jLabel8);

        CT_ESP.setFont(new java.awt.Font("Tw Cen MT", 2, 24)); // NOI18N
        CT_ESP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERAL", "CARDIOLOGIA", "GASTROENTEROLOGIA", "DERMATOLOGIA", "PEDIATRIA", "RADIOLOGIA", "TRAUMATOLOGIA" }));
        jPanel6.add(CT_ESP);

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(498, 30));

        BT_REG.setBackground(new java.awt.Color(0, 255, 204));
        BT_REG.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        BT_REG.setText("REGISTRAR");
        BT_REG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_REGActionPerformed(evt);
            }
        });
        jPanel5.add(BT_REG);

        jPanel1.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void BT_REGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_REGActionPerformed
        String NroLIC = TT_NL.getText();
        if ((!ListaDMedicos.containsKey(NroLIC))){
            ListaDMedicos.put(NroLIC, new Medico(TT_CED.getText(),TT_NOM.getText(),TT_APE.getText(),TT_CONT.getText(),NroLIC,CT_ESP.getSelectedItem().toString()));
        }
        Limpiar();
    }//GEN-LAST:event_BT_REGActionPerformed
    public void Limpiar(){
        TT_CED.setText("");
        TT_NOM.setText("");
        TT_APE.setText("");
        TT_CONT.setText("");
        TT_NL.setText("");
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_REG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_REG;
    private javax.swing.JComboBox<String> CT_ESP;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JTextField TT_APE;
    private javax.swing.JTextField TT_CED;
    private javax.swing.JTextField TT_CONT;
    private javax.swing.JTextField TT_NL;
    private javax.swing.JTextField TT_NOM;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
