package fr.rasen.impl.manager;

import fr.rasen.contract.manager.UtilisateurManager;
import fr.rasen.bean.Utilisateur;

import javax.inject.Named;

@Named
public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager {


    @Override
    public Utilisateur connexion(String pseudo, String mdp) {
        Utilisateur utilisateur = getDaoFactory().getUtilisateurDao().connexion(pseudo, mdp);

        return utilisateur;
    }

    @Override
    public Utilisateur addUtilisateur(String pseudo, String mdp, String nom, String prenom, String mail, boolean isAdmin) {
        Utilisateur utilisateur = getDaoFactory().getUtilisateurDao().addUtilisateur(pseudo, mdp, nom, prenom, mail, isAdmin);
        return utilisateur;
    }
}
