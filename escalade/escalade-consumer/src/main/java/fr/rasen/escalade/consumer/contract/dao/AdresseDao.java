package fr.rasen.escalade.consumer.contract.dao;

import fr.rasen.escalade.model.bean.Adresse;

public interface AdresseDao {

    boolean addAdresse(Adresse adresse);
    int getIdAdresse(Adresse adresse);
}
