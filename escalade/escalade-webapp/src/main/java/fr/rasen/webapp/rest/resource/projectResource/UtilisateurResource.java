package fr.rasen.webapp.rest.resource.projectResource;

import fr.rasen.model.bean.Utilisateur;
import fr.rasen.webapp.rest.resource.AbstractResource;

import javax.inject.Named;

@Named
public class UtilisateurResource extends AbstractResource {


    public Utilisateur getConnexion(String pseudo, String mdp) {
        Utilisateur utilisateur = getManagerFactory().getUtilisateurManager().connexion(pseudo, mdp);
        return utilisateur;
    }

    public boolean addUtilisateur(Utilisateur utilisateur) {
        boolean checkInsert = getManagerFactory().getUtilisateurManager().addUtilisateur(utilisateur);
        return checkInsert;
    }
}
