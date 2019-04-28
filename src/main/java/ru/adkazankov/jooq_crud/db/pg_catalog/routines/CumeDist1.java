/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.routines;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;

import ru.adkazankov.jooq_crud.db.pg_catalog.PgCatalog;


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
public class CumeDist1 extends AbstractRoutine<Double> {

    private static final long serialVersionUID = -1999568750;

    /**
     * The parameter <code>pg_catalog.cume_dist.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * Create a new routine call instance
     */
    public CumeDist1() {
        super("cume_dist", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        setOverloaded(true);
    }
}
