package fr.rasen.escalade.business.impl;

import fr.rasen.escalade.business.contract.ManagerFactory;
import fr.rasen.escalade.business.contract.manager.ContactManager;
import fr.rasen.escalade.business.contract.manager.SiteManager;
import fr.rasen.escalade.business.contract.manager.UtilisateurManager;

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
        return null;
    }

    @Override
    public void setSiteManager(SiteManager pSiteManager) {

    }


}
