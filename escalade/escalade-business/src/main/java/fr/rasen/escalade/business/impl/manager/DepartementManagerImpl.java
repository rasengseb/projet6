package fr.rasen.escalade.business.impl.manager;

import fr.rasen.escalade.business.contract.manager.DepartementManager;
import fr.rasen.escalade.model.bean.Departement;

import javax.inject.Named;
import java.util.List;

@Named
public class DepartementManagerImpl extends AbstractManager implements DepartementManager {
    @Override
    public List<Departement> getAll() {
        return getDaoFactory().getDepartementDao().getAll();
    }
}
