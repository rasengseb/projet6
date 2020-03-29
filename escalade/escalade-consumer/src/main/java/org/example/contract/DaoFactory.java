package org.example.contract;

import org.example.contract.dao.UtilisateurDao;

public interface DaoFactory {

    //UTILISATEUR
    UtilisateurDao getUtilisateurDao();
    void setUtilisateurDao(UtilisateurDao pUtilisateurDao);
}
