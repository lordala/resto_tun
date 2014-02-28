/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.tunsie.entities;

/**
 *
 * @author kaka
 */
public class Restaurant {
    public int  id ;
    public String nom ;
    public String adress ;
    public String tel ;
    public  String  id_res ;
    public int nbr_fourchette ;

    public Restaurant() {
    }

    public Restaurant(String nom, String adress, String tel, int nbr_fourchette) {
        this.nom = nom;
        this.adress = adress;
        this.tel = tel;
        this.nbr_fourchette = nbr_fourchette;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_res() {
        return id_res;
    }

    public void setId_res(String id_res) {
        this.id_res = id_res;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getNbr_fourchette() {
        return nbr_fourchette;
    }

    public void setNbr_fourchette(int nbr_fourchette) {
        this.nbr_fourchette = nbr_fourchette;
    }
   
    
}
