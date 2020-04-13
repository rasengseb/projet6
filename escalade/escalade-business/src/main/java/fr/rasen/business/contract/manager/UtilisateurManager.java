package fr.rasen.business.contract.manager;

import fr.rasen.model.bean.Utilisateur;

public interface UtilisateurManager {

    Utilisateur connexion(String pseudo, String mdp);

    boolean addUtilisateur(Utilisateur utilisateur);
}
