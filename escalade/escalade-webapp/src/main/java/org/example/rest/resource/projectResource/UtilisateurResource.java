package org.example.rest.resource.projectResource;

import org.example.bean.Utilisateur;
import org.example.exception.NotFoundException;
import org.example.rest.resource.AbstractResource;

import javax.inject.Named;
import java.util.List;

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
