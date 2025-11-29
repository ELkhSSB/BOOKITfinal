package ajin9raw;

import ajin9raw.connexionDb;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class Manage_article extends javax.swing.JFrame {
   
    public Manage_article() {
        initComponents();
        
        loadData();
        
       
        //in the run time
         jLabel9.setOpaque(true);
       
        
    }

 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        libelle = new javax.swing.JTextField();
        caracter = new javax.swing.JTextField();
        Brand = new javax.swing.JTextField();
        dispo = new javax.swing.JComboBox<>();
        update = new javax.swing.JButton();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        fermer = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        M2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        M3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        M4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        M5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        M6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Characters :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 79, 29));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Label :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 79, 29));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Brand:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 79, 29));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("disponibilité : ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 100, 40));

        libelle.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        libelle.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        libelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libelleActionPerformed(evt);
            }
        });
        jPanel2.add(libelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, 32));

        caracter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        caracter.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        caracter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caracterActionPerformed(evt);
            }
        });
        jPanel2.add(caracter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 170, 32));

        Brand.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Brand.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        Brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandActionPerformed(evt);
            }
        });
        jPanel2.add(Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 150, 32));

        dispo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        dispo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        jPanel2.add(dispo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 150, 30));

        update.setBackground(new java.awt.Color(0, 204, 255));
        update.setFont(new java.awt.Font("Kalam", 0, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 100, 30));

        add.setBackground(new java.awt.Color(0, 204, 255));
        add.setFont(new java.awt.Font("Kalam", 0, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        jPanel2.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 100, 30));

        delete.setBackground(new java.awt.Color(0, 204, 255));
        delete.setFont(new java.awt.Font("Kalam", 0, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 100, 30));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idArticle", "Label", "Brand", "Characters", "Disponibilite"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setGridColor(new java.awt.Color(255, 255, 255));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(1).setResizable(false);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(3).setResizable(false);
            Table.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 560, 240));

        jLabel7.setFont(new java.awt.Font("Kalam", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setText("Manage Article");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 150, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 590, 440));

        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(51, 255, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fermer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fermer.setForeground(new java.awt.Color(255, 255, 255));
        fermer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fermer.setText("X");
        fermer.setAlignmentY(0.0F);
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
        kGradientPanel2.add(fermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, -1, -1));

        min.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        min.setForeground(new java.awt.Color(255, 255, 255));
        min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        min.setText("-");
        min.setAlignmentY(0.0F);
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
        kGradientPanel2.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 170, 60));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(8, 1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2);

        jLabel9.setBackground(new java.awt.Color(51, 255, 255));
        jLabel9.setFont(new java.awt.Font("Kalam Light", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Manage Article");
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel1.add(jLabel9);

        M2.setBackground(new java.awt.Color(0, 102, 102));
        M2.setOpaque(false);
        M2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                M2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                M2MousePressed(evt);
            }
        });
        M2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Kalam Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Admin");
        M2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 96, 37));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        M2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        M2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 170, 10));

        jPanel1.add(M2);

        M3.setBackground(new java.awt.Color(0, 102, 102));
        M3.setOpaque(false);
        M3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                M3MousePressed(evt);
            }
        });
        M3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Kalam Light", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Ordering");
        M3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 6, 63, 32));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        M3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 170, 10));

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
        M4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Kalam Light", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Search");
        M4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 6, 63, 32));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        M4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 170, -1));

        jPanel1.add(M4);

        M5.setBackground(new java.awt.Color(0, 102, 102));
        M5.setOpaque(false);
        M5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                M5MousePressed(evt);
            }
        });
        M5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Kalam Light", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Booking archive");
        M5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 136, 32));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        M5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 170, -1));

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
        M6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Kalam Light", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Liste materiel sur demade");
        M6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 170, 32));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        M6.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 170, -1));

        jPanel1.add(M6);

        jLabel8.setFont(new java.awt.Font("Kalam", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_logout_rounded_left_24px_1.png"))); // NOI18N
        jLabel8.setText("Logout");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel1.add(jLabel8);

        kGradientPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 460));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseEntered
        Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.blue);
        min.setBorder(borderLabel);
        min.setForeground(Color.blue);
    }//GEN-LAST:event_minMouseEntered

    private void minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseExited
        Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        min.setBorder(borderLabel);
        min.setForeground(Color.white);
    }//GEN-LAST:event_minMouseExited

    private void fermerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseClicked
        System.exit(0);
    }//GEN-LAST:event_fermerMouseClicked

    private void fermerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseEntered
        Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.red);
        fermer.setBorder(borderLabel);
        fermer.setForeground(Color.red);
    }//GEN-LAST:event_fermerMouseEntered

    private void fermerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseExited
        Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        fermer.setBorder(borderLabel);
        fermer.setForeground(Color.white);
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
          Manage_article acc=new Manage_article();
                 acc.setVisible(true);
                  this.dispose();
                 acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel9MousePressed
     
    private void M2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M2MouseEntered
        
    }//GEN-LAST:event_M2MouseEntered

    private void libelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libelleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_libelleActionPerformed

    private void BrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandActionPerformed

    private void M2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M2MouseClicked
         acceuilAdmin1 acc=new acceuilAdmin1();
                 acc.setVisible(true);
                  this.dispose();
                 acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_M2MouseClicked

    private void M4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M4MouseClicked
          search acc=new search();
                 acc.setVisible(true);
                  this.dispose();
                 acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_M4MouseClicked

    private void M5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M5MouseClicked
          acceuilList acc=new acceuilList();
                 acc.setVisible(true);
                  this.dispose();
                 acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_M5MouseClicked

    private void M6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M6MouseClicked
        acceuilListDem acc=new acceuilListDem();
                 acc.setVisible(true);
                  this.dispose();
                 acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_M6MouseClicked

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
         premier_page acc=new premier_page();
        acc.setVisible(true);
        this.dispose();
        acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel8MousePressed
//pour tester si les champs sont remplis
    private boolean testfieled(){
       return (  libelle.getText().equals("") || Brand.getText().equals("") ||caracter.getText().equals("")||dispo.getSelectedItem().equals(""))
            ;
    
    }
    //fontion pour afficher la table
     public void loadData(){
          DefaultTableModel model = new DefaultTableModel(new String[]{"Idrticle","Label", "Brand", "Characters", "disponibilite"}, 0);
      try {  
       PreparedStatement pr;
            String sql = "SELECT * FROM article1";
       pr=connexionDb.getConnection().prepareStatement(sql);
       Table.setModel(model);
     
       ResultSet rs = pr.executeQuery();
       String f, l,e;
       int d;
      boolean i;
       while(rs.next()){
         d=rs.getInt("idarticle1");
           f = rs.getString("label");
         l = rs.getString("brand");
         e = rs.getString("charact");
        i = rs.getBoolean("disponibility");
         model.addRow(new Object[]{d,f,l, e,i});
       }
     }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
     }   
                
       
    }
     //fontion vider les champs
     private void vider(){
        libelle.setText("");
        //dispo.setSelectedItem("");
        caracter.setText("");
        Brand.setText("");
      
     }
    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
      
             if(testfieled()){
            JOptionPane.showMessageDialog(null, "remplir les champs", "Arctile", JOptionPane.ERROR_MESSAGE);
           // affich.setText( "Remplir les champs");
            //affich.setForeground(Color.red);
        } else{
            String vLabel=libelle.getText();
     String vBrand=Brand.getText();
     String vChar=caracter.getText();
     boolean   vDispo=true;
            if(dispo.getSelectedItem().equals("no"))
                vDispo=false;
            
       PreparedStatement pr;
                String query="INSERT INTO projet_jaa.article1  (label,brand,charact,disponibility) VALUES(?,?,?,?)";
            
                try{
            pr=connexionDb.getConnection().prepareStatement(query);
            pr.setString(1,vLabel);
           
            pr.setString(2,vBrand);
            pr.setString(3,vChar);
            pr.setBoolean(4,vDispo);
          
           
            if(pr.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "succée", "", JOptionPane.PLAIN_MESSAGE);
                vider();
                loadData();
                
               // affich.setText( "le compte à bien était crée");
                //affich.setForeground(Color.green);
                       
                  }
            else{
                    JOptionPane.showMessageDialog(null, "echoué", "", JOptionPane.ERROR_MESSAGE);
                  // affich.setText( "on peut pas crée votre compte essayer plus tard ");
                   //affich.setForeground(Color.red);
            }
                
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                //affich.setText( "Error in the server try next time");
                //affich.setForeground(Color.blue);
            }
            }
            
          
                          
     
    }//GEN-LAST:event_addMouseClicked

    private void caracterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caracterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caracterActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
                       DefaultTableModel model = (DefaultTableModel) Table.getModel();
  
        String req= "update article1 set label =?, brand=? ,charact=?,  disponibility=? where idarticle1=?";
        int selectedRow = Table.getSelectedRow();

        if (selectedRow != -1) {
            try {
              
                PreparedStatement pre = connexionDb.getConnection().prepareStatement(req);

               
                int id = (int) model.getValueAt(selectedRow, 0);
             
                String vLabel=libelle.getText();
                String vBrand=Brand.getText();
                String vchar=caracter.getText();
                boolean vDispo=false;
                       if(dispo.getSelectedItem().toString().equalsIgnoreCase("yes")){vDispo=true ;}
                pre.setString(1, vLabel);
                pre.setString(2,vBrand);
                pre.setString(3,vchar);
                pre.setBoolean(4,vDispo);
                pre.setInt(5, id);
                if(testfieled()==false){
                                int rowsUpdated = pre.executeUpdate();

                // Supprimer la ligne de la table si la suppression dans la base de données a réussi
                if (rowsUpdated > 0) {
                    vider();
                    loadData();
                }
                }else{
                    JOptionPane.showMessageDialog(new JFrame(), "remplir les champs", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }}            
    }//GEN-LAST:event_updateMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
       DefaultTableModel model = (DefaultTableModel) Table.getModel();
       PreparedStatement pr;
        String req= "delete from article1 where idarticle1=?";
        int selectedRow = Table.getSelectedRow();

        if (selectedRow != -1) {
            try {
                
          
        pr=connexionDb.getConnection().prepareStatement(req);
               
                int idarticle1 = (int) model.getValueAt(selectedRow, 0);
                pr.setInt(1, idarticle1);
                int rowsDeleted = pr.executeUpdate();

                // Supprimer la ligne de la table si la suppression dans la base de données a réussi
                if (rowsDeleted > 0) {
                    model.removeRow(selectedRow);
                   
                }

                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }        
    }//GEN-LAST:event_deleteMouseClicked

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
              
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        if(evt.getButton()==MouseEvent.BUTTON1){
            int indice=Table.getSelectedRow();
            if(indice!=-1){
                libelle.setText(model.getValueAt(indice, 1).toString());
                Brand.setText(model.getValueAt(indice, 2).toString());
                caracter.setText(model.getValueAt(indice, 3).toString());
        //         dispo.setText(model.getValueAt(indice, 3).toString());
            }
        }
        else if(evt.getButton()==MouseEvent.BUTTON3){
            vider();
            Table.clearSelection();
        }
    
    }//GEN-LAST:event_TableMouseClicked

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
            java.util.logging.Logger.getLogger(Manage_article.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_article.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_article.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_article.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                 Manage_article acceuil= new Manage_article();
                 acceuil.loadData();
               acceuil.setVisible(true);
               acceuil.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Brand;
    private javax.swing.JPanel M2;
    private javax.swing.JPanel M3;
    private javax.swing.JPanel M4;
    private javax.swing.JPanel M5;
    private javax.swing.JPanel M6;
    private javax.swing.JTable Table;
    private javax.swing.JButton add;
    private javax.swing.JTextField caracter;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> dispo;
    private javax.swing.JLabel fermer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField libelle;
    private javax.swing.JLabel min;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}