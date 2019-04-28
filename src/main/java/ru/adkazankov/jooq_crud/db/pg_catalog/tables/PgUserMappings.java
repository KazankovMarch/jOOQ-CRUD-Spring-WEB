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
import ru.adkazankov.jooq_crud.db.pg_catalog.tables.records.PgUserMappingsRecord;


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
public class PgUserMappings extends TableImpl<PgUserMappingsRecord> {

    private static final long serialVersionUID = -693477777;

    /**
     * The reference instance of <code>pg_catalog.pg_user_mappings</code>
     */
    public static final PgUserMappings PG_USER_MAPPINGS = new PgUserMappings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgUserMappingsRecord> getRecordType() {
        return PgUserMappingsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_user_mappings.umid</code>.
     */
    public final TableField<PgUserMappingsRecord, Long> UMID = createField("umid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_user_mappings.srvid</code>.
     */
    public final TableField<PgUserMappingsRecord, Long> SRVID = createField("srvid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_user_mappings.srvname</code>.
     */
    public final TableField<PgUserMappingsRecord, String> SRVNAME = createField("srvname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_user_mappings.umuser</code>.
     */
    public final TableField<PgUserMappingsRecord, Long> UMUSER = createField("umuser", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_user_mappings.usename</code>.
     */
    public final TableField<PgUserMappingsRecord, String> USENAME = createField("usename", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_user_mappings.umoptions</code>.
     */
    public final TableField<PgUserMappingsRecord, String[]> UMOPTIONS = createField("umoptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_user_mappings</code> table reference
     */
    public PgUserMappings() {
        this(DSL.name("pg_user_mappings"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_user_mappings</code> table reference
     */
    public PgUserMappings(String alias) {
        this(DSL.name(alias), PG_USER_MAPPINGS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_user_mappings</code> table reference
     */
    public PgUserMappings(Name alias) {
        this(alias, PG_USER_MAPPINGS);
    }

    private PgUserMappings(Name alias, Table<PgUserMappingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgUserMappings(Name alias, Table<PgUserMappingsRecord> aliased, Field<?>[] parameters) {
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
    public PgUserMappings as(String alias) {
        return new PgUserMappings(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserMappings as(Name alias) {
        return new PgUserMappings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgUserMappings rename(String name) {
        return new PgUserMappings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgUserMappings rename(Name name) {
        return new PgUserMappings(name, null);
    }
}
