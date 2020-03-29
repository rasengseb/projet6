package org.example.contract.dao;

import org.example.bean.Utilisateur;

public interface UtilisateurDao {

    /**
     * Ajout un Utilisateur dans la base de données
     * @param utilisateur utilisateur à ajouter
     */
    void create(Utilisateur utilisateur);

    /**
     * Utilise les informations de l'objet pour se connecter
     * @param utilisateur contient les informations pour se connecter
     * @return si la connexion est réussi ou non
     */
    boolean connexion(Utilisateur utilisateur);

    /**
     * mise à jour des données d'un utilisateur enregistré
     * @param utilisateur contient les nouvelles données à ajouter
     * @return si la mise à jour a réussi
     */
    boolean update(Utilisateur utilisateur);

    /**
     * Recherche les informations d'un utilisateur
     * @param pseudo paramètre de recherche de l'utilisateur
     * @return Objet Utilisateur contenant les informations
     */
    Utilisateur search(String pseudo);

}
