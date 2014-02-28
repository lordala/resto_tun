/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resto.tunsie.dao;

import resto.tunsie.entities.Restaurateur;
import resto.tunsie.entities.Clients;
import resto.tunsie.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARWEN
 */
public class CnxDAO {

    public List<String> cnxRestaurateur() {


        List<String> list = new ArrayList<String>();

        String requete = "select login_restaurateur,pass_restaurateur from restaurateur where activation='1'";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                list.add(resultat.getString(1));
                list.add(resultat.getString(2));
               

            }
            return list;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }
    }

    public List<String> cnxclient() {


        List<String> list = new ArrayList<String>();

        String requete = "select login_client,pass_client from client where activation='1'";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                list.add(resultat.getString(1));
                list.add(resultat.getString(2));

            }
            return list;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }
    }
    public List<String> cnxadmin() {


        List<String> list = new ArrayList<String>();

        String requete = "select login_admin,pass_admin from admin";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                list.add(resultat.getString(1));
                list.add(resultat.getString(2));

            }
            return list;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }
    }
}
