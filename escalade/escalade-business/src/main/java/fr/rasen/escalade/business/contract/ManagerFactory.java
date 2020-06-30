package fr.rasen.escalade.business.contract;

import fr.rasen.escalade.business.contract.manager.*;
import fr.rasen.escalade.model.bean.Adresse;

public interface ManagerFactory {

    // UTILISATEUR
    UtilisateurManager getUtilisateurManager();
    void setUtilisateurManager(UtilisateurManager pUtilisateurManager);

    //CONTACT
    ContactManager getContactManager();
    void setContactManager(ContactManager pContactManager);

    //SITE
    SiteManager getSiteManager();
    void setSiteManager(SiteManager pSiteManager);

    //ADRESSE
    AdresseManager getAdresseManager();
    void setAdresseManager(AdresseManager pAdresseManager);

    //REGION
    RegionManager getRegionManager();
    void setRegionManager(RegionManager pRegionManager);

    //DEPARTMENT
    DepartementManager getDepartementManager();
    void setDepartementManager(DepartementManager pDepartementManager);
}
