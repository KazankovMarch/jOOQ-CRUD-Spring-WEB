/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.routines;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Record;
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
public class RecordImageLt extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = -875466028;

    /**
     * The parameter <code>pg_catalog.record_image_lt.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>pg_catalog.record_image_lt._1</code>.
     */
    public static final Parameter<Record> _1 = createParameter("_1", org.jooq.impl.SQLDataType.RECORD, false, true);

    /**
     * The parameter <code>pg_catalog.record_image_lt._2</code>.
     */
    public static final Parameter<Record> _2 = createParameter("_2", org.jooq.impl.SQLDataType.RECORD, false, true);

    /**
     * Create a new routine call instance
     */
    public RecordImageLt() {
        super("record_image_lt", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Record value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Record> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Record value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Record> field) {
        setField(_2, field);
    }
}
