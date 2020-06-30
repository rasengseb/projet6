package fr.rasen.escalade.consumer.impl.rowMapper;

import fr.rasen.escalade.model.bean.Region;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class RegionRM implements RowMapper<Region> {
    @Override
    public Region mapRow(ResultSet resultSet, int i) throws SQLException {
        Region region = new Region();
        region.setId(resultSet.getInt("id"));
        region.setNom(resultSet.getString("nom"));

        return region;
    }
}
