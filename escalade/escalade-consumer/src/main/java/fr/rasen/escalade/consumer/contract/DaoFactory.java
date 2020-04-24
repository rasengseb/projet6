package fr.rasen.escalade.consumer.contract;

import fr.rasen.escalade.consumer.contract.dao.UtilisateurDao;

public interface DaoFactory {

    //UTILISATEUR
    UtilisateurDao getUtilisateurDao();
    void setUtilisateurDao(UtilisateurDao pUtilisateurDao);
}
