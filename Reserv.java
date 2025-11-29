/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ajin9raw;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.pdf.draw.LineSeparator;
import java.awt.Desktop;
import java.io.*;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Reserv {
        
        String nomUser="";
        String article="";
        String periode="";
        String brand="";
        Date dat;
        String email="";
        String phone="";
        int id_Reservation;
        int nbr_res;
            
        Font TilteFont =new Font (Font.FontFamily.TIMES_ROMAN, 16, Font. BOLD, BaseColor.BLUE);
        Font RedFont = new Font (Font.FontFamily.TIMES_ROMAN, 14, Font. BOLD, BaseColor.RED);
        Font ArticleFont = new Font (Font.FontFamily.TIMES_ROMAN, 14, Font. BOLD, BaseColor.BLACK);


         LineSeparator ls = new LineSeparator();
         
            
      
         
    
    public  void affich(){
        PreparedStatement pr,pr1 ;
        ls.setLineColor (BaseColor.BLUE);
        try {
                String sql="SELECT * FROM reservation WHERE fullname =?";
                pr=connexionDb.getConnection().prepareStatement(sql);
                pr.setString(1, login.name);
                
                String req="SELECT * FROM utilisateur WHERE id_utilisateur =?";
                pr1=connexionDb.getConnection().prepareStatement(req);
                pr1.setInt(1,login.idUser);
                
                ResultSet rs =pr.executeQuery();
                ResultSet rs1 =pr1.executeQuery();
                if(rs1.next()){
                    email=rs1.getString("email");
                    phone=rs1.getString("telephone");
                    
                }
                nbr_res=0;
                while(rs.next()){nbr_res++;
                        id_Reservation=rs.getInt("idreservation");
                        article=rs.getString("nomArticle");
                        nomUser=rs.getString("fullname");
                        brand=rs.getString("brandArticle");
                        periode=rs.getString("periodeReserve");
                        dat =rs.getDate("dateReserve");
                }

       }catch(Exception e){
    
        }
    }
    
    public static void main(String[] arg){
        Reserv r= new Reserv();
        try{    
                r.affich();
                String name_f="C:\\Users\\XPRISTO\\Documents\\"+r.nomUser+".pdf";
                Document document =new Document(PageSize.A4);
                PdfWriter.getInstance(document, new FileOutputStream(name_f));

                document.open();
                  //document.addTitle ("Document de Resrvation  "+name);
                document.addAuthor("AD-INFO");

                r.nomUser= r.nomUser.toUpperCase(); 

                Paragraph preface2= new Paragraph();
                Paragraph titre2= new Paragraph ("INFORMATIONS SUR LE RESERVATEUR ",r.TilteFont);
                titre2.setAlignment(Element.ALIGN_CENTER);
                preface2.add(titre2);
                preface2.add(r.ls);
                preface2.add(new Paragraph(" "));

                Chunk c_nom = new Chunk("Fullname: " ,r. RedFont);
                Chunk c_nomText = new Chunk(r.nomUser, r.ArticleFont);
                Chunk c_email = new Chunk("Email: " ,r. RedFont);
                Chunk c_emailText = new Chunk(r.email, r.ArticleFont);
                Chunk c_phone = new Chunk("Numero de Telephone: " ,r. RedFont);
                Chunk c_phoneText = new Chunk(r.phone, r.ArticleFont);
                preface2.add(new Paragraph(" "));
                preface2.add(c_email);preface2.add(c_emailText);

                preface2.add(Chunk.NEWLINE);
                preface2.add(c_phone);preface2.add(c_phoneText);
                preface2.add(Chunk.NEWLINE);
                preface2.add(c_nom);preface2.add(c_nomText);
                preface2.add(Chunk.NEWLINE);
                
                document.add(preface2);

                Paragraph preface= new Paragraph();

                Paragraph titre= new Paragraph ("INFORMATIONS SUR LA RESERVATION  ",r.TilteFont);
                titre.setAlignment(Element.ALIGN_CENTER);
                preface.add(titre);

                preface.add(r.ls);
                preface.add(new Paragraph(" "));preface.add(new Paragraph(" "));


                // Créer un Chunk pour le texte fixe "Nom de l'article: " avec une police spécifique
                Chunk c_id= new Chunk("Id de Reservation: " , r.RedFont);
                Chunk c_idText = new Chunk(r.id_Reservation+"", r.ArticleFont);
                Chunk c_fixedText = new Chunk("Nom de l'article: ", r.RedFont);

                // Créer un Chunk pour le texte de l'article avec une autre police
                Chunk c_articleText = new Chunk(r.article, r.ArticleFont);
                Chunk c_periodeReserve = new Chunk("Période de réservation: " , r.RedFont);
                Chunk c_periodeText = new Chunk(r.periode, r.ArticleFont);
                Chunk c_brand = new Chunk("Marque d'article: " , r.RedFont);
                Chunk c_brandText = new Chunk(r.brand, r.ArticleFont);

                Chunk c_dateReserve = new Chunk("Date de réservation: " , r.RedFont);
                Chunk c_datText = new Chunk(r.dat.toString(), r.ArticleFont);


                // Ajout des chunks au paragraphe
                // preface.add(c_nom);preface.add(c_nomText);
                // preface.add(Chunk.NEWLINE);
                preface.add(c_id); 
                preface.add(c_idText);
                preface.add(Chunk.NEWLINE);
                preface.add(c_fixedText); 
                preface.add(c_articleText);
                preface.add(Chunk.NEWLINE);
                preface.add(c_brand);
                preface.add(c_brandText);
                preface.add(Chunk.NEWLINE);
                preface.add(c_periodeReserve);
                preface.add(c_periodeText);
                preface.add(Chunk.NEWLINE);
                preface.add(c_dateReserve);
                preface.add(c_datText);


                  // Ajout du paragraphe au document
                document.add(preface);



                document.close();

                int valid =JOptionPane.showOptionDialog(
                null,
                new Object[] {
                "Voulez-vous directement ouvrir le fichier ?",
                   " ----------------------------",
                "Cliquez sur \"QUI\" pour ouvrir ou sur \"NON\" pour annuler",
                },
                "Ouverture du fichier "+name_f,
                JOptionPane. YES_NO_OPTION,

                JOptionPane. WARNING_MESSAGE, null, null, "ok");
                if (valid == JOptionPane.OK_OPTION) {
                        File ouvrir = new File (name_f);
                        Desktop desk= Desktop.getDesktop();
                        desk.open (ouvrir);

                }            
        }
    catch(Exception e){
        
    }
    }
}


/*

  public void PrintResevation(String idReservation) throws FileNotFoundException, DocumentException, IOException{
        File folder = new File("documents");
        if(!folder.exists()){
            folder.mkdir();
        }
        String nom_fichier="documents/Reservation.pdf";
        Font TilteFont =new Font (Font.FontFamily.TIMES_ROMAN, 16, Font. BOLD, BaseColor.BLUE);

        Font RedFont = new Font (Font.FontFamily.TIMES_ROMAN, 14, Font. BOLD, BaseColor.RED);


         LineSeparator ls = new LineSeparator();

         ls.setLineColor (BaseColor.BLUE);




PreparedStatement pr ;
Document document =new Document();
try {
String sql="SELECT FROM Reservation WHERE idReservation = ?";

 pr=connexionDb.getConnection().prepareStatement(sql);
pr.setString(1, idReservation);
ResultSet rs =pr.executeQuery();

rs.first(); String nom =rs.getString("fullname");
String article =rs.getString("nomArticle");
String periode =rs.getString("periodeReserve");
String dat =rs.getString("dateReserve");
PdfWriter.getInstance(document, new FileOutputStream(nom_fichier));

document.open();

document.addTitle ("Document de Resrvation  "+nom);

document.addAuthor("AD-INFO");

nom= nom.toUpperCase(); 

Paragraph preface= new Paragraph();

Paragraph titre= new Paragraph ("INFORMATIONS SUR L'ELEVE "+nom,TilteFont);
 titre.setAlignment(Element.ALIGN_CENTER);

preface.add(titre);

preface.add(ls);

//création des chunks

Chunk c_nom = new Chunk("Fullname: " + nom, RedFont);
                Chunk c_nomArticle = new Chunk("Nom de l'article: " + article, RedFont);
                Chunk c_periodeReserve = new Chunk("Période de réservation: " + periode, RedFont);
                Chunk c_dateReserve = new Chunk("Date de réservation: " + dat, RedFont);
//preface.add(new Paragraph(" "));preface.add(new Paragraph(" "));
                // Ajout des chunks au paragraphe
                preface.add(c_nom);
                preface.add(Chunk.NEWLINE);
                preface.add(c_nomArticle);
                preface.add(Chunk.NEWLINE);
                preface.add(c_periodeReserve);
                preface.add(Chunk.NEWLINE);
                preface.add(c_dateReserve);

                // Ajout du paragraphe au document
                document.add(preface);
                 document.close();
               
int valid =JOptionPane.showOptionDialog(
null,
new Object[] {
"Voulez-vous directement ouvrir le fichier ?",
   " ----------------------------",
"Cliquez sur \"QUI\" pour ouvrir ou sur \"NON\" pour annuler",
},
"Ouverture du fichier "+nom_fichier,
JOptionPane. YES_NO_OPTION,

JOptionPane. WARNING_MESSAGE, null,
null,
"ok"
);
if (valid == JOptionPane.OK_OPTION) {
File ouvrir = new File (nom_fichier);
Desktop desk= Desktop.getDesktop();
desk.open (ouvrir);

}

} catch (SQLException ex) {

 JOptionPane.showMessageDialog(null, "connection with DB failed");

}
}

*/
