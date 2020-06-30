package fr.rasen.escalade.business.impl.manager;

import fr.rasen.escalade.business.contract.manager.RegionManager;

import javax.inject.Named;
import java.util.List;

@Named
public class RegionManagerImpl extends AbstractManager implements RegionManager {
    @Override
    public List getAll() {
        return getDaoFactory().getRegionDao().getAll();
    }
}
