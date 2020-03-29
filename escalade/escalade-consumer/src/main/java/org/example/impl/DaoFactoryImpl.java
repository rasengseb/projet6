package org.example.impl;

import org.example.contract.DaoFactory;
import org.example.contract.dao.UtilisateurDao;

import javax.inject.Inject;

public class DaoFactoryImpl implements DaoFactory {

    @Inject
    UtilisateurDao utilisateurDaoImpl;



    //UTILISATEUR

    @Override
    public UtilisateurDao getUtilisateurDao() {
        return utilisateurDaoImpl;
    }
    @Override
    public void setUtilisateurDao(UtilisateurDao pUtilisateurDao) {
        this.utilisateurDaoImpl=pUtilisateurDao;
    }
}
