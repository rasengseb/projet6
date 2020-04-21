package fr.rasen.business.contract.manager;

import fr.rasen.model.bean.bdd.Utilisateur;
import fr.rasen.model.bean.ressource.UtilisateurProperties;

public interface UtilisateurManager {

    Utilisateur connexion(String pseudo, String mdp);

    boolean addUtilisateur(Utilisateur utilisateur);

    UtilisateurProperties getProfile();
}
