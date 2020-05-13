package fr.rasen.escalade.webapp.resource.projectResource;

import fr.rasen.escalade.model.bean.Utilisateur;
import fr.rasen.escalade.webapp.resource.AbstractResource;

import javax.inject.Named;

@Named
public class UtilisateurResource extends AbstractResource {


    public Utilisateur getConnexion(String pseudo, String mdp) {
        return getManagerFactory().getUtilisateurManager().connexion(pseudo, mdp);
    }

    public boolean addUtilisateur(Utilisateur utilisateur) {
        return getManagerFactory().getUtilisateurManager().addUtilisateur(utilisateur);
    }

    public boolean majUtilisateur(Utilisateur utilisateur){
        return getManagerFactory().getUtilisateurManager().majUtilisateur(utilisateur);
    }

}
