package dao;

import hibernate.Commentaire;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CommentaireDao {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("connect");

    public void saveUser(Commentaire commentaire){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        if(commentaire.getId()==null){
            em.persist(commentaire);
        }else{
            em.merge(commentaire);
        }
    }

    public Commentaire showUser (Integer id){
        EntityManager em = emf.createEntityManager();
        return em.find(Commentaire.class, id);
    }

    public void deleteUser(Integer id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.remove(em.find(Commentaire.class, id));
        tx.commit();
    }
}
