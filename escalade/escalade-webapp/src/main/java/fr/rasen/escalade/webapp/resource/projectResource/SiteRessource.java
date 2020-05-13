package fr.rasen.escalade.webapp.resource.projectResource;

import fr.rasen.escalade.model.bean.Adresse;
import fr.rasen.escalade.webapp.resource.AbstractResource;

import javax.inject.Named;

@Named
public class SiteRessource extends AbstractResource {

    public boolean addSite(String nom, Adresse adresse){
        return getManagerFactory().getSiteManager().addSite(nom, adresse);
    }
}
