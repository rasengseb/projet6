package fr.rasen.consumer.impl.rowMapper;

import fr.rasen.model.bean.Site;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SiteRM implements RowMapper<Site> {
    @Override
    public Site mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
