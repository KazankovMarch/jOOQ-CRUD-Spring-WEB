/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.routines;


import java.sql.Date;

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
public class MakeDate extends AbstractRoutine<Date> {

    private static final long serialVersionUID = -961155198;

    /**
     * The parameter <code>pg_catalog.make_date.RETURN_VALUE</code>.
     */
    public static final Parameter<Date> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DATE, false, false);

    /**
     * The parameter <code>pg_catalog.make_date.year</code>.
     */
    public static final Parameter<Integer> YEAR = createParameter("year", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_date.month</code>.
     */
    public static final Parameter<Integer> MONTH = createParameter("month", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_date.day</code>.
     */
    public static final Parameter<Integer> DAY = createParameter("day", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public MakeDate() {
        super("make_date", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.DATE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(YEAR);
        addInParameter(MONTH);
        addInParameter(DAY);
    }

    /**
     * Set the <code>year</code> parameter IN value to the routine
     */
    public void setYear(Integer value) {
        setValue(YEAR, value);
    }

    /**
     * Set the <code>year</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setYear(Field<Integer> field) {
        setField(YEAR, field);
    }

    /**
     * Set the <code>month</code> parameter IN value to the routine
     */
    public void setMonth(Integer value) {
        setValue(MONTH, value);
    }

    /**
     * Set the <code>month</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMonth(Field<Integer> field) {
        setField(MONTH, field);
    }

    /**
     * Set the <code>day</code> parameter IN value to the routine
     */
    public void setDay(Integer value) {
        setValue(DAY, value);
    }

    /**
     * Set the <code>day</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setDay(Field<Integer> field) {
        setField(DAY, field);
    }
}
