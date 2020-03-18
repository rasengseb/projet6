package org.example.impl.dao;

import org.example.contract.dao.UtilisateurDao;
import org.example.profile.Utilisateur;

public class UtilisateurDaoImpl extends AbstractDaoImpl implements UtilisateurDao {
    @Override
    public void create(Utilisateur utilisateur) {

    }

    @Override
    public boolean connexion(Utilisateur utilisateur) {
        return false;
    }

    @Override
    public boolean update(Utilisateur utilisateur) {
        return false;
    }

    @Override
    public Utilisateur search(String pseudo) {
        return null;
    }
}
