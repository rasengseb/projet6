package fr.rasen.contract.dao;

import fr.rasen.bean.Utilisateur;

public interface UtilisateurDao {

    Utilisateur connexion (String pseudo, String mdp);

    Utilisateur addUtilisateur (String pseudo, String mdp, String nom, String prenom, String mail, boolean idAdmin);

}
