package org.example.impl.dao;

import org.example.bean.Utilisateur;
import org.example.contract.dao.UtilisateurDao;
import org.example.impl.rowMapper.UtilisateurRM;
import org.springframework.jdbc.core.JdbcTemplate;

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
        Utilisateur utilisateur = listUtilisateur.get(0);

        return  utilisateur;
    }

    @Override
    public void inscription(Utilisateur utilisateur) {

    }
}
