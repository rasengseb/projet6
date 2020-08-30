package dao;

import hibernate.Reservation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ReservationDao {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("connect");

    public void saveUser(Reservation reservation){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        if(reservation.getId()==null){
            em.persist(reservation);
        }else{
            em.merge(reservation);
        }
    }

    public Reservation showUser (Integer id){
        EntityManager em = emf.createEntityManager();
        return em.find(Reservation.class, id);
    }

    public void deleteUser(Integer id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.remove(em.find(Reservation.class, id));
        tx.commit();
    }
}
