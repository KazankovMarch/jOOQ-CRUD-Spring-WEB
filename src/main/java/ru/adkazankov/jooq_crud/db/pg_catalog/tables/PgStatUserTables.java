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
import ru.adkazankov.jooq_crud.db.pg_catalog.tables.records.PgStatUserTablesRecord;


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
public class PgStatUserTables extends TableImpl<PgStatUserTablesRecord> {

    private static final long serialVersionUID = 1745281478;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_user_tables</code>
     */
    public static final PgStatUserTables PG_STAT_USER_TABLES = new PgStatUserTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatUserTablesRecord> getRecordType() {
        return PgStatUserTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.relid</code>.
     */
    public final TableField<PgStatUserTablesRecord, Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.schemaname</code>.
     */
    public final TableField<PgStatUserTablesRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.relname</code>.
     */
    public final TableField<PgStatUserTablesRecord, String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.seq_scan</code>.
     */
    public final TableField<PgStatUserTablesRecord, Long> SEQ_SCAN = createField("seq_scan", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.seq_tup_read</code>.
     */
    public final TableField<PgStatUserTablesRecord, Long> SEQ_TUP_READ = createField("seq_tup_read", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.idx_scan</code>.
     */
    public final TableField<PgStatUserTablesRecord, Long> IDX_SCAN = createField("idx_scan", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.idx_tup_fetch</code>.
     */
    public final TableField<PgStatUserTablesRecord, Long> IDX_TUP_FETCH = createField("idx_tup_fetch", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.n_tup_ins</code>.
     */
    public final TableField<PgStatUserTablesRecord, Long> N_TUP_INS = createField("n_tup_ins", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.n_tup_upd</code>.
     */
    public final TableField<PgStatUserTablesRecord, Long> N_TUP_UPD = createField("n_tup_upd", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.n_tup_del</code>.
     */
    public final TableField<PgStatUserTablesRecord, Long> N_TUP_DEL = createField("n_tup_del", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.n_tup_hot_upd</code>.
     */
    public final TableField<PgStatUserTablesRecord, Long> N_TUP_HOT_UPD = createField("n_tup_hot_upd", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.n_live_tup</code>.
     */
    public final TableField<PgStatUserTablesRecord, Long> N_LIVE_TUP = createField("n_live_tup", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.n_dead_tup</code>.
     */
    public final TableField<PgStatUserTablesRecord, Long> N_DEAD_TUP = createField("n_dead_tup", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.n_mod_since_analyze</code>.
     */
    public final TableField<PgStatUserTablesRecord, Long> N_MOD_SINCE_ANALYZE = createField("n_mod_since_analyze", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.last_vacuum</code>.
     */
    public final TableField<PgStatUserTablesRecord, OffsetDateTime> LAST_VACUUM = createField("last_vacuum", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.last_autovacuum</code>.
     */
    public final TableField<PgStatUserTablesRecord, OffsetDateTime> LAST_AUTOVACUUM = createField("last_autovacuum", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.last_analyze</code>.
     */
    public final TableField<PgStatUserTablesRecord, OffsetDateTime> LAST_ANALYZE = createField("last_analyze", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.last_autoanalyze</code>.
     */
    public final TableField<PgStatUserTablesRecord, OffsetDateTime> LAST_AUTOANALYZE = createField("last_autoanalyze", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.vacuum_count</code>.
     */
    public final TableField<PgStatUserTablesRecord, Long> VACUUM_COUNT = createField("vacuum_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.autovacuum_count</code>.
     */
    public final TableField<PgStatUserTablesRecord, Long> AUTOVACUUM_COUNT = createField("autovacuum_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.analyze_count</code>.
     */
    public final TableField<PgStatUserTablesRecord, Long> ANALYZE_COUNT = createField("analyze_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_tables.autoanalyze_count</code>.
     */
    public final TableField<PgStatUserTablesRecord, Long> AUTOANALYZE_COUNT = createField("autoanalyze_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_user_tables</code> table reference
     */
    public PgStatUserTables() {
        this(DSL.name("pg_stat_user_tables"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_user_tables</code> table reference
     */
    public PgStatUserTables(String alias) {
        this(DSL.name(alias), PG_STAT_USER_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_user_tables</code> table reference
     */
    public PgStatUserTables(Name alias) {
        this(alias, PG_STAT_USER_TABLES);
    }

    private PgStatUserTables(Name alias, Table<PgStatUserTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatUserTables(Name alias, Table<PgStatUserTablesRecord> aliased, Field<?>[] parameters) {
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
    public PgStatUserTables as(String alias) {
        return new PgStatUserTables(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatUserTables as(Name alias) {
        return new PgStatUserTables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatUserTables rename(String name) {
        return new PgStatUserTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatUserTables rename(Name name) {
        return new PgStatUserTables(name, null);
    }
}
