/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ajin9raw;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DELL
 */
public class DeleteReservation extends javax.swing.JFrame {
String name1;

    public void setName1(String name) {
        this.name1 = name;
    }
   
//fonction pour remplir le tableau
    public DeleteReservation() {
        initComponents();
        loadData();
    }

     public void loadData(){
      try {
                DefaultTableModel model = new DefaultTableModel(new String[]{"idReservation", "label", "brand", "fullname", "periode","date de reservation","Etat"}, 0);
                String query="select * from projet_jaa.reservation where fullname=?";
                PreparedStatement ps= connexionDb.getConnection().prepareStatement(query);
                ps.setString(1, login.name);

                table.setModel(model);


                ResultSet rs = ps.executeQuery();
                String f, l,e, a,b,c;
                int i;
                while(rs.next()){
                        i= rs.getInt("idreservation");
                        f = rs.getString("nomArticle");
                        l = rs.getString("brandArticle");
                        e = rs.getString("dateReserve");
                        a=rs.getString("periodeReserve");
                        b=rs.getString("fullname");
                        c=rs.getString("etat");
                   model.addRow(new Object[]{i,f,l,b, e,a,c});
       }
     }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
     }   
                
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        idReserv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        femer = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        scrole = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        label = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 255, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setAlignmentX(40.0F);
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kGradientPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 180, 10));

        kGradientPanel4.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel4.setkStartColor(new java.awt.Color(51, 255, 255));

        jLabel7.setFont(new java.awt.Font("Kalam", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Search Article");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 190, 50));

        kGradientPanel3.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel3.setkStartColor(new java.awt.Color(51, 255, 255));

        jLabel9.setFont(new java.awt.Font("Kalam", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Reserve Article");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kGradientPanel1.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 190, 200, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idReserv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idReserv.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        idReserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idReservActionPerformed(evt);
            }
        });
        jPanel4.add(idReserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 260, 40));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Label Article:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, -1));

        jLabel1.setFont(new java.awt.Font("Kalam", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Delete Reservation");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Kalam", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("IdReservation");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, -1));

        femer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        femer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        femer.setText("X");
        femer.setPreferredSize(new java.awt.Dimension(20, 20));
        femer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                femerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                femerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                femerMouseExited(evt);
            }
        });
        jPanel4.add(femer, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        min.setBackground(new java.awt.Color(255, 255, 255));
        min.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        min.setText("-");
        min.setOpaque(true);
        min.setPreferredSize(new java.awt.Dimension(17, 17));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minMouseExited(evt);
            }
        });
        jPanel4.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        scrole.setViewportView(table);

        jPanel4.add(scrole, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 530, 240));

        label.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelActionPerformed(evt);
            }
        });
        jPanel4.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 260, 40));

        kGradientPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 540, 450));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setAlignmentX(40.0F);
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kGradientPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 190, 10));

        jLabel10.setFont(new java.awt.Font("Kalam", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_logout_rounded_left_24px_1.png"))); // NOI18N
        jLabel10.setText("Logout");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 110, -1));

        kGradientPanel5.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel5.setkStartColor(new java.awt.Color(51, 255, 255));

        jLabel12.setFont(new java.awt.Font("Kalam", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Delete Resevation");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, 50));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setAlignmentX(40.0F);
        jSeparator3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kGradientPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 180, 90));

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 730, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
       DeleteReservation acc=new DeleteReservation();
        acc.setVisible(true);
        this.dispose();
        acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        premier_page acc=new premier_page();
        acc.setVisible(true);
        this.dispose();
        acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel10MouseClicked
//testde 
    private boolean testField() {
    return (idReserv.getText().isEmpty() || idReserv.getText().isEmpty())
            ;}
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        Utilisateur_home acc=new Utilisateur_home();
        acc.setVisible(true);
        this.dispose();
        acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Utilisateur_home acc=new Utilisateur_home();
        acc.setVisible(true);
        this.dispose();
        acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void femerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_femerMouseClicked
     System.exit(0);
    }//GEN-LAST:event_femerMouseClicked

    private void femerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_femerMouseEntered
        Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.red);
        femer.setBorder(borderLabel);
        femer.setForeground(Color.red);
    }//GEN-LAST:event_femerMouseEntered

    private void femerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_femerMouseExited
      Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        femer.setBorder(borderLabel);
        femer.setForeground(Color.black);
        
    }//GEN-LAST:event_femerMouseExited

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseEntered
        Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.blue);
        min.setBorder(borderLabel);
        min.setBackground(Color.blue);
        min.setForeground(Color.white);
    }//GEN-LAST:event_minMouseEntered

    private void minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseExited
        Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        min.setBorder(borderLabel);
        min.setBackground(Color.white);
        min.setForeground(Color.black);
    }//GEN-LAST:event_minMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int notFound = 0;
        if(testField()){
            JOptionPane.showMessageDialog(null, "remplir les champs", "Arctile", JOptionPane.ERROR_MESSAGE);
            // affich.setText( "Remplir les champs");
            //affich.setForeground(Color.red);
        } else{

            String vnom=label.getText();
            int vid=Integer.parseInt(idReserv.getText());

            PreparedStatement pr ;

            try{
                
                    String sql = "SELECT * FROM projet_jaa.reservation WHERE idreservation=? AND nomArticle=? and etat=?";
                    //String sql = "SELECT * FROM projet_jaa.reservation WHERE idreservation=? ";
                    pr=connexionDb.getConnection().prepareStatement(sql);
                    pr.setInt(1,vid);
                    pr.setString(2, vnom);
                    pr.setString(3, "acceptée");
                    ResultSet rs = pr.executeQuery();

                    while(rs.next()){
                        //String nov=rs.getString("nomArticle");
                        //String nB=rs.getString("brandArticle");
                        // if(varticle.equalsIgnoreCase(nov) && vbrand.equalsIgnoreCase(nB)){
                            notFound = 1;
                            String query="UPDATE  projet_jaa.reservation SET etat=?  where idreservation=?";

                            pr=connexionDb.getConnection().prepareStatement(query);
                            pr.setString(1, "annulée");
                            pr.setInt(2, vid);
                            pr.executeUpdate();

                             loadData();
                            JOptionPane.showMessageDialog(null, "The reservation has been successfully canceled ", "successfull",JOptionPane.PLAIN_MESSAGE);
                            //}
                    }
                    if(notFound == 0){
                        JOptionPane.showMessageDialog(new JFrame(), "invalid Information ", "Dialog",
                            JOptionPane.ERROR_MESSAGE);
                    }
                

            }
            catch(Exception e){
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                //affich.setText( "Error in the server try next time");
                //affich.setForeground(Color.blue);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void idReservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idReservActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idReservActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
                DefaultTableModel model = (DefaultTableModel) table.getModel();
        if(evt.getButton()==MouseEvent.BUTTON1){
            int indice=table.getSelectedRow();
            if(indice!=-1){
                idReserv.setText(model.getValueAt(indice, 0).toString());
                label.setText(model.getValueAt(indice, 1).toString());
//                String name=model.getValueAt(indice, 3).toString();
            }
        }
        else if(evt.getButton()==MouseEvent.BUTTON3){
            vider();
            table.clearSelection();
        }
    }//GEN-LAST:event_tableMouseClicked

    private void labelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DeleteReservation DeleteReservation= new DeleteReservation();
               DeleteReservation.loadData();
               DeleteReservation.setVisible(true);
             DeleteReservation.setLocationRelativeTo(null);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel femer;
    private javax.swing.JTextField idReserv;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private javax.swing.JTextField label;
    private javax.swing.JLabel min;
    private javax.swing.JScrollPane scrole;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void vider() {
        label.setText("");
        idReserv.setText("");
    }
}
