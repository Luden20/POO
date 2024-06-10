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
        db=new ConexionSQLite("C:\\Users\\RODRIGUEZ-PC\\Documents\\GitHub\\POO\\Bases de Datos SQLite\\chinook.db");
        Comando=Base+";";
        Mostrar.setText(Comando);
        artista.setModel(db.Listado("artists", "name"));
        filtro.setModel(db.ListadoAtributos(Base));
        CBInsertAlbum.setModel(db.Listado("artists", "name"));
        CBPlaylist.setModel(db.Listado("playlists", "name"));
        CBTrackAlbum.setModel(db.Listado("albums", "title"));
        CBTrackGenero.setModel(db.Listado("genres","name"));
        
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
        Mostrar = new javax.swing.JLabel();
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

        Mostrar.setText("Mostrar");
        getContentPane().add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 485, 232, -1));

        artista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        artista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistaActionPerformed(evt);
            }
        });
        getContentPane().add(artista, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 22, -1, -1));

        JBAlbum.setText("Ver Numero de Albunes");
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
        getContentPane().add(CBPlaylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 385, -1, -1));

        jLabel1.setText("Ver Playlists");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 388, -1, -1));

        CBTop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "5", "10", "20", "50", "100" }));
        CBTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTopActionPerformed(evt);
            }
        });
        getContentPane().add(CBTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 442, -1, -1));

        jLabel2.setText("Top Canciones en Playlist");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 445, -1, -1));

        jLabel3.setText("Top Generos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 417, -1, -1));

        CBGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "5", "10" }));
        CBGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBGenActionPerformed(evt);
            }
        });
        getContentPane().add(CBGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 414, -1, -1));

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
                .addComponent(TFArtist, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
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
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 200, 130));

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
                .addContainerGap(23, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFNombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(JBIngresoAlbum)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, -1, 160));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 380, 250, 220));

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
        Comando="SELECT T.name as Cancion, at.name AS Artista, a.title AS Album, COUNT(t.name) as Repeticiones FROM tracks t INNER JOIN playlist_track pt ON t.TrackID=pt.TrackId INNER JOIN playlists p ON pt.PlaylistId=p.PlaylistId INNER JOIN albums a ON t.AlbumId=a.AlbumId INNER JOIN artists at ON at.ArtistId=a.ArtistId WHERE p.Name Like '%" + busqueda + "%' GROUP BY T.name ORDER BY at.name;";
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
        db.Instruccion("insert into artists(Name) Values('"+ TFArtist.getText().toString() +"');");
        artista.setModel(db.Listado("artists", "name"));
        
        artista.setModel(db.Listado("artists", "name"));
        filtro.setModel(db.ListadoAtributos(Base));
        CBInsertAlbum.setModel(db.Listado("artists", "name"));
        CBPlaylist.setModel(db.Listado("playlists", "name"));
        CBTrackAlbum.setModel(db.Listado("albums", "title"));
        CBTrackGenero.setModel(db.Listado("genres","name"));
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
        db.Instruccion("INSERT INTO albums (Title,ArtistId)VALUES('" + nomAlbum + "','" + sid + "');");
        
        artista.setModel(db.Listado("artists", "name"));
        filtro.setModel(db.ListadoAtributos(Base));
        CBInsertAlbum.setModel(db.Listado("artists", "name"));
        CBPlaylist.setModel(db.Listado("playlists", "name"));
        CBTrackAlbum.setModel(db.Listado("albums", "title"));
        CBTrackGenero.setModel(db.Listado("genres","name"));
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
        
        db.Instruccion("insert into tracks(Name,AlbumId,MediaTypeId,GenreId,Composer,Milliseconds,Bytes,UnitPrice) Values('" + trackname + "'," + idalbum + ",1," + idgenero + ",'" + trackcomposer + "',100,100,100);");
        
        artista.setModel(db.Listado("artists", "name"));
        filtro.setModel(db.ListadoAtributos(Base));
        CBInsertAlbum.setModel(db.Listado("artists", "name"));
        CBPlaylist.setModel(db.Listado("playlists", "name"));
        CBTrackAlbum.setModel(db.Listado("albums", "title"));
        CBTrackGenero.setModel(db.Listado("genres","name"));
    }//GEN-LAST:event_ButttonTrackActionPerformed

    private void CBTrackAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTrackAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBTrackAlbumActionPerformed

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
    private javax.swing.JComboBox<String> CBGen;
    private javax.swing.JComboBox<String> CBInsertAlbum;
    private javax.swing.JComboBox<String> CBPlaylist;
    private javax.swing.JComboBox<String> CBTop;
    private javax.swing.JComboBox<String> CBTrackAlbum;
    private javax.swing.JComboBox<String> CBTrackGenero;
    private javax.swing.JButton JBAlbum;
    private javax.swing.JButton JBIngresoAlbum;
    private javax.swing.JLabel Mostrar;
    private javax.swing.JTextField TFArtist;
    private javax.swing.JTextField TFNombreAlbum;
    private javax.swing.JTextField TFTrackComposer;
    private javax.swing.JTextField TFTrackNombre;
    private javax.swing.JComboBox<String> artista;
    private javax.swing.JTextField buscador;
    private javax.swing.JComboBox<String> filtro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel T;
    private String Filtro;
    private String Buscador;
    private String Comando;
    private String Base;
    private ConexionSQLite  db;
}
