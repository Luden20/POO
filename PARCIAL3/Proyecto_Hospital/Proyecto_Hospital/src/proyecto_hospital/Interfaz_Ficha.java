package proyecto_hospital;
import java.util.LinkedHashMap;
import javax.swing.DefaultComboBoxModel;
public class Interfaz_Ficha extends javax.swing.JFrame {
    private LinkedHashMap<String,Medico> ListaDMedicos;
    private LinkedHashMap<String,Paciente> ListaDPacientes;
    public Interfaz_Ficha(LinkedHashMap ListaDMedicos, LinkedHashMap ListaDPacientes) {
        this.ListaDMedicos=ListaDMedicos;
        this.ListaDPacientes=ListaDPacientes;
        initComponents();
    }
    private Interfaz_Ficha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Encabezado = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        BT_REG = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BT_DOC = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        BT_PACIENTE = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        BT_ACTUAL = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        TT_NRO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TT_MAL = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TT_MEDI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TT_EXAMENES = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TT_FECHA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TT_DIAG = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        Encabezado.setBackground(new java.awt.Color(0, 102, 102));
        Encabezado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CREACION DE REGISTRO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 3, 18), new java.awt.Color(255, 204, 0))); // NOI18N
        Encabezado.setForeground(new java.awt.Color(102, 0, 102));
        Encabezado.setPreferredSize(new java.awt.Dimension(400, 30));

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Encabezado, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setPreferredSize(new java.awt.Dimension(498, 30));

        BT_REG.setBackground(new java.awt.Color(0, 255, 204));
        BT_REG.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        BT_REG.setText("REGISTRAR");
        BT_REG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_REGActionPerformed(evt);
            }
        });
        jPanel7.add(BT_REG);

        jPanel1.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel4.setBackground(new java.awt.Color(51, 255, 204));
        jPanel4.setLayout(new java.awt.GridLayout(3, 2));

        jLabel1.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel1.setText("Doctor Encargado");
        jPanel4.add(jLabel1);

        BT_DOC.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        BT_DOC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija" }));
        BT_DOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_DOCActionPerformed(evt);
            }
        });
        jPanel4.add(BT_DOC);

        jLabel2.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel2.setText("Paciente");
        jPanel4.add(jLabel2);

        BT_PACIENTE.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        BT_PACIENTE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jPanel4.add(BT_PACIENTE);

        jButton1.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jButton1.setText("Crear Paciente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);

        BT_ACTUAL.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        BT_ACTUAL.setText("Actualizar Datos");
        BT_ACTUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ACTUALActionPerformed(evt);
            }
        });
        jPanel4.add(BT_ACTUAL);

        jPanel6.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(51, 255, 204));
        jPanel5.setLayout(new java.awt.GridLayout(6, 2));

        jLabel8.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nro de Consulta");
        jPanel5.add(jLabel8);

        TT_NRO.setFont(new java.awt.Font("Bell MT", 2, 12)); // NOI18N
        jPanel5.add(TT_NRO);

        jLabel3.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Motivo");
        jPanel5.add(jLabel3);

        TT_MAL.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        jPanel5.add(TT_MAL);

        jLabel4.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Medicamentos");
        jPanel5.add(jLabel4);

        TT_MEDI.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        jPanel5.add(TT_MEDI);

        jLabel5.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Examenes Realizados");
        jPanel5.add(jLabel5);

        TT_EXAMENES.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        jPanel5.add(TT_EXAMENES);

        jLabel6.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fecha de inicio de enfermedad");
        jPanel5.add(jLabel6);

        TT_FECHA.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        jPanel5.add(TT_FECHA);

        jLabel7.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Diagnostico");
        jPanel5.add(jLabel7);
        jPanel5.add(TT_DIAG);

        jPanel6.add(jPanel5);

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_REGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_REGActionPerformed
        Ficha_Medica J = null;
        Medico Doctor = ListaDMedicos.get(BT_DOC.getSelectedItem().toString());
        J = new Ficha_Medica(TT_NRO.getText(),TT_MAL.getText(),TT_MEDI.getText(),TT_EXAMENES.getText(),TT_FECHA.getText(),TT_DIAG.getText(),Doctor);
        for (Paciente Interno:ListaDPacientes.values()){
            if (Interno.getNroPaciente()==BT_PACIENTE.getSelectedItem().toString()){
                Interno.IngresoRegistro(J);
            }
        }
        Limpiar();
    }//GEN-LAST:event_BT_REGActionPerformed

    public void Limpiar(){
        TT_NRO.setText("");
        TT_MAL.setText("");
        TT_MEDI.setText("");
        TT_EXAMENES.setText("");
        TT_FECHA.setText("");
        TT_DIAG.setText("");
    }
    private void BT_ACTUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ACTUALActionPerformed
        String[] Medicos = new String[ListaDMedicos.size()];
        int i=0;
        for (Medico Doctor:ListaDMedicos.values()) 
        {
            Medicos[i++] = Doctor.getNLicencia();
        }
    
        BT_DOC.setModel(new DefaultComboBoxModel<>(Medicos));
        String[] Pacientes = new String[ListaDPacientes.size()];
        int j=0;
        for (Paciente Internos:ListaDPacientes.values()) 
        {
            Pacientes[j++] = Internos.getNroPaciente() ;
        }
    
        BT_PACIENTE.setModel(new DefaultComboBoxModel<>(Pacientes));

    }//GEN-LAST:event_BT_ACTUALActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Interfaz_RegPac a = new Interfaz_RegPac(ListaDPacientes);
        a.setTitle("Registro de Pacientes");
        a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BT_DOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_DOCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_DOCActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Ficha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_ACTUAL;
    private javax.swing.JComboBox<String> BT_DOC;
    private javax.swing.JComboBox<String> BT_PACIENTE;
    private javax.swing.JButton BT_REG;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JTextField TT_DIAG;
    private javax.swing.JTextField TT_EXAMENES;
    private javax.swing.JTextField TT_FECHA;
    private javax.swing.JTextField TT_MAL;
    private javax.swing.JTextField TT_MEDI;
    private javax.swing.JTextField TT_NRO;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
