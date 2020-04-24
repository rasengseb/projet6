package fr.rasen.escalade.business.impl;

import fr.rasen.escalade.business.contract.manager.UtilisateurManager;
import fr.rasen.escalade.business.contract.ManagerFactory;

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
