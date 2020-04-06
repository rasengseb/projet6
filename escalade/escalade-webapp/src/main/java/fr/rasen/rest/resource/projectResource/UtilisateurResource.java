package fr.rasen.rest.resource.projectResource;

import fr.rasen.bean.Utilisateur;
import fr.rasen.rest.resource.AbstractResource;

import javax.inject.Named;

@Named
public class UtilisateurResource extends AbstractResource {


    public Utilisateur getConnexion (String pseudo, String mdp){
        Utilisateur utilisateur = getManagerFactory().getUtilisateurManager().connexion(pseudo, mdp);
        return utilisateur;
    }

    public Utilisateur addUtilisateur (String pseudo, String mdp, String nom, String prenom, String mail, boolean isAdmin){
        Utilisateur utilisateur = getManagerFactory().getUtilisateurManager().addUtilisateur(pseudo, mdp, nom, prenom, mail, isAdmin);
        return utilisateur;
    }
}
