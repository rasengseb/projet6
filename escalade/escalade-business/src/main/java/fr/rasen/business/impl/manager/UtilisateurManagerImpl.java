package fr.rasen.business.impl.manager;

import fr.rasen.business.contract.manager.UtilisateurManager;
import fr.rasen.model.bean.Utilisateur;

import javax.inject.Named;

@Named
public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager {


    @Override
    public Utilisateur connexion(String pseudo, String mdp) {
        Utilisateur utilisateur = getDaoFactory().getUtilisateurDao().connexion(pseudo, mdp);

        return utilisateur;
    }

    @Override
    public boolean addUtilisateur(Utilisateur utilisateur) {
        boolean checkInsert = getDaoFactory().getUtilisateurDao().addUtilisateur(utilisateur);
        return checkInsert;
    }
}
