package org.example.contract;

import org.example.contract.manager.UtilisateurManager;

public interface ManagerFactory {

    // UTILISATEUR
    UtilisateurManager getUtilisateurManager();
    void setUtilisateurManager(UtilisateurManager pUtilisateurManager);
}