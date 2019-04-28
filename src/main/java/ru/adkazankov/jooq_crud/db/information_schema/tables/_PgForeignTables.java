/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.adkazankov.jooq_crud.db.information_schema.InformationSchema;
import ru.adkazankov.jooq_crud.db.information_schema.tables.records._PgForeignTablesRecord;


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
public class _PgForeignTables extends TableImpl<_PgForeignTablesRecord> {

    private static final long serialVersionUID = -176032008;

    /**
     * The reference instance of <code>information_schema._pg_foreign_tables</code>
     */
    public static final _PgForeignTables _PG_FOREIGN_TABLES = new _PgForeignTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_PgForeignTablesRecord> getRecordType() {
        return _PgForeignTablesRecord.class;
    }

    /**
     * The column <code>information_schema._pg_foreign_tables.foreign_table_catalog</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> FOREIGN_TABLE_CATALOG = createField("foreign_table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_tables.foreign_table_schema</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> FOREIGN_TABLE_SCHEMA = createField("foreign_table_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_tables.foreign_table_name</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> FOREIGN_TABLE_NAME = createField("foreign_table_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_tables.ftoptions</code>.
     */
    public final TableField<_PgForeignTablesRecord, String[]> FTOPTIONS = createField("ftoptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>information_schema._pg_foreign_tables.foreign_server_catalog</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> FOREIGN_SERVER_CATALOG = createField("foreign_server_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_tables.foreign_server_name</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> FOREIGN_SERVER_NAME = createField("foreign_server_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema._pg_foreign_tables.authorization_identifier</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> AUTHORIZATION_IDENTIFIER = createField("authorization_identifier", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema._pg_foreign_tables</code> table reference
     */
    public _PgForeignTables() {
        this(DSL.name("_pg_foreign_tables"), null);
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_tables</code> table reference
     */
    public _PgForeignTables(String alias) {
        this(DSL.name(alias), _PG_FOREIGN_TABLES);
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_tables</code> table reference
     */
    public _PgForeignTables(Name alias) {
        this(alias, _PG_FOREIGN_TABLES);
    }

    private _PgForeignTables(Name alias, Table<_PgForeignTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private _PgForeignTables(Name alias, Table<_PgForeignTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _PgForeignTables as(String alias) {
        return new _PgForeignTables(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _PgForeignTables as(Name alias) {
        return new _PgForeignTables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignTables rename(String name) {
        return new _PgForeignTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignTables rename(Name name) {
        return new _PgForeignTables(name, null);
    }
}
