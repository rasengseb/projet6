package fr.rasen.escalade.consumer.contract.dao;

import fr.rasen.escalade.model.bean.Adresse;

public interface SiteDao {

    boolean addSite(String nom, Adresse adresse);
}
