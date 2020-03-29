package org.example.impl.manager;

import org.example.contract.manager.UtilisateurManager;
import org.example.bean.Utilisateur;
import org.example.exception.NotFoundException;

import java.util.List;

public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager {
    @Override
    public List<Utilisateur> getListUtilisateur() {
        return null;
    }

    @Override
    public Utilisateur getUtilisateur(Integer pId) throws NotFoundException {
        return null;
    }
}
