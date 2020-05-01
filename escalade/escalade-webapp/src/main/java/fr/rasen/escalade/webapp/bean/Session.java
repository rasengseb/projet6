package fr.rasen.escalade.webapp.bean;

import fr.rasen.escalade.model.bean.Utilisateur;

import javax.inject.Named;

@Named
public class Session {

    private Utilisateur utilisateur;
    private int connecte = 0;


    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public int getConnecte() {
        return connecte;
    }

    public void setConnecte(int connecte) {
        this.connecte = connecte;
    }

    public String showUser() {
        return utilisateur.toString();
    }
}
