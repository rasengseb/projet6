package org.example.rowMapper;

import org.example.site.Secteur;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SecteurRM implements RowMapper<Secteur> {
    @Override
    public Secteur mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
