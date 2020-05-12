package fr.rasen.escalade.webapp.resource.projectResource;

import fr.rasen.escalade.webapp.resource.AbstractResource;

import javax.inject.Named;

@Named
public class ContactResource extends AbstractResource {

    public boolean addContact(String mail, String object, String message){
        return getManagerFactory().getContactManager().addContact(mail, object, message);
    }
}
