package fr.rasen.escalade.business.impl;

import fr.rasen.escalade.business.contract.ManagerFactory;
import fr.rasen.escalade.business.contract.manager.*;
import fr.rasen.escalade.model.bean.Adresse;

import javax.inject.Inject;
import javax.inject.Named;

@Named("managerFactory")
public class ManagerFactoryImpl implements ManagerFactory {

    @Inject
    private UtilisateurManager utilisateurManager;
    @Inject
    private ContactManager contactManager;
    @Inject
    private SiteManager siteManager;
    @Inject
    private AdresseManager adresseManager;
    @Inject
    private RegionManager regionManager;
    @Inject
    private DepartementManager departementManager;



    // UtilisateurManager : Getter et Setter
    @Override
    public UtilisateurManager getUtilisateurManager() {
        return utilisateurManager;
    }

    @Override
    public void setUtilisateurManager(UtilisateurManager pUtilisateurManager) {
        utilisateurManager = pUtilisateurManager;
    }

    //ContactManager : Getter et Setter
    @Override
    public ContactManager getContactManager() {
        return contactManager;
    }

    @Override
    public void setContactManager(ContactManager pContactManager) {
        contactManager = pContactManager;
    }


    //SiteManager : Getter et Setter
    @Override
    public SiteManager getSiteManager() {
        return siteManager;
    }

    @Override
    public void setSiteManager(SiteManager pSiteManager) {
        siteManager = pSiteManager;
    }

    //AdresseManager : Getter et Setter
    @Override
    public AdresseManager getAdresseManager() {
        return adresseManager;
    }

    @Override
    public void setAdresseManager(AdresseManager pAdresseManager) {
        adresseManager = pAdresseManager;
    }

    //RegionManager : Getter et Setter
    @Override
    public RegionManager getRegionManager() {
        return regionManager;
    }

    @Override
    public void setRegionManager(RegionManager regionManager) {
        this.regionManager = regionManager;
    }


    //DepartementManager : Getter et Setter
    @Override
    public DepartementManager getDepartementManager() {
        return departementManager;
    }

    @Override
    public void setDepartementManager(DepartementManager departementManager) {
        this.departementManager = departementManager;
    }
}
