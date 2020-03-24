package org.example.rowMapper;

import org.example.site.Adresse;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdresseRM implements RowMapper<Adresse> {
    @Override
    public Adresse mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
