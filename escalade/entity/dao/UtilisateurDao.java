package dao;

import hibernate.Utilisateur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UtilisateurDao {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("connect");

    public void saveUser(Utilisateur utilisateur){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        if(utilisateur.getId()==null){
            em.persist(utilisateur);
        }else{
            em.merge(utilisateur);
        }
    }

    public Utilisateur showUser (Integer id){
        EntityManager em = emf.createEntityManager();
        return em.find(Utilisateur.class, id);
    }

    public void deleteUser(Integer id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.remove(em.find(Utilisateur.class, id));
        tx.commit();
    }
}
