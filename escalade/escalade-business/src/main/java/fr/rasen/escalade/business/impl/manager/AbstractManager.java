package fr.rasen.escalade.business.impl.manager;

import fr.rasen.escalade.consumer.contract.DaoFactory;

public abstract class AbstractManager {

    private static DaoFactory daoFactory;

//    GETTER ET SETTER
    public static DaoFactory getDaoFactory() {
        return daoFactory;
    }

    public static void setDaoFactory(DaoFactory daoFactory) {
        AbstractManager.daoFactory = daoFactory;
    }
}
