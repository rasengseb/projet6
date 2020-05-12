package fr.rasen.escalade.business.impl.manager;

import fr.rasen.escalade.business.contract.manager.ContactManager;

import javax.inject.Named;

@Named
public class ContactManagerImpl extends AbstractManager implements ContactManager {


    @Override
    public boolean addContact(String mail, String objet, String message) {
        return getDaoFactory().getContactDao().addContact(mail, objet, message);
    }
}
