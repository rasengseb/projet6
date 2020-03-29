package org.example.impl.rowMapper;

import org.example.bean.Departement;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartementRM implements RowMapper<Departement> {
    @Override
    public Departement mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
