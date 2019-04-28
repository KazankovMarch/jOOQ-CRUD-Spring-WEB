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
public class PgStatResetSingleTableCounters extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1912375327;

    /**
     * The parameter <code>pg_catalog.pg_stat_reset_single_table_counters._1</code>.
     */
    public static final Parameter<Long> _1 = createParameter("_1", org.jooq.impl.SQLDataType.BIGINT, false, true);

    /**
     * Create a new routine call instance
     */
    public PgStatResetSingleTableCounters() {
        super("pg_stat_reset_single_table_counters", PgCatalog.PG_CATALOG);

        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Long value) {
        setValue(_1, value);
    }
}
