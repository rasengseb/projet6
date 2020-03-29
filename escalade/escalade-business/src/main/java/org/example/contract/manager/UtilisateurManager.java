package org.example.contract.manager;

import org.example.bean.Utilisateur;
import org.example.exception.NotFoundException;

import java.util.List;

public interface UtilisateurManager {

    List<Utilisateur> getListUtilisateur();

    Utilisateur getUtilisateur(Integer pId) throws NotFoundException;
}
