package fr.rasen.rest.resource;

import fr.rasen.contract.ManagerFactory;

public abstract class AbstractResource {

    private static ManagerFactory managerFactory;

    public static ManagerFactory getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactory managerFactory) {
        AbstractResource.managerFactory = managerFactory;
    }
}
