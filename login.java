package ajin9raw;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author DELL
 */
public class login extends javax.swing.JFrame {
   static String name;
   static int idUser;
    /**
     * Creates new form Formulaire
     */
    public login() {
         
              initComponents();
        
        Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.black);
        fermer.setBorder(borderLabel);
        min.setBorder(borderLabel);
  
    }



    public static boolean phone(String input) {
      
        String regex = "^\\+212\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
         
           return true;
        } else {
            return false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        log = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        connecter = new javax.swing.JButton();
        pwd = new javax.swing.JPasswordField();
        singup = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fermer = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        affich = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(51, 255, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        log.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        log.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        jPanel1.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 260, 32));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Kalam", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Connect to NYASA.IT");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 260, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 120, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 255));
        jLabel8.setText("Mail");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 30));

        connecter.setBackground(new java.awt.Color(102, 102, 102));
        connecter.setFont(new java.awt.Font("Kalam", 1, 14)); // NOI18N
        connecter.setForeground(new java.awt.Color(255, 255, 255));
        connecter.setText("Connect");
        connecter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        connecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connecterActionPerformed(evt);
            }
        });
        jPanel1.add(connecter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 260, 40));

        pwd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 153, 255)));
        jPanel1.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 260, 30));

        singup.setFont(new java.awt.Font("Kalam", 1, 14)); // NOI18N
        singup.setForeground(new java.awt.Color(51, 153, 255));
        singup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        singup.setText(" >> don't have an account ? Sign Up");
        singup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                singupMouseClicked(evt);
            }
        });
        jPanel1.add(singup, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 250, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Matériel");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 190, 30));

        fermer.setBackground(new java.awt.Color(255, 255, 255));
        fermer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fermer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fermer.setText("X");
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
        jPanel1.add(fermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

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
        jPanel1.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));
        jPanel1.add(affich, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 340, 30));

        kGradientPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 370, 460));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.jpg"))); // NOI18N
        kGradientPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 320, 250));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html><pre>  to assist you in booking your  <br>     IT equipment...</pre>");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 300, 50));

        jLabel7.setFont(new java.awt.Font("Snap ITC", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Discover BOOKIT,");
        kGradientPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        kGradientPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 180, 100));

        jLabel4.setFont(new java.awt.Font("Kalam", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_logout_rounded_left_24px_1.png"))); // NOI18N
        jLabel4.setText("Logout");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        kGradientPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void singupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singupMouseClicked

        signUp signUp=new signUp();
        this.dispose();
        signUp.setVisible(true);
        signUp.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_singupMouseClicked

    private void connecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connecterActionPerformed
    if(testField()){
        
        affich.setText( "remplir email et mot de passe");
        affich.setForeground(Color.red);
        // JOptionPane.showMessageDialog(this,"remplir email et mot de passe","login",JOptionPane.ERROR_MESSAGE);
     }
     else{
         PreparedStatement ps,ps2;
         ResultSet rs,rs1;
         String vlog=log.getText();
         String vpwd=pwd.getText();
         if(!signUp.validateEmail(vlog)){
         affich.setText( "email form not valide");
                affich.setForeground(Color.red);
         }else{
         String query ="SELECT * FROM  projet_jaa.utilisateur  WHERE email=? AND mot_passe=?"; 
         try{
             ps=connexionDb.getConnection().prepareStatement(query);
             ps.setString(1,vlog);
             ps.setString(2, vpwd);
             rs=ps.executeQuery();
             if(rs.next()){
                 idUser=rs.getInt("id_utilisateur");
                name=rs.getString("nom_complet");
                 Utilisateur_home acc=new Utilisateur_home();
                 acc.setVisible(true);
                  this.dispose();
                 acc.setLocationRelativeTo(null);
                    
             }
             else{  
                 try{System.out.println("try2");
             System.out.println(1);
                  query ="SELECT * FROM projet_jaa.administrateur WHERE email=? AND mot_passe=?"; 
                  ps2=connexionDb.getConnection().prepareStatement(query);
             ps2.setString(1,vlog);
             ps2.setString(2, vpwd);
             rs1=ps2.executeQuery();
             if(rs1.next()){  
                 Manage_article acc=new Manage_article();
                 acc.setVisible(true);
                  this.dispose();
                 acc.setLocationRelativeTo(null);
             }else{  System.out.println(3);
                 affich.setText( "account  not found");
                affich.setForeground(Color.red);
                 //JOptionPane.showMessageDialog(null, "pas de compte", "incorrect", JOptionPane.ERROR_MESSAGE);
             }
                 }catch(Exception ex){
                     
             //JOptionPane.showMessageDialog(null, ex.getMessage());
                 affich.setText( "error in the server");
                  affich.setForeground(Color.blue);
         }}
             /*else{
                 JOptionPane.showMessageDialog(null, "pas de compte", "incorrect", JOptionPane.ERROR_MESSAGE);
             }*/
         }catch(Exception ex){
             //JOptionPane.showMessageDialog(null, ex.getMessage());
             affich.setText( "error in the server");
                  affich.setForeground(Color.blue);
         }
     }}
                                         

    }//GEN-LAST:event_connecterActionPerformed
    // pour tester si les champs vides
    private boolean testField(){
        if(log.getText().equals("") || pwd.getText().equals(""))
        {return true;}
        else return false;
    }
    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logActionPerformed

    private void fermerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseEntered
            Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.red);
       fermer.setBorder(borderLabel);
       fermer.setBackground(Color.red);
        fermer.setForeground(Color.white);
    }//GEN-LAST:event_fermerMouseEntered

    private void fermerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseExited
               Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.white);
       fermer.setBorder(borderLabel);
        fermer.setBackground(Color.white);
        fermer.setForeground(Color.black);
    }//GEN-LAST:event_fermerMouseExited

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

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         premier_page acc=new premier_page();
        acc.setVisible(true);
        this.dispose();
        acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  login l= new login();
               l.setVisible(true);
               l.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel affich;
    private javax.swing.JButton connecter;
    private javax.swing.JLabel fermer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField log;
    private javax.swing.JLabel min;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JLabel singup;
    // End of variables declaration//GEN-END:variables
}
