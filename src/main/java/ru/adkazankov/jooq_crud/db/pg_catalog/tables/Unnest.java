/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.adkazankov.jooq_crud.db.pg_catalog.PgCatalog;
import ru.adkazankov.jooq_crud.db.pg_catalog.tables.records.UnnestRecord;


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
public class Unnest extends TableImpl<UnnestRecord> {

    private static final long serialVersionUID = -1014658088;

    /**
     * The reference instance of <code>pg_catalog.unnest</code>
     */
    public static final Unnest UNNEST = new Unnest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UnnestRecord> getRecordType() {
        return UnnestRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<UnnestRecord, Object> UNNEST_ = createField("unnest", org.jooq.impl.DefaultDataType.getDefaultDataType("anyelement"), this, "");

    /**
     * Create a <code>pg_catalog.unnest</code> table reference
     */
    public Unnest() {
        this(DSL.name("unnest"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.unnest</code> table reference
     */
    public Unnest(String alias) {
        this(DSL.name(alias), UNNEST);
    }

    /**
     * Create an aliased <code>pg_catalog.unnest</code> table reference
     */
    public Unnest(Name alias) {
        this(alias, UNNEST);
    }

    private Unnest(Name alias, Table<UnnestRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private Unnest(Name alias, Table<UnnestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Unnest as(String alias) {
        return new Unnest(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Unnest as(Name alias) {
        return new Unnest(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Unnest rename(String name) {
        return new Unnest(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Unnest rename(Name name) {
        return new Unnest(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public Unnest call(Object __1) {
        return new Unnest(DSL.name(getName()), null, new Field[] { 
              DSL.val(__1, org.jooq.impl.DefaultDataType.getDefaultDataType("anyarray"))
        });
    }

    /**
     * Call this table-valued function
     */
    public Unnest call(Field<Object> __1) {
        return new Unnest(DSL.name(getName()), null, new Field[] { 
              __1
        });
    }
}
