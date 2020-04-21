package fr.rasen.webapp.rest.resource.projectResource;

import fr.rasen.model.bean.bdd.Utilisateur;
import fr.rasen.model.bean.ressource.UtilisateurProperties;
import fr.rasen.webapp.rest.resource.AbstractResource;

import javax.inject.Named;

@Named
public class UtilisateurResource extends AbstractResource {


    public Utilisateur getConnexion(String pseudo, String mdp) {
        return getManagerFactory().getUtilisateurManager().connexion(pseudo, mdp);
    }

    public boolean addUtilisateur(Utilisateur utilisateur) {
        return getManagerFactory().getUtilisateurManager().addUtilisateur(utilisateur);
    }

    public UtilisateurProperties getProfile(){
        return getManagerFactory().getUtilisateurManager().getProfile();
    }

}
