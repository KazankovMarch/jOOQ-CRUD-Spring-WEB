/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.routines;


import java.math.BigDecimal;

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
public class WidthBucket1 extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -1691015830;

    /**
     * The parameter <code>pg_catalog.width_bucket.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.width_bucket._1</code>.
     */
    public static final Parameter<BigDecimal> _1 = createParameter("_1", org.jooq.impl.SQLDataType.NUMERIC, false, true);

    /**
     * The parameter <code>pg_catalog.width_bucket._2</code>.
     */
    public static final Parameter<BigDecimal> _2 = createParameter("_2", org.jooq.impl.SQLDataType.NUMERIC, false, true);

    /**
     * The parameter <code>pg_catalog.width_bucket._3</code>.
     */
    public static final Parameter<BigDecimal> _3 = createParameter("_3", org.jooq.impl.SQLDataType.NUMERIC, false, true);

    /**
     * The parameter <code>pg_catalog.width_bucket._4</code>.
     */
    public static final Parameter<Integer> _4 = createParameter("_4", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * Create a new routine call instance
     */
    public WidthBucket1() {
        super("width_bucket", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(BigDecimal value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<BigDecimal> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(BigDecimal value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<BigDecimal> field) {
        setField(_2, field);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(BigDecimal value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_3</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__3(Field<BigDecimal> field) {
        setField(_3, field);
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    public void set__4(Integer value) {
        setValue(_4, value);
    }

    /**
     * Set the <code>_4</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__4(Field<Integer> field) {
        setField(_4, field);
    }
}
