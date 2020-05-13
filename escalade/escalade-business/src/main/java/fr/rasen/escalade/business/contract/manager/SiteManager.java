package fr.rasen.escalade.business.contract.manager;

import fr.rasen.escalade.model.bean.Adresse;

public interface SiteManager {

    boolean addSite(String nom, Adresse adresse);
}
