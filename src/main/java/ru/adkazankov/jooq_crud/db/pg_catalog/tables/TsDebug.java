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
import ru.adkazankov.jooq_crud.db.pg_catalog.tables.records.TsDebugRecord;


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
public class TsDebug extends TableImpl<TsDebugRecord> {

    private static final long serialVersionUID = -1260440357;

    /**
     * The reference instance of <code>pg_catalog.ts_debug</code>
     */
    public static final TsDebug TS_DEBUG = new TsDebug();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TsDebugRecord> getRecordType() {
        return TsDebugRecord.class;
    }

    /**
     * The column <code>pg_catalog.ts_debug.alias</code>.
     */
    public final TableField<TsDebugRecord, String> ALIAS = createField("alias", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.ts_debug.alias</code>.
     */
    public final TableField<TsDebugRecord, String> ALIAS = createField("alias", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.ts_debug.description</code>.
     */
    public final TableField<TsDebugRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.ts_debug.description</code>.
     */
    public final TableField<TsDebugRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.ts_debug.token</code>.
     */
    public final TableField<TsDebugRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.ts_debug.token</code>.
     */
    public final TableField<TsDebugRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.ts_debug.dictionaries</code>.
     */
    public final TableField<TsDebugRecord, Object[]> DICTIONARIES = createField("dictionaries", org.jooq.impl.DefaultDataType.getDefaultDataType("regdictionary").getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.ts_debug.dictionaries</code>.
     */
    public final TableField<TsDebugRecord, Object[]> DICTIONARIES = createField("dictionaries", org.jooq.impl.DefaultDataType.getDefaultDataType("regdictionary").getArrayDataType(), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<TsDebugRecord, Object> DICTIONARY = createField("dictionary", org.jooq.impl.DefaultDataType.getDefaultDataType("regdictionary"), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<TsDebugRecord, Object> DICTIONARY = createField("dictionary", org.jooq.impl.DefaultDataType.getDefaultDataType("regdictionary"), this, "");

    /**
     * The column <code>pg_catalog.ts_debug.lexemes</code>.
     */
    public final TableField<TsDebugRecord, String[]> LEXEMES = createField("lexemes", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.ts_debug.lexemes</code>.
     */
    public final TableField<TsDebugRecord, String[]> LEXEMES = createField("lexemes", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.ts_debug</code> table reference
     */
    public TsDebug() {
        this(DSL.name("ts_debug"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.ts_debug</code> table reference
     */
    public TsDebug(String alias) {
        this(DSL.name(alias), TS_DEBUG);
    }

    /**
     * Create an aliased <code>pg_catalog.ts_debug</code> table reference
     */
    public TsDebug(Name alias) {
        this(alias, TS_DEBUG);
    }

    private TsDebug(Name alias, Table<TsDebugRecord> aliased) {
        this(alias, aliased, new Field[2]);
    }

    private TsDebug(Name alias, Table<TsDebugRecord> aliased, Field<?>[] parameters) {
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
    public TsDebug as(String alias) {
        return new TsDebug(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TsDebug as(Name alias) {
        return new TsDebug(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public TsDebug rename(String name) {
        return new TsDebug(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public TsDebug rename(Name name) {
        return new TsDebug(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public TsDebug call(Object config, String document) {
        return new TsDebug(DSL.name(getName()), null, new Field[] { 
              DSL.val(config, org.jooq.impl.DefaultDataType.getDefaultDataType("regconfig"))
            , DSL.val(document, org.jooq.impl.SQLDataType.CLOB)
        });
    }

    /**
     * Call this table-valued function
     */
    public TsDebug call(Field<Object> config, Field<String> document) {
        return new TsDebug(DSL.name(getName()), null, new Field[] { 
              config
            , document
        });
    }
}
