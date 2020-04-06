package fr.rasen.impl.rowMapper;

import fr.rasen.bean.Utilisateur;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class UtilisateurRM implements RowMapper<Utilisateur> {

    public Utilisateur mapRow(ResultSet pRS, int pRowNum) throws SQLException{
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(pRS.getInt("id"));
        utilisateur.setNom(pRS.getString("nom"));
        utilisateur.setPrenom(pRS.getString("prenom"));
        utilisateur.setPseudo(pRS.getString("pseudo"));
        utilisateur.setMdp(pRS.getString("mdp"));
        utilisateur.setMail(pRS.getString("mail"));
        utilisateur.setAdmin(pRS.getBoolean("isAdmin"));

        return utilisateur;
    }
}
