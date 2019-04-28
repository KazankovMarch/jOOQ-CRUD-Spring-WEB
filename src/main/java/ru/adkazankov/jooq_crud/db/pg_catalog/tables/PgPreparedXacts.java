/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.tables;


import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.adkazankov.jooq_crud.db.pg_catalog.PgCatalog;
import ru.adkazankov.jooq_crud.db.pg_catalog.tables.records.PgPreparedXactsRecord;


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
public class PgPreparedXacts extends TableImpl<PgPreparedXactsRecord> {

    private static final long serialVersionUID = 929846403;

    /**
     * The reference instance of <code>pg_catalog.pg_prepared_xacts</code>
     */
    public static final PgPreparedXacts PG_PREPARED_XACTS = new PgPreparedXacts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPreparedXactsRecord> getRecordType() {
        return PgPreparedXactsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_prepared_xacts.transaction</code>.
     */
    public final TableField<PgPreparedXactsRecord, Long> TRANSACTION = createField("transaction", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xacts.gid</code>.
     */
    public final TableField<PgPreparedXactsRecord, String> GID = createField("gid", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xacts.prepared</code>.
     */
    public final TableField<PgPreparedXactsRecord, OffsetDateTime> PREPARED = createField("prepared", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xacts.owner</code>.
     */
    public final TableField<PgPreparedXactsRecord, String> OWNER = createField("owner", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xacts.database</code>.
     */
    public final TableField<PgPreparedXactsRecord, String> DATABASE = createField("database", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>pg_catalog.pg_prepared_xacts</code> table reference
     */
    public PgPreparedXacts() {
        this(DSL.name("pg_prepared_xacts"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_prepared_xacts</code> table reference
     */
    public PgPreparedXacts(String alias) {
        this(DSL.name(alias), PG_PREPARED_XACTS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_prepared_xacts</code> table reference
     */
    public PgPreparedXacts(Name alias) {
        this(alias, PG_PREPARED_XACTS);
    }

    private PgPreparedXacts(Name alias, Table<PgPreparedXactsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPreparedXacts(Name alias, Table<PgPreparedXactsRecord> aliased, Field<?>[] parameters) {
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
    public PgPreparedXacts as(String alias) {
        return new PgPreparedXacts(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedXacts as(Name alias) {
        return new PgPreparedXacts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPreparedXacts rename(String name) {
        return new PgPreparedXacts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPreparedXacts rename(Name name) {
        return new PgPreparedXacts(name, null);
    }
}