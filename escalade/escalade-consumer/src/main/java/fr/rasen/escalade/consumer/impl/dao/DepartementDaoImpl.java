package fr.rasen.escalade.consumer.impl.dao;

import fr.rasen.escalade.consumer.contract.dao.DepartementDao;
import fr.rasen.escalade.consumer.impl.rowMapper.DepartementRM;
import fr.rasen.escalade.consumer.impl.rowMapper.RegionRM;
import fr.rasen.escalade.model.bean.Departement;
import fr.rasen.escalade.model.bean.Region;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class DepartementDaoImpl extends AbstractDao implements DepartementDao {
    @Inject
    DepartementRM departementRM;

    @Override
    public List<Departement> getAll() {
        String vSQL = "SELECT * FROM departement";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
        return jdbcTemplate.query(vSQL, departementRM);
    }
}
