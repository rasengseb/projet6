package org.example.impl.manager;

import org.example.contract.manager.UtilisateurManager;
import org.example.bean.Utilisateur;
import org.example.exception.NotFoundException;

import javax.inject.Named;
import javax.rmi.CORBA.Util;
import java.util.List;

@Named
public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager {


    @Override
    public Utilisateur connexion(String pseudo, String mdp) {
        Utilisateur utilisateur = getDaoFactory().getUtilisateurDao().connexion(pseudo,mdp);

        return utilisateur;
    }

    @Override
    public Utilisateur addUtilisateur(String pseudo, String mdp, String nom, String prenom, String mail, boolean isAdmin) {
        Utilisateur utilisateur = getDaoFactory().getUtilisateurDao().addUtilisateur(pseudo, mdp, nom, prenom, mail, isAdmin);
        return utilisateur;
    }
}
