package fr.rasen.escalade.webapp.resource.projectResource;

import fr.rasen.escalade.webapp.resource.AbstractResource;

import javax.inject.Named;
import java.util.List;

@Named
public class DepartementResource extends AbstractResource {

    public List getAllDepts(){
        return getManagerFactory().getDepartementManager().getAll();
    }
}
