
package ajin9raw;


import java.awt.Color;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;



public class acceuilAdmin1 extends javax.swing.JFrame {

  Color clikedColor=new Color(0,102,102);
    public acceuilAdmin1() {
        initComponents();
        loadData();
        
        
       
        //in the run time
        
       
        
    }
    //fonction pour afficher les
    public void loadData(){
      try {
                 DefaultTableModel model = new DefaultTableModel( new String []{"id","Nom complet","password","Email","Telephone","genre"},0);
          String query="select * from projet_jaa.administrateur";
        PreparedStatement ps= connexionDb.getConnection().prepareStatement(query);
            
      
       table.setModel(model);
       
       affich.setText("");
       ResultSet rs = ps.executeQuery();
       String f, l,e,i, a,b;
       while(rs.next()){
         i= rs.getString("id_administrateur");
         f = rs.getString("nom_complet");
         l = rs.getString("mot_passe");
         e = rs.getString("genre");
         a= rs.getString("telephone");
         b= rs.getString("email");
         model.addRow(new Object[]{i,f,l, b,a,e});

       }
     }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
     }   
                
       
    }

    //pour vider les champ
    public void vider(){
        nom.setText("");
        passe.setText("");
        tele.setText("");
        email.setText("");
        email.setEnabled(true);
        affich.setText("");
    }
           //pour cherccher compte deja exist
    private boolean testcompte(){
        PreparedStatement ps;
        ResultSet rs;
         boolean user=false;
           
        String query="SELECT email  from projet_jaa.administrateur WHERE email=? ";
        try{
            ps=connexionDb.getConnection().prepareStatement(query);
            ps.setString(1, email.getText());
            rs=ps.executeQuery();
            if(rs.next()){
                user=true;
                JOptionPane.showConfirmDialog(null, "the account already exist", "Error", JOptionPane.ERROR_MESSAGE);
            
             }
            
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, "erreur sur base ", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        return user;
    }
    //pour tester si les champs sont remplis
    private boolean testfieled(){
       return (  nom.getText().equals("") || passe.getText().equals("") ||tele.getText().equals("")||email.getText().equals(""))
            ;
    
    }

 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        M5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        M6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        M2 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tele = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        update = new javax.swing.JButton();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        passe = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        affich = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        fermer = new javax.swing.JLabel();
        min = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(51, 255, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 170, 80));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(7, 1));

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

        jLabel10.setBackground(new java.awt.Color(51, 255, 255));
        jLabel10.setFont(new java.awt.Font("Kalam Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Admin");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);

        M3.setBackground(new java.awt.Color(0, 102, 102));
        M3.setInheritsPopupMenu(true);
        M3.setOpaque(false);
        M3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                M3MousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Ordering");

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout M3Layout = new javax.swing.GroupLayout(M3);
        M3.setLayout(M3Layout);
        M3Layout.setHorizontalGroup(
            M3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator4)
        );
        M3Layout.setVerticalGroup(
            M3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M3Layout.createSequentialGroup()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
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

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Search");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout M4Layout = new javax.swing.GroupLayout(M4);
        M4.setLayout(M4Layout);
        M4Layout.setHorizontalGroup(
            M4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addComponent(jSeparator3)
        );
        M4Layout.setVerticalGroup(
            M4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M4Layout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("booking archive");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout M5Layout = new javax.swing.GroupLayout(M5);
        M5.setLayout(M5Layout);
        M5Layout.setHorizontalGroup(
            M5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(M5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        M5Layout.setVerticalGroup(
            M5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Materiel List on request");

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout M6Layout = new javax.swing.GroupLayout(M6);
        M6.setLayout(M6Layout);
        M6Layout.setHorizontalGroup(
            M6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(M6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        M6Layout.setVerticalGroup(
            M6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M6Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(M6);

        kGradientPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 460));

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

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Genre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Nom complet:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Mot de passe:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Email:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Téléphone:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        tele.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tele.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
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
        jPanel2.add(tele, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 260, 32));

        buttonGroup1.add(male);
        male.setText("Homme");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel2.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        buttonGroup1.add(female);
        female.setText("Femme");
        jPanel2.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        update.setBackground(new java.awt.Color(0, 204, 255));
        update.setFont(new java.awt.Font("Kalam", 0, 12)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 90, 40));

        add.setBackground(new java.awt.Color(0, 204, 255));
        add.setFont(new java.awt.Font("Kalam", 0, 12)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 90, 40));

        delete.setBackground(new java.awt.Color(0, 204, 255));
        delete.setFont(new java.awt.Font("Kalam", 0, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 90, 40));

        email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 260, 32));

        passe.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        passe.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        passe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passeActionPerformed(evt);
            }
        });
        jPanel2.add(passe, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 260, 32));

        nom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nom.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        jPanel2.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 260, 32));

        jLabel15.setFont(new java.awt.Font("Kalam", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 255));
        jLabel15.setText("Manage administrator");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 20));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nom complet", "Mot de passe", "Email", "Téléphone", "Genre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(255, 255, 255));
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
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 550, 150));

        affich.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(affich, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 530, 20));

        Clear.setBackground(new java.awt.Color(0, 204, 255));
        Clear.setFont(new java.awt.Font("Kalam", 0, 12)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel2.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 90, 40));

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
        jPanel2.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, 20));

        kGradientPanel2.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 560, 440));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 440));

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
        fermer.setBackground(Color.red);
        fermer.setForeground(Color.white);
    }//GEN-LAST:event_fermerMouseEntered

    private void fermerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseExited
        Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        fermer.setBorder(borderLabel);
        fermer.setBackground(Color.white);
        fermer.setForeground(Color.black);
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

    private void teleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
             DefaultTableModel model = (DefaultTableModel) table.getModel();
  
        String req= "update administrateur set nom_complet =? ,mot_passe=?,  telephone=? ,genre=? where id_administrateur=?";
        int selectedRow = table.getSelectedRow();

        if (selectedRow != -1) {
            try {
              
                PreparedStatement pre = connexionDb.getConnection().prepareStatement(req);

               
                String id = (String) model.getValueAt(selectedRow, 0);
             
                String vNom=nom.getText();
                String vPasse=passe.getText();
                String vTele=tele.getText();
                String vgenre="Male";
            if(female.isSelected())
            {vgenre="Female";}
                pre.setString(1, vNom);
                pre.setString(2,vPasse);
                pre.setString(3,vTele);
                pre.setString(4,vgenre);
                pre.setString(5, id);
                if(testfieled()==false){
                                int rowsUpdated = pre.executeUpdate();

                // Supprimer la ligne de la table si la suppression dans la base de données a réussi
                if (rowsUpdated > 0) {
                    vider();
                    loadData();
                    affich.setText( "the account has been updated successfully");
                      affich.setForeground(Color.green);
                }
                }else{
                    JOptionPane.showMessageDialog(new JFrame(), "fill in the fields", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }}else{
             affich.setText( "first select the line you want to modify");
                      affich.setForeground(Color.red);
        }
    }//GEN-LAST:event_updateActionPerformed

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

    private void M5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M5MouseClicked
       acceuilList acc=new acceuilList();
                 System.out.println("res2");
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

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void passeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passeActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
     
           String  vemail=email.getText();if(testfieled()){
            //JOptionPane.showMessageDialog(null, "remplir les champs", "Formulaire", JOptionPane.ERROR_MESSAGE);
            affich.setText( "fill in the fields");
            affich.setForeground(Color.red);
        }if(!signUp.validateEmail(vemail)){
         affich.setText( "Enter a valid email form");
            affich.setForeground(Color.red);
        }
        else{
            String vnom=nom.getText();
      
            String vpasse=passe.getText();
            String vtele=tele.getText();
         
            String vgenre="Male";
            if(female.isSelected())
            {vgenre="Female";}
           
           
       
                PreparedStatement pr;
                String query="INSERT INTO projet_jaa.administrateur  (nom_complet,mot_passe,telephone,email,genre) VALUES(?,?,?,?,?)";
            
                try{
            pr=connexionDb.getConnection().prepareStatement(query);
            pr.setString(1,vnom);
           
            pr.setString(2,vpasse);
            pr.setString(3,vtele);
            pr.setString(4,vemail);
            pr.setString(5,vgenre);
            if(!testcompte()){
            if(pr.executeUpdate()!=0){
               // JOptionPane.showMessageDialog(null, "succée", "créer un compte", JOptionPane.PLAIN_MESSAGE);
                loadData();
                vider();
                affich.setText( "the account has been created");
                affich.setForeground(Color.green);
                       
                
                  }
            else{
                   // JOptionPane.showMessageDialog(null, "echoué", "créer un compte", JOptionPane.ERROR_MESSAGE);
                 affich.setText( "We cannot create this account at the moment. Please try again later.");
                   affich.setForeground(Color.blue);            }
                
            }}
            catch(Exception e){
                System.out.println(e.getMessage());
                //JOptionPane.showMessageDialog(null, e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
              
            }
            
            
         }
    }//GEN-LAST:event_addActionPerformed

    private void teleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teleKeyTyped
        char key=evt.getKeyChar();
     if(!Character.isDigit(key)){
         evt.consume();
     }
    }//GEN-LAST:event_teleKeyTyped

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
               DefaultTableModel model = (DefaultTableModel) table.getModel();
        if(evt.getButton()==MouseEvent.BUTTON1){
            int indice=table.getSelectedRow();
            if(indice!=-1){
                nom.setText(model.getValueAt(indice, 1).toString());
                passe.setText(model.getValueAt(indice, 2).toString());
                email.setText(model.getValueAt(indice, 3).toString());
               tele.setText(model.getValueAt(indice, 4).toString());
               male.setSelected(true);
               if(!model.getValueAt(indice, 5).toString().equalsIgnoreCase("male")){
               female.setSelected(true);
               }
          
            }
        }
        else if(evt.getButton()==MouseEvent.BUTTON3){
            vider();
            email.setEnabled(true);
            table.clearSelection();
        }
                 email.setEnabled(false);
    }//GEN-LAST:event_tableMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
                 
       DefaultTableModel model = (DefaultTableModel) table.getModel();
  
        String req= "delete from administrateur where id_administrateur=?";
        int selectedRow = table.getSelectedRow();

        if (selectedRow != -1) {
            try {
              
                PreparedStatement pre = connexionDb.getConnection().prepareStatement(req);

               
                String id = (String) model.getValueAt(selectedRow, 0);
                pre.setString(1, id);
                                int rowsDeleted = pre.executeUpdate();

                // Supprimer la ligne de la table si la suppression dans la base de données a réussi
                if (rowsDeleted > 0) {
                    model.removeRow(selectedRow);
                    vider();
                    affich.setText( "admin has been deleted succefuly");
                affich.setForeground(Color.green);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }}else{
             affich.setText( "First, select the line you want to delete.");
                      affich.setForeground(Color.red);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        vider();
        
    }//GEN-LAST:event_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(acceuilAdmin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(acceuilAdmin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(acceuilAdmin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(acceuilAdmin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                 acceuilAdmin1 acceuil= new acceuilAdmin1();
               acceuil.setVisible(true);
               acceuil.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JPanel M2;
    private javax.swing.JPanel M3;
    private javax.swing.JPanel M4;
    private javax.swing.JPanel M5;
    private javax.swing.JPanel M6;
    private javax.swing.JButton add;
    private javax.swing.JLabel affich;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel fermer;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JRadioButton male;
    private javax.swing.JLabel min;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField passe;
    private javax.swing.JTable table;
    private javax.swing.JTextField tele;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
