package fr.rasen.escalade.business.impl.manager;

import fr.rasen.escalade.business.contract.manager.AdresseManager;
import fr.rasen.escalade.model.bean.Adresse;

import javax.inject.Named;

@Named
public class AdresseManagerImpl extends AbstractManager implements AdresseManager {

    @Override
    public boolean addAdresse(Adresse adresse) {
        return getDaoFactory().getAdresseDao().addAdresse(adresse);
    }
}
