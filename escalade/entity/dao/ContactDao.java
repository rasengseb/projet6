package dao;

import hibernate.Contact;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ContactDao {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("connect");

    public void saveUser(Contact contact){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        if(contact.getId()==null){
            em.persist(contact);
        }else{
            em.merge(contact);
        }
    }

    public Contact showUser (Integer id){
        EntityManager em = emf.createEntityManager();
        return em.find(Contact.class, id);
    }

    public void deleteUser(Integer id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.remove(em.find(Contact.class, id));
        tx.commit();
    }
}
