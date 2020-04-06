package fr.rasen.contract;

import fr.rasen.contract.dao.UtilisateurDao;

public interface DaoFactory {

    //UTILISATEUR
    UtilisateurDao getUtilisateurDao();
    void setUtilisateurDao(UtilisateurDao pUtilisateurDao);
}
