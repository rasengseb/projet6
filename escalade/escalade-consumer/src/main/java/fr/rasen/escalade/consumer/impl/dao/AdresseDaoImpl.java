package fr.rasen.escalade.consumer.impl.dao;

import fr.rasen.escalade.consumer.contract.dao.AdresseDao;
import fr.rasen.escalade.consumer.impl.rowMapper.AdresseRM;
import fr.rasen.escalade.model.bean.Adresse;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class AdresseDaoImpl extends AbstractDao implements AdresseDao {

    @Inject
    AdresseRM adresseRM;

    @Override
    public boolean addAdresse(Adresse adresse) {
        String vSQL = "INSERT INTO adresse (numero, rue, codePostal, ville) VALUES ('" +
                adresse.getNumero() + "', '" +
                adresse.getRue() + "', " +
                adresse.getCodePostal() + "' " +
                adresse.getVille() + "')";
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("numero", adresse.getNumero());
        vParams.addValue("rue", adresse.getRue());
        vParams.addValue("codePostal", adresse.getCodePostal());
        vParams.addValue("ville", adresse.getVille());
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        int vNbreLigneMaj = vJdbcTemplate.update(vSQL, vParams);
        if(vNbreLigneMaj == 1){
            return true;
        } else {
            return false;
        }
    }
}
