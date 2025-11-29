
package ajin9raw;

import ajin9raw.connexionDb;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;



public class acceuilList extends javax.swing.JFrame {
    static int id_res;
  Color clikedColor=new Color(0,102,102);
    public acceuilList() {
        initComponents();
        
        loadData();
        
       
        //in the run time
        
       
        
    }

 
//fonction pour afficher les
    public void loadData(){
      try {
                 DefaultTableModel model = new DefaultTableModel(new String[]{"Id","Fullname", "Label Article", "Brand", "Date res","Periode","Etat"}, 0);
          String query="select * from projet_jaa.reservation ";
        PreparedStatement ps= connexionDb.getConnection().prepareStatement(query);
            
      
       table.setModel(model);
       
       
       ResultSet rs = ps.executeQuery();
       String f, l,e,i,a,b,c;
       while(rs.next()){
         i= rs.getString("idreservation");
         f = rs.getString("fullname");
         l = rs.getString("nomArticle");
         e = rs.getString("brandArticle");
        a= rs.getString("dateReserve");
        b = rs.getString("periodeReserve");
        c = rs.getString("etat");
       
         model.addRow(new Object[]{i,f,l, e,a,b,c});
       }
     }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
     }   
                
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        M3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        M4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        M5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        M6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        M2 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        min = new javax.swing.JLabel();
        fermer = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        etat1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkGradientFocus(300);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setOpaque(false);
        kGradientPanel1.setLayout(new java.awt.GridLayout(8, 1, 10, 4));
        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 420));

        kGradientPanel2.setkEndColor(new java.awt.Color(51, 51, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(51, 255, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 160, 70));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(8, 1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2);

        jLabel9.setBackground(new java.awt.Color(0, 102, 102));
        jLabel9.setFont(new java.awt.Font("Kalam Light", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ManageArticle");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel1.add(jLabel9);

        jLabel10.setBackground(new java.awt.Color(0, 102, 102));
        jLabel10.setFont(new java.awt.Font("Kalam Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Manage Admin");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);

        M3.setBackground(new java.awt.Color(0, 102, 102));
        M3.setOpaque(false);
        M3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                M3MousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Kalam Light", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Ordering");

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout M3Layout = new javax.swing.GroupLayout(M3);
        M3.setLayout(M3Layout);
        M3Layout.setHorizontalGroup(
            M3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(M3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        M3Layout.setVerticalGroup(
            M3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M3Layout.createSequentialGroup()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(M3);

        M4.setBackground(new java.awt.Color(0, 102, 102));
        M4.setOpaque(false);
        M4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                M4MousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Kalam Light", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Search Article");

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout M4Layout = new javax.swing.GroupLayout(M4);
        M4.setLayout(M4Layout);
        M4Layout.setHorizontalGroup(
            M4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(M4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        M4Layout.setVerticalGroup(
            M4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M4Layout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(M4);

        M5.setBackground(new java.awt.Color(102, 240, 255));
        M5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                M5MousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Kalam Light", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("booking archive");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout M5Layout = new javax.swing.GroupLayout(M5);
        M5.setLayout(M5Layout);
        M5Layout.setHorizontalGroup(
            M5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, M5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        M5Layout.setVerticalGroup(
            M5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M5Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(M5);

        M6.setBackground(new java.awt.Color(0, 102, 102));
        M6.setOpaque(false);
        M6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                M6MousePressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Kalam Light", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Materiel list on request");

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout M6Layout = new javax.swing.GroupLayout(M6);
        M6.setLayout(M6Layout);
        M6Layout.setHorizontalGroup(
            M6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(M6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        M6Layout.setVerticalGroup(
            M6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M6Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(M6);

        jLabel5.setFont(new java.awt.Font("Kalam", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_logout_rounded_left_24px_1.png"))); // NOI18N
        jLabel5.setText("Logout");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel1.add(jLabel5);

        kGradientPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 460));

        M2.setBackground(new java.awt.Color(0, 102, 102));
        M2.setOpaque(false);
        M2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                M2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                M2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout M2Layout = new javax.swing.GroupLayout(M2);
        M2.setLayout(M2Layout);
        M2Layout.setHorizontalGroup(
            M2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        M2Layout.setVerticalGroup(
            M2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        kGradientPanel2.add(M2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Kalam", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 255));
        jLabel15.setText("booking archive");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 20));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Label", "Brand", "Character", "Title 5", "Title 6", "Title 7"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 130, 510, 300));

        min.setBackground(new java.awt.Color(255, 255, 255));
        min.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        min.setText("-");
        min.setAlignmentY(0.0F);
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
        jPanel2.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, 20));

        fermer.setBackground(new java.awt.Color(255, 255, 255));
        fermer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fermer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fermer.setText("X");
        fermer.setAlignmentY(0.0F);
        fermer.setOpaque(true);
        fermer.setPreferredSize(new java.awt.Dimension(17, 17));
        fermer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fermerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fermerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fermerMouseExited(evt);
            }
        });
        jPanel2.add(fermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, -1));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Etat reservation");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Kalam", 0, 12)); // NOI18N
        jButton1.setText("OK");
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 60, 30));

        etat1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "acceptée", "annulée", "refusée" }));
        etat1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        jPanel2.add(etat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 250, 40));

        kGradientPanel2.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 530, 450));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void fermerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseClicked
        System.exit(0);
    }//GEN-LAST:event_fermerMouseClicked

    private void fermerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseEntered
        Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.red);
        fermer.setBorder(borderLabel);
        fermer.setForeground(Color.white);
        fermer.setBackground(Color.red);
    }//GEN-LAST:event_fermerMouseEntered

    private void fermerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseExited
        Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        fermer.setBorder(borderLabel);
        fermer.setForeground(Color.black);
        fermer.setBackground(Color.white);
    }//GEN-LAST:event_fermerMouseExited

    private void M2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M2MousePressed
          
    }//GEN-LAST:event_M2MousePressed

    private void M3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M3MousePressed
Ordering acc=new Ordering();
        acc.setVisible(true);
        this.dispose();
        acc.setLocationRelativeTo(null);        
    }//GEN-LAST:event_M3MousePressed

    private void M4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M4MousePressed
       
    
    }//GEN-LAST:event_M4MousePressed

    private void M5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M5MousePressed
      
    }//GEN-LAST:event_M5MousePressed

    private void M6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M6MousePressed
       
    }//GEN-LAST:event_M6MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
       
    }//GEN-LAST:event_jLabel9MousePressed

    private void M2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M2MouseEntered
         
    }//GEN-LAST:event_M2MouseEntered

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        Manage_article acc=new Manage_article();
                 acc.setVisible(true);
                  this.dispose();
                 acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        acceuilAdmin1 acc=new acceuilAdmin1();
                 acc.setVisible(true);
                  this.dispose();
                 acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void M4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M4MouseClicked
        search acc=new search();
                 acc.setVisible(true);
                  this.dispose();
                 acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_M4MouseClicked

    private void M6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M6MouseClicked
          acceuilListDem acc=new acceuilListDem();
                 acc.setVisible(true);
                  this.dispose();
                 acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_M6MouseClicked

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
         premier_page acc=new premier_page();
        acc.setVisible(true);
        this.dispose();
        acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel5MousePressed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
                DefaultTableModel model = (DefaultTableModel) table.getModel();
        if(evt.getButton()==MouseEvent.BUTTON1){
            int indice=table.getSelectedRow();
            if(indice!=-1){
                etat1.setSelectedItem(model.getValueAt(indice, 6).toString());
                id_res=Integer.parseInt(model.getValueAt(indice, 0).toString());

            }
        }
        else if(evt.getButton()==MouseEvent.BUTTON3){
            
            table.clearSelection();
        }
    }//GEN-LAST:event_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(etat1.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "information invalid", "Arctile", JOptionPane.ERROR_MESSAGE);
            // affich.setText( "Remplir les champs");
            //affich.setForeground(Color.red);
        } else{

            String vetat=etat1.getSelectedItem().toString();
          

            PreparedStatement pr ;
//  JOptionPane.showMessageDialog(new JFrame(), "ID is require", "Dialog",
//                        JOptionPane.ERROR_MESSAGE);
//
//                }else
            try{
               

                            String query="UPDATE  projet_jaa.reservation SET etat=?  where idreservation=?";

                            pr=connexionDb.getConnection().prepareStatement(query);
                            pr.setString(1, vetat);
                            pr.setInt(2, id_res);
                            pr.executeUpdate();

                            pr.close(); loadData();
                            JOptionPane.showMessageDialog(null, "The reservation has been successfully updated ", "successfull",JOptionPane.PLAIN_MESSAGE);
                            //}
                    
                   
                

            }
            catch(Exception e){
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                //affich.setText( "Error in the server try next time");
                //affich.setForeground(Color.blue);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(acceuilList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(acceuilList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(acceuilList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(acceuilList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                 acceuilList acceuil= new acceuilList();
               acceuil.setVisible(true);
               acceuil.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel M2;
    private javax.swing.JPanel M3;
    private javax.swing.JPanel M4;
    private javax.swing.JPanel M5;
    private javax.swing.JPanel M6;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> etat1;
    private javax.swing.JLabel fermer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel min;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
