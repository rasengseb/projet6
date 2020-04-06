package fr.rasen.contract.manager;

import fr.rasen.bean.Utilisateur;

public interface UtilisateurManager {

    Utilisateur connexion(String pseudo, String mdp);

    Utilisateur addUtilisateur(String pseudo, String mdp, String nom, String prenom, String mail, boolean isAdmin);
}
