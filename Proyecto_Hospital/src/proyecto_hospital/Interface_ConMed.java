package proyecto_hospital;
import java.util.LinkedHashMap;
import javax.swing.table.DefaultTableModel;
public class Interface_ConMed extends javax.swing.JFrame {
    private DefaultTableModel BXP=new DefaultTableModel();
    private LinkedHashMap<String,Medico> ListaDMedicos;
    public Interface_ConMed(LinkedHashMap ListaDMedicos) {
        this.ListaDMedicos = ListaDMedicos;
        initComponents();
        String ids [] = {"CEDULA","NOMBRE","APELLIDO","NROLICENCIA","ESPECIALIDAD"};
        BXP.setColumnIdentifiers(ids);
        TL_DOC.setModel(BXP);
    }

    private Interface_ConMed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Encabezado = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TT_CONSULTAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TL_DOC = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new java.awt.BorderLayout());

        Encabezado.setBackground(new java.awt.Color(102, 0, 0));
        Encabezado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTA DE DOCTORES\n", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 3, 18), new java.awt.Color(255, 204, 0))); // NOI18N
        Encabezado.setForeground(new java.awt.Color(102, 0, 102));
        Encabezado.setPreferredSize(new java.awt.Dimension(400, 30));

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Encabezado, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 30));

        TT_CONSULTAR.setBackground(new java.awt.Color(153, 0, 0));
        TT_CONSULTAR.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        TT_CONSULTAR.setText("Consultar");
        TT_CONSULTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TT_CONSULTARActionPerformed(evt);
            }
        });
        jPanel2.add(TT_CONSULTAR);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jScrollPane1.setBackground(new java.awt.Color(255, 102, 102));

        TL_DOC.setBackground(new java.awt.Color(255, 153, 153));
        TL_DOC.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TL_DOC);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TT_CONSULTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TT_CONSULTARActionPerformed
        for(Medico Medicos: ListaDMedicos.values()){
            BXP.addRow(new Object[]{Medicos.getCedula(),Medicos.getNombre(),Medicos.getApellido(),Medicos.getNLicencia(),Medicos.getEspecialidad()});
        }
    }//GEN-LAST:event_TT_CONSULTARActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_ConMed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabezado;
    private javax.swing.JTable TL_DOC;
    private javax.swing.JButton TT_CONSULTAR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
