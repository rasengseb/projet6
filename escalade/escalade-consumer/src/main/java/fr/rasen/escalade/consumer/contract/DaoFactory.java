package fr.rasen.escalade.consumer.contract;

import fr.rasen.escalade.consumer.contract.dao.*;
import fr.rasen.escalade.model.bean.Departement;

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

    //ADRESSE
    AdresseDao getAdresseDao();
    void setAdresseDao(AdresseDao pAdresseDao);

    //REGION
    RegionDao getRegionDao();
    void setRegionDao(RegionDao pRegionDao);

    //DEPARTEMENT
    DepartementDao getDepartementDao();
    void setDepartementDao(DepartementDao pDepartementDao);
}
