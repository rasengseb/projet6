package org.example.contract.dao;

import org.example.bean.Utilisateur;

public interface UtilisateurDao {

    Utilisateur connexion (String pseudo, String mdp);

    void inscription (Utilisateur utilisateur);

}
