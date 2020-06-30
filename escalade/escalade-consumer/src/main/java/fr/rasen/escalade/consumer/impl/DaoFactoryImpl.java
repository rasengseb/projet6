package fr.rasen.escalade.consumer.impl;

import fr.rasen.escalade.consumer.contract.DaoFactory;
import fr.rasen.escalade.consumer.contract.dao.*;

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
    @Inject
    RegionDao regionDaoImpl;
    @Inject
    DepartementDao departementDaoImpl;


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

    //REGION
    @Override
    public RegionDao getRegionDao() {
        return regionDaoImpl;
    }

    @Override
    public void setRegionDao(RegionDao pRegionDao) {
        regionDaoImpl = pRegionDao;
    }

    //DEPARTEMENT
    @Override
    public DepartementDao getDepartementDao() {
        return departementDaoImpl;
    }

    @Override
    public void setDepartementDao(DepartementDao pDepartementDao) {
        departementDaoImpl = pDepartementDao;
    }

}

