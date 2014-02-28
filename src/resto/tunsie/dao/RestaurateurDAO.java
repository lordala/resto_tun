/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.tunsie.dao;

import resto.tunsie.entities.Restaurateur;
import resto.tunsie.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marwen
 */
public class RestaurateurDAO {

    public RestaurateurDAO() {
    }




     public void insertRestaurateur(Restaurateur r){


        String requete = "insert into restaurateur (nom_restaurateur,prenom_restaurateur,login_restaurateur,pass_restaurateur,mail_restaurateur) values (?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,r.getNom_restaurateur());
            ps.setString(2, r.getPrenom_restaurateur());
            ps.setString(3, r.getLogin_restaurateur());
            ps.setString(4, r.getPass_restaurateur());
            ps.setString(5, r.getMail_restaurateur());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

 public List<Restaurateur> DisplayAllRestaurateur (){


        List<Restaurateur> listedepots = new ArrayList<Restaurateur>();

        String requete = "select * from restaurateur";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            RestaurateurDAO resdao= new RestaurateurDAO();
            while(resultat.next()){
                Restaurateur  restaurateur=new Restaurateur();

                restaurateur.setId_restaurateur(resultat.getInt(1));
                restaurateur.setNom_restaurateur(resultat.getString(2));
                restaurateur.setPrenom_restaurateur(resultat.getString(3));
                restaurateur.setLogin_restaurateur(resultat.getString(4));
              restaurateur.setMail_restaurateur(resultat.getString(6));

                listedepots.add(restaurateur);
            }
            return listedepots;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
}
