package fr.rasen.escalade.consumer.impl.dao;

import fr.rasen.escalade.consumer.contract.dao.ContactDao;
import fr.rasen.escalade.consumer.impl.rowMapper.ContactRM;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ContactDaoImpl extends AbstractDao implements ContactDao {

    @Inject
    ContactRM contactRM;

    @Override
    public boolean addContact(String mail, String objet, String message) {
        String vSQL = "INSERT INTO contact (mail, objet, message) VALUES('" + mail +"', '" + objet +"', '" + message + "')";
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("mail", mail);
        vParams.addValue("objet", objet);
        vParams.addValue("message", message);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        int vNbrLigneMaj = vJdbcTemplate.update(vSQL, vParams);
        if(vNbrLigneMaj == 1){
            return true;
        } else{
            return false;
        }
    }
}
