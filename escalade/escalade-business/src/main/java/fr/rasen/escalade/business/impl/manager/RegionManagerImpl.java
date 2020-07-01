package fr.rasen.escalade.business.impl.manager;

import fr.rasen.escalade.business.contract.manager.RegionManager;
import fr.rasen.escalade.model.bean.Region;

import javax.inject.Named;
import java.util.List;

@Named
public class RegionManagerImpl extends AbstractManager implements RegionManager {
    @Override
    public List<Region> getAll() {
        return getDaoFactory().getRegionDao().getAll();
    }
}
