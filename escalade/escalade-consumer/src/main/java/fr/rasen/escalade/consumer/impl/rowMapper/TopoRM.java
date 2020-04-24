package fr.rasen.escalade.consumer.impl.rowMapper;

import fr.rasen.escalade.model.bean.bdd.Topo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TopoRM implements RowMapper<Topo> {
    @Override
    public Topo mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
