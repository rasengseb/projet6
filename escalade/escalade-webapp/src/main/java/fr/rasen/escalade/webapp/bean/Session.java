package fr.rasen.escalade.webapp.bean;

import fr.rasen.escalade.model.bean.Departement;
import fr.rasen.escalade.model.bean.Region;
import fr.rasen.escalade.model.bean.Site;
import fr.rasen.escalade.model.bean.Utilisateur;

import javax.inject.Named;
import java.util.List;

@Named
public class Session {

    private Utilisateur utilisateur;
    private boolean connecte = false;


    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public boolean getConnecte() {
        return connecte;
    }

    public void setConnecte(boolean connecte) {
        this.connecte = connecte;
    }

    public String showUser() {
        return utilisateur.toString();
    }

    public boolean isConnecte() {

        return connecte;
    }

}
