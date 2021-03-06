package fr.rasen.escalade.consumer.impl.dao;

import fr.rasen.escalade.model.bean.Utilisateur;
import fr.rasen.escalade.consumer.contract.dao.UtilisateurDao;
import fr.rasen.escalade.consumer.impl.rowMapper.UtilisateurRM;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class UtilisateurDaoImpl extends AbstractDao implements UtilisateurDao {

    @Inject
    UtilisateurRM utilisateurRM;


    @Override
    public Utilisateur connexion(String pseudo, String mdp) {
        String vSQL ="SELECT * FROM utilisateur WHERE pseudo='" + pseudo +"' AND mdp ='" + mdp + "'";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
        List<Utilisateur> listUtilisateur = jdbcTemplate.query(vSQL, utilisateurRM);

        Utilisateur utilisateur = new Utilisateur();
        try {
            utilisateur = listUtilisateur.get(0);
        } catch ( IndexOutOfBoundsException e) {
            e.getMessage();
        }

        return  utilisateur;
    }


    @Override
    public boolean addUtilisateur(Utilisateur utilisateur) {
        String vSQL ="INSERT INTO utilisateur (nom, prenom, pseudo, mdp, mail, isadmin) VALUES ('" +
                utilisateur.getNom() + "', '" +
                utilisateur.getPrenom() +"', '" +
                utilisateur.getPseudo() + "', '" +
                utilisateur.getMdp() + "', '" +
                utilisateur.getMail() + "', '" +
                utilisateur.isAdmin() + "')";
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("nom",utilisateur.getNom());
        vParams.addValue("prenom",utilisateur.getPrenom());
        vParams.addValue("pseudo",utilisateur.getPseudo());
        vParams.addValue("mdp",utilisateur.getMdp());
        vParams.addValue("mail",utilisateur.getMail());
        vParams.addValue("isadmin",utilisateur.isAdmin());
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        int vNbrLigneMaj = vJdbcTemplate.update(vSQL, vParams);
        if(vNbrLigneMaj == 1){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean majUtilisateur(Utilisateur utilisateur) {
        String vSQL ="UPDATE utilisateur SET nom = '" +
                utilisateur.getNom() +"', prenom = '" +
                utilisateur.getPrenom() + "', pseudo = '" +
                utilisateur.getPseudo() + "', mdp = '" +
                utilisateur.getMdp() +"', mail = '" +
                utilisateur.getMail() +"', isadmin = " +
                utilisateur.isAdmin() +" WHERE id = " +
                utilisateur.getId();
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("nom",utilisateur.getNom());
        vParams.addValue("prenom",utilisateur.getPrenom());
        vParams.addValue("pseudo",utilisateur.getPseudo());
        vParams.addValue("mdp",utilisateur.getMdp());
        vParams.addValue("mail",utilisateur.getMail());
        vParams.addValue("isadmin",utilisateur.isAdmin());
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        int vNbrLigneMaj = vJdbcTemplate.update(vSQL, vParams);
        if (vNbrLigneMaj == 1){
            return true;
        } else {
            return false;
        }
    }

}
