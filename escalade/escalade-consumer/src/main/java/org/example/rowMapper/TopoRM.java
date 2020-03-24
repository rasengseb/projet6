package org.example.rowMapper;

import org.example.site.Topo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TopoRM implements RowMapper<Topo> {
    @Override
    public Topo mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
