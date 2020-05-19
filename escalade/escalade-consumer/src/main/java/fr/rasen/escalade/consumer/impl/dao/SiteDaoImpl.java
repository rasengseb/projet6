package fr.rasen.escalade.consumer.impl.dao;

import fr.rasen.escalade.consumer.contract.dao.SiteDao;
import fr.rasen.escalade.consumer.impl.rowMapper.SiteRM;
import fr.rasen.escalade.model.bean.Adresse;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SiteDaoImpl extends AbstractDao implements SiteDao {

    @Inject
    SiteRM siteRM;


    @Override
    public boolean addSite(String nom, Adresse adresse) {
        String vSQL ="INSERT INTO site (nom, id_adresse) VALUES ('" + nom +"', '" + adresse.getId() + "')";
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("nom", nom);
        vParams.addValue("id_adresse", adresse.getId());
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        int vNbrLigneMaj = vJdbcTemplate.update(vSQL, vParams);
        if(vNbrLigneMaj == 1){
            return true;
        } else {
            return false;
        }
    }
}
