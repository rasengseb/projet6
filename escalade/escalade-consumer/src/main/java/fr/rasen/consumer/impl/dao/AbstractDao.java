package fr.rasen.consumer.impl.dao;

import fr.rasen.model.bean.Utilisateur;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

public abstract class AbstractDao {

    @Inject
    @Named("dataSourceEscalade")
    private DataSource dataSource;

    protected DataSource getDataSource() {
        return dataSource;
    }

}
