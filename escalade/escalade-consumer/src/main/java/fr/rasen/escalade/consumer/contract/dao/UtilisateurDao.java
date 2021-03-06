package fr.rasen.escalade.consumer.contract.dao;

import fr.rasen.escalade.model.bean.Utilisateur;

public interface UtilisateurDao {

    Utilisateur connexion (String pseudo, String mdp);

    boolean addUtilisateur (Utilisateur utilisateur);

    boolean majUtilisateur(Utilisateur utilisateur);
}
