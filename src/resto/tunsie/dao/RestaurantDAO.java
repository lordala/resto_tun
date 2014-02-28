/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.tunsie.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import resto.tunsie.entities.Restaurant;
import resto.tunsie.util.MyConnection;

/**
 *
 * @author kaka
 */
public class RestaurantDAO {
   
     public void insertRestaurant(Restaurant r){


        String requete = "insert into Restaurant (nom_Restaurant,adresse_Restaurant,telephone_Restaurant,nbrfourchette) values (?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,r.getNom());
            ps.setString(2, r.getAdress());
            ps.setString(3, r.getTel());
            ps.setInt(4, r.getNbr_fourchette());
           
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

 public  List<Restaurant> DisplayAllRestaurant (){


        List<Restaurant> listedepots = new ArrayList<Restaurant>();

        String requete = "select * from Restaurant";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            RestaurantDAO resdao= new RestaurantDAO();
            while(resultat.next()){
                Restaurant  Restaurant=new Restaurant();

                Restaurant.setId(resultat.getInt(1));
                Restaurant.setNom(resultat.getString(2));
                Restaurant.setAdress(resultat.getString(3));
                Restaurant.setTel(resultat.getString(4));
              Restaurant.setId_res(resultat.getString(5));
              Restaurant.setNbr_fourchette(resultat.getInt(6));

                listedepots.add(Restaurant);
            }
            return listedepots;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
    
   
    
    
}
