package fr.rasen.escalade.webapp.resource.projectResource;

import fr.rasen.escalade.model.bean.Adresse;
import fr.rasen.escalade.webapp.resource.AbstractResource;

import javax.inject.Named;

@Named
public class AdresseResource extends AbstractResource {

    boolean addAdresse(Adresse adresse){
        return getManagerFactory().getAdresseManager().addAdresse(adresse);
    }
}
