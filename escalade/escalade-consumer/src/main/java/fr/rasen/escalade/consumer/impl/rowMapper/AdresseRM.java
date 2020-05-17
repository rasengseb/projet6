package fr.rasen.escalade.consumer.impl.rowMapper;

import fr.rasen.escalade.model.bean.Adresse;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class AdresseRM implements RowMapper<Adresse> {

    @Override
    public Adresse mapRow(ResultSet resultSet, int i) throws SQLException {
        Adresse adresse = new Adresse();
        adresse.setId(resultSet.getInt("id"));
        adresse.setNumero(resultSet.getInt("numero"));
        adresse.setRue(resultSet.getString("rue"));
        adresse.setCodePostal(resultSet.getInt("codePostal"));
        adresse.setVille(resultSet.getString("ville"));

        return adresse;
    }
}
