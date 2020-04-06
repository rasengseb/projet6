package org.example.contract.dao;

import org.example.bean.Utilisateur;

public interface UtilisateurDao {

    Utilisateur connexion (String pseudo, String mdp);

    Utilisateur addUtilisateur (String pseudo, String mdp, String nom, String prenom, String mail, boolean idAdmin);

}
