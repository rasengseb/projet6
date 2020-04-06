package fr.rasen.impl.rowMapper;

import fr.rasen.bean.Reservation;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReservationRM implements RowMapper<Reservation> {
    @Override
    public Reservation mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
