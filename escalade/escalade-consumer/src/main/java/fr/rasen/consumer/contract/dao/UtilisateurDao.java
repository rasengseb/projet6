package fr.rasen.consumer.contract.dao;

import fr.rasen.model.bean.bdd.Utilisateur;

public interface UtilisateurDao {

    Utilisateur connexion (String pseudo, String mdp);

    boolean addUtilisateur (Utilisateur utilisateur);

}
