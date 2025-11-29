/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ajin9raw;
import java.awt.Color;
import java.sql.PreparedStatement;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.internet.InternetAddress;

public class signUp extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public signUp() {
        initComponents();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        ferme = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tele = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        femme = new javax.swing.JRadioButton();
        homme = new javax.swing.JRadioButton();
        enregister = new javax.swing.JButton();
        passe = new javax.swing.JPasswordField();
        cpasse = new javax.swing.JPasswordField();
        fermeture = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        affich = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(670, 460));
        setMinimumSize(new java.awt.Dimension(670, 460));
        setUndecorated(true);

        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(51, 255, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ferme.setBackground(new java.awt.Color(255, 255, 255));
        ferme.setDoubleBuffered(false);
        ferme.setPreferredSize(new java.awt.Dimension(17, 17));
        ferme.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        ferme.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 280, 32));

        nom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        ferme.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 280, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Kalam", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SIGN UP");
        jLabel2.setOpaque(true);
        ferme.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 100, 30));

        tele.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tele.setText("+212");
        tele.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        tele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleActionPerformed(evt);
            }
        });
        tele.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                teleKeyTyped(evt);
            }
        });
        ferme.add(tele, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 280, 32));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(12, 91, 160));
        jLabel3.setText("Gender");
        jLabel3.setPreferredSize(new java.awt.Dimension(63, 22));
        ferme.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 90, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(12, 91, 160));
        jLabel4.setText("Full Name");
        ferme.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(12, 91, 160));
        jLabel5.setText("Password");
        ferme.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(12, 91, 160));
        jLabel6.setText("Comfirmation password");
        ferme.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 150, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(12, 91, 160));
        jLabel7.setText("Phone");
        ferme.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(12, 91, 160));
        jLabel8.setText("Mail");
        ferme.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 120, 30));

        buttonGroup1.add(femme);
        femme.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        femme.setForeground(new java.awt.Color(12, 91, 160));
        femme.setText("Female");
        femme.setPreferredSize(new java.awt.Dimension(63, 22));
        femme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femmeActionPerformed(evt);
            }
        });
        ferme.add(femme, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 90, -1));

        buttonGroup1.add(homme);
        homme.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        homme.setForeground(new java.awt.Color(12, 91, 160));
        homme.setText("Male");
        homme.setPreferredSize(new java.awt.Dimension(63, 22));
        homme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hommeActionPerformed(evt);
            }
        });
        ferme.add(homme, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 90, -1));

        enregister.setBackground(new java.awt.Color(102, 102, 102));
        enregister.setFont(new java.awt.Font("Kalam", 1, 14)); // NOI18N
        enregister.setForeground(new java.awt.Color(255, 255, 255));
        enregister.setText("Sing up");
        enregister.setBorder(new javax.swing.border.MatteBorder(null));
        enregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregisterActionPerformed(evt);
            }
        });
        ferme.add(enregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 180, 30));

        passe.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        ferme.add(passe, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 280, 30));

        cpasse.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        ferme.add(cpasse, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 280, 30));

        fermeture.setBackground(new java.awt.Color(255, 255, 255));
        fermeture.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fermeture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fermeture.setText("x");
        fermeture.setOpaque(true);
        fermeture.setPreferredSize(new java.awt.Dimension(17, 17));
        fermeture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fermetureMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fermetureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fermetureMouseExited(evt);
            }
        });
        ferme.add(fermeture, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 20, -1));

        min.setBackground(new java.awt.Color(255, 255, 255));
        min.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        min.setText("-");
        min.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
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
        ferme.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 20, -1));

        affich.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ferme.add(affich, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 320, 30));

        kGradientPanel2.add(ferme, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 370, 460));

        jLabel9.setFont(new java.awt.Font("Kalam", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText(" >> you have an account ? login");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        kGradientPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 230, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4.jpg"))); // NOI18N
        kGradientPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 320, 250));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel11.setText("jLabel9");
        kGradientPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 160, 90));

        jLabel12.setFont(new java.awt.Font("Kalam", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Let's create your account");
        kGradientPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void teleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleActionPerformed

    private void femmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femmeActionPerformed

    private void hommeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hommeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hommeActionPerformed
//pour tester si les champs sont remplis
    private boolean testfieled(){
       return (  nom.getText().equals("") || passe.getText().equals("") ||tele.getText().equals("")||email.getText().equals("")||cpasse.getText().equals(""))
            ;
    
    }
    //pour la confirmation de password
    private boolean confirmePss(String p1,String p2){
        if(p1.equals(p2))
            return true;
        else
            return false;
    }
        //pour cherccher compte deja exist
    private boolean testcompte(){
        PreparedStatement ps;
        ResultSet rs;
         boolean user=false;
           
        String query="SELECT email  from projet_jaa.utilisateur WHERE email=? ";
        try{
            ps=connexionDb.getConnection().prepareStatement(query);
            ps.setString(1, email.getText());
            rs=ps.executeQuery();
            if(rs.next()){
                user=true;
                //JOptionPane.showConfirmDialog(null, "compte deja exit", "Error", JOptionPane.ERROR_MESSAGE);
                affich.setText( "compte deja exit");
                affich.setForeground(Color.red);
             }
            
        }catch(Exception e){
            // JOptionPane.showConfirmDialog(null, "erreur sur base ", "Error", JOptionPane.ERROR_MESSAGE);
            affich.setText( "Erreur au niveau de serveur");
            affich.setForeground(Color.red);
        }
        return user;
    }
    //emialll test
     public static boolean validateEmail(String mail) {
        boolean isValid = false;
        try {
            InternetAddress internetAddress = new InternetAddress(mail);
            internetAddress.validate();
            isValid = true;
        } catch (Exception e) {
            // L'email n'est pas valide
        }
        return isValid;
    }
  
    private void enregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregisterActionPerformed
        if(testfieled()){
            //JOptionPane.showMessageDialog(null, "remplir les champs", "Formulaire", JOptionPane.ERROR_MESSAGE);
            affich.setText( "Remplir les champs");
            affich.setForeground(Color.red);
        } else{
            String vnom=nom.getText();
      
            String vpasse=passe.getText();
            String vcpasse=cpasse.getText();
            String vtele=tele.getText();
            String  vemail=email.getText();
            String vgenre="Male";
            if(femme.isSelected())
            {vgenre="Female";}
            if(!confirmePss(vpasse, vcpasse)){
               //JOptionPane.showMessageDialog(null, "donner le meme password", "Formulaire", JOptionPane.ERROR_MESSAGE);
                affich.setText( "il faut que le mot de passe soit identique");
                 affich.setForeground(Color.red);}
            else{
                if(!validateEmail(vemail)){
                  affich.setText( "invalid emaile forme (email@gmail.com)");
                 affich.setForeground(Color.red);}
                 else
                   if(!phone(vtele)){
                  affich.setText( "invalid ephone forme (+212623456783)");
                 affich.setForeground(Color.red);
                 
                }else{
                PreparedStatement pr;
                String query="INSERT INTO projet_jaa.utilisateur  (nom_complet,mot_passe,telephone,email,genre) VALUES(?,?,?,?,?)";
            
                try{
            pr=connexionDb.getConnection().prepareStatement(query);
            pr.setString(1,vnom);
           
            pr.setString(2,vpasse);
            pr.setString(3,vtele);
            pr.setString(4,vemail);
            pr.setString(5,vgenre);
            if(!testcompte()){
            if(pr.executeUpdate()!=0){
                //JOptionPane.showMessageDialog(null, "succée", "créer un compte", JOptionPane.PLAIN_MESSAGE);
                
                affich.setText( "le compte à bien était crée");
                affich.setForeground(Color.green);
                       
                  login log=new login();
                  this.dispose();
                    log.setVisible(true);
                     log.setLocationRelativeTo(null);
                  }
            else{
                   // JOptionPane.showMessageDialog(null, "echoué", "créer un compte", JOptionPane.ERROR_MESSAGE);
                   affich.setText( "on peut pas crée votre compte essayer plus tard ");
                   affich.setForeground(Color.red);
            }
                
            }}
            catch(Exception e){
                System.out.println(e.getMessage());
                //JOptionPane.showMessageDialog(null, e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                affich.setText( "Error in the server try next time");
                affich.setForeground(Color.blue);
            }
            }
            
        }   }
    }//GEN-LAST:event_enregisterActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        
        login formulaire=new login();
         this.dispose();
        formulaire.setVisible(true);
        formulaire.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel9MouseClicked
//le type de de tele
    private void teleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teleKeyTyped
     char key=evt.getKeyChar();
     if(!Character.isDigit(key)){
         evt.consume();
     }
    }//GEN-LAST:event_teleKeyTyped
//fermer la fenetre
    private void fermetureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermetureMouseClicked
        System.exit(0);
    }//GEN-LAST:event_fermetureMouseClicked

    private void fermetureMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermetureMouseExited
               Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        fermeture.setBorder(borderLabel);
        fermeture.setBackground(Color.white);
        fermeture.setForeground(Color.black);
    }//GEN-LAST:event_fermetureMouseExited
//reduire le fenetre
    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void fermetureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermetureMouseEntered
                Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.red);
        fermeture.setBorder(borderLabel);
        fermeture.setBackground(Color.red);
        fermeture.setForeground(Color.white);
    }//GEN-LAST:event_fermetureMouseEntered

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
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                signUp signUp= new signUp();
               signUp.setVisible(true);
               signUp.setLocationRelativeTo(null);
               
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel affich;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField cpasse;
    private javax.swing.JTextField email;
    private javax.swing.JButton enregister;
    private javax.swing.JRadioButton femme;
    private javax.swing.JPanel ferme;
    private javax.swing.JLabel fermeture;
    private javax.swing.JRadioButton homme;
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
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel min;
    private javax.swing.JTextField nom;
    private javax.swing.JPasswordField passe;
    private javax.swing.JTextField tele;
    // End of variables declaration//GEN-END:variables
}
