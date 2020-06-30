package fr.rasen.escalade.consumer.impl.rowMapper;

import fr.rasen.escalade.model.bean.Departement;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class DepartementRM implements RowMapper<Departement> {
    @Override
    public Departement mapRow(ResultSet resultSet, int i) throws SQLException {
        Departement departement = new Departement();
        departement.setId(resultSet.getInt("id"));
        departement.setNumero(resultSet.getString("numero"));
        departement.setNom(resultSet.getString("nom"));

        return departement;
    }
}
