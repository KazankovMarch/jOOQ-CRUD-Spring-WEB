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
import ru.adkazankov.jooq_crud.db.pg_catalog.tables.records.PgTablesRecord;


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
public class PgTables extends TableImpl<PgTablesRecord> {

    private static final long serialVersionUID = -1964238573;

    /**
     * The reference instance of <code>pg_catalog.pg_tables</code>
     */
    public static final PgTables PG_TABLES = new PgTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTablesRecord> getRecordType() {
        return PgTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_tables.schemaname</code>.
     */
    public final TableField<PgTablesRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_tables.tablename</code>.
     */
    public final TableField<PgTablesRecord, String> TABLENAME = createField("tablename", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_tables.tableowner</code>.
     */
    public final TableField<PgTablesRecord, String> TABLEOWNER = createField("tableowner", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_tables.tablespace</code>.
     */
    public final TableField<PgTablesRecord, String> TABLESPACE = createField("tablespace", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_tables.hasindexes</code>.
     */
    public final TableField<PgTablesRecord, Boolean> HASINDEXES = createField("hasindexes", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_tables.hasrules</code>.
     */
    public final TableField<PgTablesRecord, Boolean> HASRULES = createField("hasrules", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_tables.hastriggers</code>.
     */
    public final TableField<PgTablesRecord, Boolean> HASTRIGGERS = createField("hastriggers", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_tables.rowsecurity</code>.
     */
    public final TableField<PgTablesRecord, Boolean> ROWSECURITY = createField("rowsecurity", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>pg_catalog.pg_tables</code> table reference
     */
    public PgTables() {
        this(DSL.name("pg_tables"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_tables</code> table reference
     */
    public PgTables(String alias) {
        this(DSL.name(alias), PG_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_tables</code> table reference
     */
    public PgTables(Name alias) {
        this(alias, PG_TABLES);
    }

    private PgTables(Name alias, Table<PgTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTables(Name alias, Table<PgTablesRecord> aliased, Field<?>[] parameters) {
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
    public PgTables as(String alias) {
        return new PgTables(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTables as(Name alias) {
        return new PgTables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTables rename(String name) {
        return new PgTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTables rename(Name name) {
        return new PgTables(name, null);
    }
}
