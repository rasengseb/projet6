package fr.rasen.escalade.webapp.resource.projectResource;

import fr.rasen.escalade.webapp.resource.AbstractResource;

import javax.inject.Named;
import java.util.List;

@Named
public class RegionResource extends AbstractResource {

    public List getAllRegions(){
        return getManagerFactory().getRegionManager().getAll();
    }
}
