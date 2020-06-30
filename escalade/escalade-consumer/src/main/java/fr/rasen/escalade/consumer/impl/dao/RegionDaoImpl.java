package fr.rasen.escalade.consumer.impl.dao;

import fr.rasen.escalade.consumer.contract.dao.RegionDao;
import fr.rasen.escalade.consumer.impl.rowMapper.RegionRM;
import fr.rasen.escalade.model.bean.Region;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class RegionDaoImpl extends AbstractDao implements RegionDao {

    @Inject
    RegionRM regionRM;

    @Override
    public List getAll() {
        String vSQL = "SELECT * FROM region";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
        List<Region> listRegion = jdbcTemplate.query(vSQL, regionRM);

        return listRegion;
    }
}
