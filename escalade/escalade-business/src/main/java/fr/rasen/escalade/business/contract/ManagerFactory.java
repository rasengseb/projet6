package fr.rasen.escalade.business.contract;

import fr.rasen.escalade.business.contract.manager.ContactManager;
import fr.rasen.escalade.business.contract.manager.UtilisateurManager;

public interface ManagerFactory {

    // UTILISATEUR
    UtilisateurManager getUtilisateurManager();
    void setUtilisateurManager(UtilisateurManager pUtilisateurManager);

    //CONTACT
    ContactManager getContactManager();
    void setContactManager(ContactManager pContactManager);
}
