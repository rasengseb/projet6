package fr.rasen.impl.rowMapper;

import fr.rasen.bean.Cotation;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CotationRM implements RowMapper<Cotation> {
    @Override
    public Cotation mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
