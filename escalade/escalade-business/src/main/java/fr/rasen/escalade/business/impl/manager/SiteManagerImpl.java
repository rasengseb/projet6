package fr.rasen.escalade.business.impl.manager;

import fr.rasen.escalade.business.contract.manager.SiteManager;
import fr.rasen.escalade.model.bean.Adresse;

import javax.inject.Named;

@Named
public class SiteManagerImpl extends AbstractManager implements SiteManager {


    @Override
    public boolean addSite(String nom, Adresse adresse) {
        return getDaoFactory().getSiteDao().addSite(nom, adresse);
    }
}
