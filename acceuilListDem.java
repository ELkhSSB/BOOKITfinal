
package ajin9raw;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;



public class acceuilListDem extends javax.swing.JFrame {

  Color defaultColor,clikedColor=new Color(0,102,102);
    public acceuilListDem() {
        initComponents();
        loadData();
      
    }

   public void loadData(){
         String sql = "SELECT * FROM article1 where disponibility=?";
       DefaultTableModel model = new DefaultTableModel (new String[]{ "id","Label","Brand","Characters"},0);
      try {

        PreparedStatement ps=connexionDb.getConnection().prepareStatement(sql);
            ps.setBoolean(1, false);
             
       table.setModel(model);
       ResultSet rs = ps.executeQuery();
       String c,l, d,b;
       int a;
      
       
       while(rs.next()){
          a=rs.getInt("idarticle1");
         l= rs.getString("label");
         d = rs.getString("brand");
         b= rs.getString("charact");
         
        
         model.addRow(new Object[]{a,l,d,b});
       }
     }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
     }   
                
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        M2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        M3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        M4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        M5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        M6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        fermer = new javax.swing.JLabel();
        min = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(670, 460));
        setMinimumSize(new java.awt.Dimension(670, 460));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkEndColor(new java.awt.Color(153, 0, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(51, 255, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-64, 0, 230, 80));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(7, 1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2);

        jLabel9.setBackground(new java.awt.Color(0, 102, 102));
        jLabel9.setFont(new java.awt.Font("Kalam Light", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Manage Article");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
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

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        M2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        M2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

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
        jLabel11.setText("ordering");
        M3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 6, 63, 32));

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
        M4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

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

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        M5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        M5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 170, -1));

        jPanel1.add(M5);

        M6.setBackground(new java.awt.Color(0, 204, 255));
        M6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                M6MousePressed(evt);
            }
        });
        M6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Kalam Light", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Materiel List on request");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        M6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 6, 170, 32));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        M6.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 170, 10));

        jPanel1.add(M6);

        kGradientPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 460));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Kalam", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 255));
        jLabel15.setText("Materiel on request");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 20));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Libelle", "Model", "Caractere"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 550, 400));

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
        jPanel2.add(fermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

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
        jPanel2.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        kGradientPanel2.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 560, 460));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 460));

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
         jLabel9.setOpaque(false);
        jLabel10.setOpaque(true);
        jLabel10.setBackground(clikedColor);
        M3.setOpaque(false);
        M4.setOpaque(false);
        M5.setOpaque(false);
        M6.setOpaque(false);
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

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        Manage_article acc=new Manage_article();
                 acc.setVisible(true);
                  this.dispose();
                 acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel9MouseClicked

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
                 System.out.println("res2");
                 acc.setVisible(true);
                  this.dispose();
                 acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_M5MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(acceuilListDem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(acceuilListDem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(acceuilListDem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(acceuilListDem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                 acceuilListDem acceuil= new acceuilListDem();
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
    private javax.swing.JLabel fermer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel min;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
