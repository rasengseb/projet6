package fr.rasen.escalade.business.contract;

import fr.rasen.escalade.business.contract.manager.AdresseManager;
import fr.rasen.escalade.business.contract.manager.ContactManager;
import fr.rasen.escalade.business.contract.manager.SiteManager;
import fr.rasen.escalade.business.contract.manager.UtilisateurManager;
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
}
