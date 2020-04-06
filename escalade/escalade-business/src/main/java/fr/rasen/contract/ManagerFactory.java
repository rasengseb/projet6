package fr.rasen.contract;

import fr.rasen.contract.manager.UtilisateurManager;

public interface ManagerFactory {

    // UTILISATEUR
    UtilisateurManager getUtilisateurManager();
    void setUtilisateurManager(UtilisateurManager pUtilisateurManager);
}
