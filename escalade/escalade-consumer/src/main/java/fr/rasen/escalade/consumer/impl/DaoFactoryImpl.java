package fr.rasen.escalade.consumer.impl;

import fr.rasen.escalade.consumer.contract.DaoFactory;
import fr.rasen.escalade.consumer.contract.dao.AdresseDao;
import fr.rasen.escalade.consumer.contract.dao.ContactDao;
import fr.rasen.escalade.consumer.contract.dao.SiteDao;
import fr.rasen.escalade.consumer.contract.dao.UtilisateurDao;

import javax.inject.Inject;
import javax.inject.Named;

@Named("daoFactory")
public class DaoFactoryImpl implements DaoFactory {

    @Inject
    UtilisateurDao utilisateurDaoImpl;
    @Inject
    ContactDao contactDaoImpl;
    @Inject
    SiteDao siteDaoImpl;
    @Inject
    AdresseDao adresseDaoImpl;


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


    //SITE
    @Override
    public SiteDao getSiteDao() {
        return siteDaoImpl;
    }

    @Override
    public void setSiteDao(SiteDao pSiteDao) {
        siteDaoImpl = pSiteDao;
    }

    //ADRESSE
    @Override
    public AdresseDao getAdresseDao() {
        return adresseDaoImpl;
    }

    @Override
    public void setAdresseDao(AdresseDao pAdresseDao) {
        adresseDaoImpl = pAdresseDao;
    }

}
