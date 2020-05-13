package fr.rasen.escalade.consumer.contract;

import fr.rasen.escalade.consumer.contract.dao.ContactDao;
import fr.rasen.escalade.consumer.contract.dao.SiteDao;
import fr.rasen.escalade.consumer.contract.dao.UtilisateurDao;

public interface DaoFactory {

    //UTILISATEUR
    UtilisateurDao getUtilisateurDao();
    void setUtilisateurDao(UtilisateurDao pUtilisateurDao);

    //CONTACT
    ContactDao getContactDao();
    void setContactDao(ContactDao pContactDao);

    //SITE
    SiteDao getSiteDao();
    void setSiteDao(SiteDao pSiteDao);
}
