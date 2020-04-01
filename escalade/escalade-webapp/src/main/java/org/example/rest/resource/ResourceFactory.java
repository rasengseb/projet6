package org.example.rest.resource;

import org.example.rest.resource.projectResource.UtilisateurResource;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ResourceFactory {

    @Inject
    private UtilisateurResource utilisateurResource;


    public UtilisateurResource getUtilisateurResource() {
        return utilisateurResource;
    }

    public void setUtilisateurResource(UtilisateurResource utilisateurResource) {
        this.utilisateurResource = utilisateurResource;
    }
}
