package fr.rasen.escalade.consumer.impl.rowMapper;

import fr.rasen.escalade.model.bean.Adresse;
import fr.rasen.escalade.model.bean.Site;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class SiteRM implements RowMapper<Site> {

    @Override
    public Site mapRow(ResultSet resultSet, int i) throws SQLException {
        Site site = new Site();
        site.setNom(resultSet.getString("nom"));
        site.setAdresse((Adresse) resultSet.getObject("adresse"));
        return site;
    }
}
