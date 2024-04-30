package proyecto_hospital;
import java.util.LinkedHashMap;
public class Interface_Paciente extends javax.swing.JFrame {
    private LinkedHashMap<String,Medico> ListaDeMedicos;
    private LinkedHashMap<String,Paciente> ListaDePacientes;
    public Interface_Paciente(LinkedHashMap ListaDeMedicos,LinkedHashMap ListaDePacientes) {
        this.ListaDeMedicos=ListaDeMedicos;
        this.ListaDePacientes=ListaDePacientes;
        initComponents();
    }

    private Interface_Paciente() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BT_GFM = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Encabezado = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel5.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, java.awt.BorderLayout.LINE_START);

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setLayout(new java.awt.GridLayout(3, 1));

        jLabel1.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido");
        jPanel6.add(jLabel1);

        BT_GFM.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        BT_GFM.setText("Generar Ficha Medica");
        BT_GFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_GFMActionPerformed(evt);
            }
        });
        jPanel6.add(BT_GFM);

        jButton2.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jButton2.setText("Consultar Fichas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2);

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        Encabezado.setBackground(new java.awt.Color(102, 0, 0));
        Encabezado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENU DE PACIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 3, 18), new java.awt.Color(255, 204, 0))); // NOI18N
        Encabezado.setForeground(new java.awt.Color(102, 0, 102));
        Encabezado.setPreferredSize(new java.awt.Dimension(400, 30));

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Encabezado, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(102, 0, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(498, 30));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_GFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_GFMActionPerformed
        Interfaz_Ficha a = new Interfaz_Ficha(ListaDeMedicos,ListaDePacientes);
        a.setTitle("Creacion de fichas medicas");
        a.setVisible(true);
    }//GEN-LAST:event_BT_GFMActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Interfaz_ConFichas b = new Interfaz_ConFichas(ListaDePacientes);
        b.setTitle("Consulta de Fichas");
        b.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_GFM;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
