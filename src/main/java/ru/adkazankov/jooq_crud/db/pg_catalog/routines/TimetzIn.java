/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.routines;


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
public class TimetzIn extends AbstractRoutine<OffsetTime> {

    private static final long serialVersionUID = -1689702771;

    /**
     * The parameter <code>pg_catalog.timetz_in.RETURN_VALUE</code>.
     */
    public static final Parameter<OffsetTime> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMEWITHTIMEZONE, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _1 = createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("cstring"), false, true);

    /**
     * The parameter <code>pg_catalog.timetz_in._2</code>.
     */
    public static final Parameter<Long> _2 = createParameter("_2", org.jooq.impl.SQLDataType.BIGINT, false, true);

    /**
     * The parameter <code>pg_catalog.timetz_in._3</code>.
     */
    public static final Parameter<Integer> _3 = createParameter("_3", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * Create a new routine call instance
     */
    public TimetzIn() {
        super("timetz_in", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIMEWITHTIMEZONE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Object> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Long value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Long> field) {
        setField(_2, field);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(Integer value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_3</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__3(Field<Integer> field) {
        setField(_3, field);
    }
}
