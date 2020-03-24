package org.example.rowMapper;

import org.example.profile.Utilisateur;

import javax.inject.Named;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class UtilisateurRM implements RowMapper<Utilisateur> {

    public Utilisateur mapRow(ResultSet pRS, int pRowNum) throws SQLException{
        return null;
    }
}
