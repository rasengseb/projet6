package org.example.impl.rowMapper;

import org.example.bean.Adresse;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdresseRM implements RowMapper<Adresse> {
    @Override
    public Adresse mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
