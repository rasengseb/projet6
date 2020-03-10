package org.example.impl.dao;

import com.sun.istack.internal.Interned;

import javax.sql.DataSource;

public abstract class AbstractDaoImpl {

    @Inject
    @Named("dataSource")
    private DataSource dataSource;

    protected DataSource getDataSource() {
        return dataSource;
    }
}
