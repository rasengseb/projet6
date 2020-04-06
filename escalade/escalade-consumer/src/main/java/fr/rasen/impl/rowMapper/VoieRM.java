package fr.rasen.impl.rowMapper;

import fr.rasen.bean.Voie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VoieRM implements RowMapper<Voie> {
    @Override
    public Voie mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
