package fr.rasen.consumer.impl.rowMapper;

import fr.rasen.model.bean.bdd.Cotation;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CotationRM implements RowMapper<Cotation> {
    @Override
    public Cotation mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
