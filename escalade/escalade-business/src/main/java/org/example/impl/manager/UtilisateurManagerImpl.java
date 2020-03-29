package org.example.impl.manager;

import org.example.contract.manager.UtilisateurManager;
import org.example.bean.Utilisateur;
import org.example.exception.NotFoundException;

import javax.inject.Named;
import java.util.List;

@Named
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
