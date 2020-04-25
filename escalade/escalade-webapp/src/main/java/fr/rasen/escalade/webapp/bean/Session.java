package fr.rasen.escalade.webapp.bean;

import fr.rasen.escalade.model.bean.Utilisateur;

import javax.inject.Named;

@Named
public class Session {

   private Utilisateur utilisateur;



    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String showUser(){
        return utilisateur.toString();
    }
}
