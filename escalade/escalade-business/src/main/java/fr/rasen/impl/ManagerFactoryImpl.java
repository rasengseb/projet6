package fr.rasen.impl;

import fr.rasen.contract.manager.UtilisateurManager;
import fr.rasen.contract.ManagerFactory;

import javax.inject.Inject;
import javax.inject.Named;

@Named("managerFactory")
public class ManagerFactoryImpl implements ManagerFactory {

    @Inject
    private UtilisateurManager utilisateurManager;


    // UtilisateurManager : Getter et Setter
    @Override
    public UtilisateurManager getUtilisateurManager() {
        return utilisateurManager;
    }

    @Override
    public void setUtilisateurManager(UtilisateurManager pUtilisateurManager) {
        utilisateurManager=pUtilisateurManager;
    }
}
