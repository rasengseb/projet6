package fr.rasen.escalade.business.contract.manager;

import fr.rasen.escalade.model.bean.Utilisateur;
import fr.rasen.escalade.model.bean.ressource.UtilisateurProperties;

public interface UtilisateurManager {

    Utilisateur connexion(String pseudo, String mdp);

    boolean addUtilisateur(Utilisateur utilisateur);

}
