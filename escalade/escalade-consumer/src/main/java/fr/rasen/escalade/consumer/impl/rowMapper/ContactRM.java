package fr.rasen.escalade.consumer.impl.rowMapper;

import fr.rasen.escalade.model.bean.Contact;

import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class ContactRM implements RowMapper<Contact> {

    @Override
    public Contact mapRow(ResultSet pRS, int pRowNum) throws SQLException {
        Contact contact = new Contact();
        contact.setId(pRS.getInt("id"));
        contact.setMail(pRS.getString("mail"));
        contact.setObjet(pRS.getString("objet"));
        contact.setMessage(pRS.getString("message"));

        return contact;
    }
}
