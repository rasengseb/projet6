package org.example.rest.resource.projectResource;

import org.example.bean.Utilisateur;
import org.example.exception.NotFoundException;
import org.example.rest.resource.AbstractResource;

import java.util.List;


public class UtilisateurResource extends AbstractResource {


    public Utilisateur getUtilisateur(Integer pId) throws NotFoundException {
        Utilisateur utilisateur = getManagerFactory().getUtilisateurManager().getUtilisateur(pId);
        return utilisateur;
    }

    public List<Utilisateur> getListUtilisateur() {
        List<Utilisateur> list = getManagerFactory().getUtilisateurManager().getListUtilisateur();
        return list;
    }
}
