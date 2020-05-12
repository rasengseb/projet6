package fr.rasen.escalade.consumer.impl;

import fr.rasen.escalade.consumer.contract.DaoFactory;
import fr.rasen.escalade.consumer.contract.dao.ContactDao;
import fr.rasen.escalade.consumer.contract.dao.UtilisateurDao;

import javax.inject.Inject;
import javax.inject.Named;

@Named("daoFactory")
public class DaoFactoryImpl implements DaoFactory {

    @Inject
    UtilisateurDao utilisateurDaoImpl;
    @Inject
    ContactDao contactDaoImpl;



    //UTILISATEUR

    @Override
    public UtilisateurDao getUtilisateurDao() {
        return utilisateurDaoImpl;
    }
    @Override
    public void setUtilisateurDao(UtilisateurDao pUtilisateurDao) {
        this.utilisateurDaoImpl = pUtilisateurDao;
    }

    //CONTACT
    @Override
    public ContactDao getContactDao() {
        return contactDaoImpl;
    }

    @Override
    public void setContactDao(ContactDao pContactDao) {
        contactDaoImpl = pContactDao;
    }

}
