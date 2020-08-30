package dao;

import hibernate.Image;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ImageDao {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("connect");

    public void saveUser(Image image){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        if(image.getId()==null){
            em.persist(image);
        }else{
            em.merge(image);
        }
    }

    public Image showUser (Integer id){
        EntityManager em = emf.createEntityManager();
        return em.find(Image.class, id);
    }

    public void deleteUser(Integer id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.remove(em.find(Image.class, id));
        tx.commit();
    }
}
