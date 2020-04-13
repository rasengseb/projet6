package fr.rasen.consumer.impl;

import fr.rasen.consumer.contract.DaoFactory;
import fr.rasen.consumer.contract.dao.UtilisateurDao;

import javax.inject.Inject;
import javax.inject.Named;

@Named("daoFactory")
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
