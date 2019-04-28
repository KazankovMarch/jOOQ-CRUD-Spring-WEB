/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.routines;


import java.sql.Time;
import java.time.OffsetTime;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class Timetz3 extends AbstractRoutine<OffsetTime> {

    private static final long serialVersionUID = -461359450;

    /**
     * The parameter <code>pg_catalog.timetz.RETURN_VALUE</code>.
     */
    public static final Parameter<OffsetTime> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMEWITHTIMEZONE, false, false);

    /**
     * The parameter <code>pg_catalog.timetz._1</code>.
     */
    public static final Parameter<Time> _1 = createParameter("_1", org.jooq.impl.SQLDataType.TIME, false, true);

    /**
     * Create a new routine call instance
     */
    public Timetz3() {
        super("timetz", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIMEWITHTIMEZONE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Time value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Time> field) {
        setField(_1, field);
    }
}
