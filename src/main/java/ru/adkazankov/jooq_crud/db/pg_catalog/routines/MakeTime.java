/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.routines;


import java.sql.Time;

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
public class MakeTime extends AbstractRoutine<Time> {

    private static final long serialVersionUID = -722559066;

    /**
     * The parameter <code>pg_catalog.make_time.RETURN_VALUE</code>.
     */
    public static final Parameter<Time> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIME, false, false);

    /**
     * The parameter <code>pg_catalog.make_time.hour</code>.
     */
    public static final Parameter<Integer> HOUR = createParameter("hour", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_time.min</code>.
     */
    public static final Parameter<Integer> MIN = createParameter("min", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_time.sec</code>.
     */
    public static final Parameter<Double> SEC = createParameter("sec", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * Create a new routine call instance
     */
    public MakeTime() {
        super("make_time", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIME);

        setReturnParameter(RETURN_VALUE);
        addInParameter(HOUR);
        addInParameter(MIN);
        addInParameter(SEC);
    }

    /**
     * Set the <code>hour</code> parameter IN value to the routine
     */
    public void setHour(Integer value) {
        setValue(HOUR, value);
    }

    /**
     * Set the <code>hour</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setHour(Field<Integer> field) {
        setField(HOUR, field);
    }

    /**
     * Set the <code>min</code> parameter IN value to the routine
     */
    public void setMin(Integer value) {
        setValue(MIN, value);
    }

    /**
     * Set the <code>min</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMin(Field<Integer> field) {
        setField(MIN, field);
    }

    /**
     * Set the <code>sec</code> parameter IN value to the routine
     */
    public void setSec(Double value) {
        setValue(SEC, value);
    }

    /**
     * Set the <code>sec</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setSec(Field<Double> field) {
        setField(SEC, field);
    }
}
