package fr.rasen.escalade.consumer.contract.dao;

public interface ContactDao {

    boolean addContact(String mail, String objet, String message);
}
