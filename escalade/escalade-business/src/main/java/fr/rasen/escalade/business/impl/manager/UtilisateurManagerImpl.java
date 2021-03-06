package fr.rasen.escalade.business.impl.manager;

import fr.rasen.escalade.business.contract.manager.UtilisateurManager;
import fr.rasen.escalade.model.bean.Utilisateur;

import javax.inject.Named;

@Named
public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager {


    @Override
    public Utilisateur connexion(String pseudo, String mdp) {
        return getDaoFactory().getUtilisateurDao().connexion(pseudo, mdp);
    }

    @Override
    public boolean addUtilisateur(Utilisateur utilisateur) {
        return getDaoFactory().getUtilisateurDao().addUtilisateur(utilisateur);
    }

    @Override
    public boolean majUtilisateur(Utilisateur utilisateur) {
        return getDaoFactory().getUtilisateurDao().majUtilisateur(utilisateur);
    }


}
