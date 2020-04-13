package fr.rasen.business.contract;

import fr.rasen.business.contract.manager.UtilisateurManager;

public interface ManagerFactory {

    // UTILISATEUR
    UtilisateurManager getUtilisateurManager();
    void setUtilisateurManager(UtilisateurManager pUtilisateurManager);
}
