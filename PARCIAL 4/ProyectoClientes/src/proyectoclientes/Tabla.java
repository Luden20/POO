/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoclientes;

import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author polip
 */
public class Tabla extends javax.swing.JFrame {

    /**
     * Creates new form Tabla
     */
    public Tabla() {
        initComponents();
        T =new DefaultTableModel();
        jTable1.setModel(T);
        Base="SELECT T.name as Cancion,\n" +
        "at.name AS Artista,\n" +
        "a.title AS Album \n" +
        "FROM tracks t \n" +
        "INNER JOIN albums a \n" +
        "ON t.AlbumId=a.AlbumId \n" +
        "INNER JOIN artists at \n" +
        "ON at.ArtistId=a.ArtistId ";
        //db=new ConexionSQLite("D:/Universidad/POO/Bases de Datos SQLite/chinook.db");
        db=new ConexionSQLite("D:\\Universidad\\4to Sync\\POO\\POO\\Bases de Datos SQLite\\chinook.db");
        Comando=Base+";";
        Mostrar.setText(Comando);
        Actualizar();
        
        db.MostrarTabla(Comando, T);
        Filtro="Cancion";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buscador = new javax.swing.JTextField();
        filtro = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        artista = new javax.swing.JComboBox<>();
        JBAlbum = new javax.swing.JButton();
        CBPlaylist = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        CBTop = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CBGen = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TFArtist = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        CBInsertAlbum = new javax.swing.JComboBox<>();
        JBIngresoAlbum = new javax.swing.JButton();
        TFNombreAlbum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TFTrackNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CBTrackAlbum = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        CBTrackGenero = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        TFTrackComposer = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ButttonTrack = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        TFPlaylist = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        CDPlaylistAlbum = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        CBPlaylistTrack = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ButttonTrack1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        CBPlaylistSelected = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        CBPlaylistArtista = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        CBDeletePlaylist = new javax.swing.JComboBox<>();
        JBIngresoAlbum1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setMaximumSize(new java.awt.Dimension(100, 100));

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
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setMaximumSize(new java.awt.Dimension(100, 80));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 57, 1127, 316));

        buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorActionPerformed(evt);
            }
        });
        getContentPane().add(buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 22, 223, -1));

        filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "Nombre", "Apellido", "Ciudad" }));
        filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroActionPerformed(evt);
            }
        });
        getContentPane().add(filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 22, -1, -1));

        jButton1.setText("Ver todo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1071, 22, -1, -1));

        artista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        artista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistaActionPerformed(evt);
            }
        });
        getContentPane().add(artista, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 22, -1, -1));

        JBAlbum.setText("Ver Numero de Albumes");
        JBAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlbumActionPerformed(evt);
            }
        });
        getContentPane().add(JBAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 385, -1, -1));

        CBPlaylist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPlaylistActionPerformed(evt);
            }
        });
        getContentPane().add(CBPlaylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, -1, -1));

        jLabel1.setText("Ver Playlists");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        CBTop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "5", "10", "20", "50", "100" }));
        CBTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTopActionPerformed(evt);
            }
        });
        getContentPane().add(CBTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        jLabel2.setText("Top Canciones en Playlist");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel3.setText("Top Generos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        CBGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "5", "10" }));
        CBGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBGenActionPerformed(evt);
            }
        });
        getContentPane().add(CBGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Ingreso de Artista");

        TFArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFArtistActionPerformed(evt);
            }
        });

        jButton2.setText("Ingresar Artista");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(TFArtist, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFArtist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 240, 180));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Ingreso de Album");

        CBInsertAlbum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBInsertAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBInsertAlbumActionPerformed(evt);
            }
        });

        JBIngresoAlbum.setText("Ingresar Album");
        JBIngresoAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBIngresoAlbumActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombre");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(JBIngresoAlbum)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(TFNombreAlbum))
                    .addComponent(CBInsertAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBInsertAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFNombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(JBIngresoAlbum)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, 270, 180));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TFTrackNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFTrackNombreActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre");

        CBTrackAlbum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBTrackAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTrackAlbumActionPerformed(evt);
            }
        });

        jLabel9.setText("Album");

        CBTrackGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Genero");

        jLabel11.setText("Compositor");

        ButttonTrack.setText("Ingresar");
        ButttonTrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButttonTrackActionPerformed(evt);
            }
        });

        jLabel12.setText("Ingreso de Canciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBTrackAlbum, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBTrackGenero, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TFTrackNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TFTrackComposer)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ButttonTrack)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel12)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFTrackNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBTrackAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBTrackGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFTrackComposer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(ButttonTrack)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 470, 250, 220));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setText("Crear Playlist");

        TFPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFPlaylistActionPerformed(evt);
            }
        });

        jButton4.setText("Crear Playlist");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel21.setText("Nombre");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(TFPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(35, 35, 35))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(TFPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 680, 240, 210));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CDPlaylistAlbum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CDPlaylistAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDPlaylistAlbumActionPerformed(evt);
            }
        });

        jLabel14.setText("Album");

        CBPlaylistTrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPlaylistTrackActionPerformed(evt);
            }
        });

        jLabel15.setText("Cancion");

        jLabel16.setText("Playlist");

        ButttonTrack1.setText("Ingresar");
        ButttonTrack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButttonTrack1ActionPerformed(evt);
            }
        });

        jLabel17.setText("Agregar Cancion a Playlist");

        jLabel13.setText("Artista");

        CBPlaylistArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPlaylistArtistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBPlaylistTrack, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBPlaylistSelected, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(ButttonTrack1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel17)
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CDPlaylistAlbum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBPlaylistArtista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel17)
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(CBPlaylistArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(CDPlaylistAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBPlaylistTrack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(CBPlaylistSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButttonTrack1)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 700, -1, -1));

        Mostrar.setColumns(20);
        Mostrar.setRows(5);
        jScrollPane2.setViewportView(Mostrar);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setText("Borrar Playlist");

        CBDeletePlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBDeletePlaylistActionPerformed(evt);
            }
        });

        JBIngresoAlbum1.setText("Borrar");
        JBIngresoAlbum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBIngresoAlbum1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBIngresoAlbum1)
                .addGap(75, 75, 75))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(CBDeletePlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBDeletePlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBIngresoAlbum1)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroActionPerformed
        // TODO add your handling code here:
        Filtro=filtro.getSelectedItem().toString();
    }//GEN-LAST:event_filtroActionPerformed

    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed
        // TODO add your handling code here:
        Buscador=buscador.getText().toString();
        Comando=Base+" WHERE "+Filtro+" LIKE '%"+Buscador+"%';";
        Mostrar.setText(Comando);
        db.MostrarTabla(Comando, T);
    }//GEN-LAST:event_buscadorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Comando=Base;
        Mostrar.setText(Comando);
        db.MostrarTabla(Comando, T);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void artistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistaActionPerformed
        // TODO add your handling code here:
        int ide=db.getID("SELECT ArtistId FROM artists WHERE name LIKE '"+artista.getSelectedItem().toString()+"';");
        //ID.setText(""+ide);
        //Comando="SELECT * FROM tracks WHERE AlbumID ="+ide+";";
        Comando=Base+"WHERE Artista LIKE '"+artista.getSelectedItem().toString()+"' ;";
        Mostrar.setText(Comando);
        db.MostrarTabla(Comando, T);
    }//GEN-LAST:event_artistaActionPerformed

    private void JBAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlbumActionPerformed
        // TODO add your handling code here:
        Comando="SELECT a.Name as Artista,COUNT(a.Name) as Numero_de_Albunes FROM Artists a INNER JOIN Albums b ON a.ArtistId=b.ArtistId Group BY a.name ORDER BY COUNT(a.Name) DESC;";
        Mostrar.setText(Comando);
        db.MostrarTabla(Comando, T);
    }//GEN-LAST:event_JBAlbumActionPerformed

    private void CBPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPlaylistActionPerformed
        // TODO add your handling code here:
        String busqueda = CBPlaylist.getSelectedItem().toString();
        Comando="SELECT T.name as Cancion, at.name AS Artista, a.title AS Album FROM tracks t INNER JOIN playlist_track pt ON t.TrackID=pt.TrackId INNER JOIN playlists p ON pt.PlaylistId=p.PlaylistId INNER JOIN albums a ON t.AlbumId=a.AlbumId INNER JOIN artists at ON at.ArtistId=a.ArtistId WHERE p.Name Like '%" + busqueda + "%' GROUP BY T.name ORDER BY at.name;";
        Mostrar.setText(Comando);
        db.MostrarTabla(Comando, T);
    }//GEN-LAST:event_CBPlaylistActionPerformed

    private void CBTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTopActionPerformed
        // TODO add your handling code here:
        String top = CBTop.getSelectedItem().toString();
        Comando = "SELECT (SELECT Name FROM TRACKS WHERE TRACKS.TrackId = PLAYLIST_TRACK.TrackId) AS Name, COUNT(TrackId) AS PlayCount FROM PLAYLIST_TRACK GROUP BY TrackId ORDER BY PlayCount DESC LIMIT " + top + ";";
        Mostrar.setText(Comando);
        db.MostrarTabla(Comando, T);
    }//GEN-LAST:event_CBTopActionPerformed

    private void CBGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBGenActionPerformed
        // TODO add your handling code here:
        String gen = CBGen.getSelectedItem().toString();
        Comando = "select g.name as Genero, count(t.GenreId) as Numero_de_Canciones from tracks t inner join genres g on g.GenreId = t.GenreId group by t.GenreId order by Numero_de_Canciones DESC LIMIT " +  gen + ";";
        Mostrar.setText(Comando);
        db.MostrarTabla(Comando, T);
    }//GEN-LAST:event_CBGenActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Comando="insert into artists(Name) Values('"+ TFArtist.getText().toString() +"');";
        db.Instruccion(Comando);
        Mostrar.setText(Comando);
          Actualizar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TFArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFArtistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFArtistActionPerformed

    private void CBInsertAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBInsertAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBInsertAlbumActionPerformed

    private void JBIngresoAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngresoAlbumActionPerformed
        // TODO add your handling code here:
        String artSel = CBInsertAlbum.getSelectedItem().toString();
        String nomAlbum = TFNombreAlbum.getText();
        int id = db.getID("SELECT ArtistId FROM artists where Name ='" + artSel + "';");
        String sid = id + "";
        Comando="INSERT INTO albums (Title,ArtistId)VALUES('" + nomAlbum + "','" + sid + "');";
        db.Instruccion(Comando);
        Mostrar.setText(Comando);
          Actualizar();
    }//GEN-LAST:event_JBIngresoAlbumActionPerformed

    private void TFTrackNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFTrackNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFTrackNombreActionPerformed

    private void ButttonTrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButttonTrackActionPerformed
        // TODO add your handling code here:
        String trackname = TFTrackNombre.getText();
        String trackcomposer = TFTrackComposer.getText();
        String trackgenero = CBTrackGenero.getSelectedItem().toString();
        String trackalbum = CBTrackAlbum.getSelectedItem().toString();
        String idgenero = "" + db.getID("SELECT GenreId FROM genres where Name ='" + trackgenero + "';");
        String idalbum = "" + db.getID("SELECT AlbumID FROM albums where Title ='" + trackalbum + "';");
        
        Comando="insert into tracks(Name,AlbumId,MediaTypeId,GenreId,Composer,Milliseconds,Bytes,UnitPrice) Values('" + trackname + "'," + idalbum + ",1," + idgenero + ",'" + trackcomposer + "',100,100,100);";
        db.Instruccion(Comando);
        Mostrar.setText(Comando);
          Actualizar();
    }//GEN-LAST:event_ButttonTrackActionPerformed

    private void CBTrackAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTrackAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBTrackAlbumActionPerformed

    private void TFPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPlaylistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPlaylistActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Comando=("INSERT INTO playlists(Name) VALUES('"+TFPlaylist.getText()+"');");
        db.Instruccion(Comando);
        Mostrar.setText(Comando);
          Actualizar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CDPlaylistAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDPlaylistAlbumActionPerformed
       CBPlaylistTrack.setModel(db.ListadoComplejo("SELECT t.Name FROM tracks t INNER JOIN albums a on t.AlbumId=a.AlbumId WHERE a.Title ='"+CDPlaylistAlbum.getSelectedItem().toString()+"';"));
    }//GEN-LAST:event_CDPlaylistAlbumActionPerformed

    private void ButttonTrack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButttonTrack1ActionPerformed
        // TODO add your handling code here:
        String Playlist =CBPlaylistSelected.getSelectedItem().toString();
        String PID=""+db.getID("SELECT PlaylistId from playlists where Name='"+Playlist+"';");
        String Cancion=CBPlaylistTrack.getSelectedItem().toString();
        String CID=""+db.getID("SELECT TrackId from tracks where Name='"+Cancion+"';");
        Comando=("INSERT INTO playlist_track VALUES("+PID+","+CID+");");
        db.Instruccion(Comando);
        Mostrar.setText(Comando);
        
    }//GEN-LAST:event_ButttonTrack1ActionPerformed

    private void CBPlaylistTrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPlaylistTrackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBPlaylistTrackActionPerformed

    private void CBPlaylistArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPlaylistArtistaActionPerformed
        // TODO add your handling code here:
        CDPlaylistAlbum.setModel(db.ListadoComplejo("SELECT a.Title FROM albums a INNER JOIN artists at ON a.ArtistId=at.ArtistId where at.Name='"+CBPlaylistArtista.getSelectedItem().toString()+"';"));
    }//GEN-LAST:event_CBPlaylistArtistaActionPerformed

    private void CBDeletePlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBDeletePlaylistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBDeletePlaylistActionPerformed

    private void JBIngresoAlbum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngresoAlbum1ActionPerformed
        // TODO add your handling code here:
        String Playlist=CBDeletePlaylist.getSelectedItem().toString();
        String ID=""+db.getID("SELECT playlistId from playlists where Name='"+Playlist+"';");
        Comando="DELETE FROM playlist_track where PlaylistId="+ID+" ;";
        String aux=" DELETE FROM playlists where PlaylistId="+ID+";";
        db.Instruccion(Comando);
        db.Instruccion(aux);
        Mostrar.setText(Comando+"\n"+aux);
        Actualizar();
    }//GEN-LAST:event_JBIngresoAlbum1ActionPerformed
    public void Actualizar()
    {
        artista.setModel(db.Listado("artists", "name"));
        filtro.setModel(db.ListadoAtributos(Base));
        CBPlaylistArtista.setModel(db.Listado("artists", "name"));
        CBInsertAlbum.setModel(db.Listado("artists", "name"));
        CBPlaylist.setModel(db.Listado("playlists", "name"));
        CBPlaylistSelected.setModel(db.Listado("playlists", "name"));
        CBTrackAlbum.setModel(db.Listado("albums", "title"));
        CBTrackGenero.setModel(db.Listado("genres","name"));
        CBDeletePlaylist.setModel(db.Listado("playlists", "name"));
        
    }
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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButttonTrack;
    private javax.swing.JButton ButttonTrack1;
    private javax.swing.JComboBox<String> CBDeletePlaylist;
    private javax.swing.JComboBox<String> CBGen;
    private javax.swing.JComboBox<String> CBInsertAlbum;
    private javax.swing.JComboBox<String> CBPlaylist;
    private javax.swing.JComboBox<String> CBPlaylistArtista;
    private javax.swing.JComboBox<String> CBPlaylistSelected;
    private javax.swing.JComboBox<String> CBPlaylistTrack;
    private javax.swing.JComboBox<String> CBTop;
    private javax.swing.JComboBox<String> CBTrackAlbum;
    private javax.swing.JComboBox<String> CBTrackGenero;
    private javax.swing.JComboBox<String> CDPlaylistAlbum;
    private javax.swing.JButton JBAlbum;
    private javax.swing.JButton JBIngresoAlbum;
    private javax.swing.JButton JBIngresoAlbum1;
    private javax.swing.JTextArea Mostrar;
    private javax.swing.JTextField TFArtist;
    private javax.swing.JTextField TFNombreAlbum;
    private javax.swing.JTextField TFPlaylist;
    private javax.swing.JTextField TFTrackComposer;
    private javax.swing.JTextField TFTrackNombre;
    private javax.swing.JComboBox<String> artista;
    private javax.swing.JTextField buscador;
    private javax.swing.JComboBox<String> filtro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel T;
    private String Filtro;
    private String Buscador;
    private String Comando;
    private String Base;
    private ConexionSQLite  db;
}
