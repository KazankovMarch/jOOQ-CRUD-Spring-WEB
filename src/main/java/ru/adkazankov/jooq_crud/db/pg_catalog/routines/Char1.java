/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.routines;


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
public class Char1 extends AbstractRoutine<String> {

    private static final long serialVersionUID = -1510550499;

    /**
     * The parameter <code>pg_catalog.char.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CHAR, false, false);

    /**
     * The parameter <code>pg_catalog.char._1</code>.
     */
    public static final Parameter<Integer> _1 = createParameter("_1", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * Create a new routine call instance
     */
    public Char1() {
        super("char", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.CHAR);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Integer value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Integer> field) {
        setField(_1, field);
    }
}
