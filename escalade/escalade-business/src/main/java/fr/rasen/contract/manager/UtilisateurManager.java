package org.example.contract.manager;

import org.example.bean.Utilisateur;
import org.example.exception.NotFoundException;

import javax.rmi.CORBA.Util;
import javax.swing.*;
import java.util.List;

public interface UtilisateurManager {

    Utilisateur connexion(String pseudo, String mdp);

    Utilisateur addUtilisateur(String pseudo, String mdp, String nom, String prenom, String mail, boolean isAdmin);
}
