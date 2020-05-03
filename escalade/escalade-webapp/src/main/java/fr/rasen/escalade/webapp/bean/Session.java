package fr.rasen.escalade.webapp.bean;

import fr.rasen.escalade.model.bean.Utilisateur;

import javax.inject.Named;

@Named
public class Session {

    private Utilisateur utilisateur;
    private String connecte = "false";


    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getConnecte() {
        return connecte;
    }

    public void setConnecte(String connecte) {
        this.connecte = connecte;
    }

    public String showUser() {
        return utilisateur.toString();
    }
}
