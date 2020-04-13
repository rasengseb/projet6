package fr.rasen.consumer.impl.rowMapper;

import fr.rasen.model.bean.Region;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegionRM implements RowMapper<Region> {
    @Override
    public Region mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
