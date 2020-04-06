package fr.rasen.impl.rowMapper;

import fr.rasen.bean.Adresse;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdresseRM implements RowMapper<Adresse> {
    @Override
    public Adresse mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
