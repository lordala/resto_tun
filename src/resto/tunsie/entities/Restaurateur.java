/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.tunsie.entities;

/**
 *
 * @author Karray
 */
public class Restaurateur {

    private int id_restaurateur;
    private String nom_restaurateur;
    private String prenom_restaurateur;
    private String login_restaurateur;
    private String pass_restaurateur;
    private String mail_restaurateur;

    public int getId_restaurateur() {
        return id_restaurateur;
    }

    public void setId_restaurateur(int id_restaurateur) {
        this.id_restaurateur = id_restaurateur;
    }

    public String getLogin_restaurateur() {
        return login_restaurateur;
    }

    public void setLogin_restaurateur(String login_restaurateur) {
        this.login_restaurateur = login_restaurateur;
    }

    public String getMail_restaurateur() {
        return mail_restaurateur;
    }

    public void setMail_restaurateur(String mail_restaurateur) {
        this.mail_restaurateur = mail_restaurateur;
    }

    public String getNom_restaurateur() {
        return nom_restaurateur;
    }

    public void setNom_restaurateur(String nom_restaurateur) {
        this.nom_restaurateur = nom_restaurateur;
    }

    public String getPass_restaurateur() {
        return pass_restaurateur;
    }

    public void setPass_restaurateur(String pass_restaurateur) {
        this.pass_restaurateur = pass_restaurateur;
    }

    public String getPrenom_restaurateur() {
        return prenom_restaurateur;
    }

    public void setPrenom_restaurateur(String prenom_restaurateur) {
        this.prenom_restaurateur = prenom_restaurateur;
    }
}


