/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;

import ru.adkazankov.jooq_crud.db.information_schema.InformationSchema;
import ru.adkazankov.jooq_crud.db.pg_catalog.PgCatalog;
import ru.adkazankov.jooq_crud.db.public_.Public;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultCatalog extends CatalogImpl {

    private static final long serialVersionUID = -1956813069;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();

    /**
     * The schema <code>information_schema</code>.
     */
    public final InformationSchema INFORMATION_SCHEMA = ru.adkazankov.jooq_crud.db.information_schema.InformationSchema.INFORMATION_SCHEMA;

    /**
     * The schema <code>pg_catalog</code>.
     */
    public final PgCatalog PG_CATALOG = ru.adkazankov.jooq_crud.db.pg_catalog.PgCatalog.PG_CATALOG;

    /**
     * The schema <code>public</code>.
     */
    public final Public PUBLIC = ru.adkazankov.jooq_crud.db.public_.Public.PUBLIC;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    public final List<Schema> getSchemas() {
        List result = new ArrayList();
        result.addAll(getSchemas0());
        return result;
    }

    private final List<Schema> getSchemas0() {
        return Arrays.<Schema>asList(
            InformationSchema.INFORMATION_SCHEMA,
            PgCatalog.PG_CATALOG,
            Public.PUBLIC);
    }
}