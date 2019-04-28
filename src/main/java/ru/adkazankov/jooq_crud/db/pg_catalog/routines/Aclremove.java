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
public class Aclremove extends AbstractRoutine<String[]> {

    private static final long serialVersionUID = 1658647634;

    /**
     * The parameter <code>pg_catalog.aclremove.RETURN_VALUE</code>.
     */
    public static final Parameter<String[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), false, false);

    /**
     * The parameter <code>pg_catalog.aclremove._1</code>.
     */
    public static final Parameter<String[]> _1 = createParameter("_1", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), false, true);

    /**
     * The parameter <code>pg_catalog.aclremove._2</code>.
     */
    public static final Parameter<String> _2 = createParameter("_2", org.jooq.impl.SQLDataType.VARCHAR, false, true);

    /**
     * Create a new routine call instance
     */
    public Aclremove() {
        super("aclremove", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(String... value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<String[]> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(String value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<String> field) {
        setField(_2, field);
    }
}
