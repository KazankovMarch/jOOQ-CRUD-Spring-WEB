/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.adkazankov.jooq_crud.db.pg_catalog.Indexes;
import ru.adkazankov.jooq_crud.db.pg_catalog.PgCatalog;
import ru.adkazankov.jooq_crud.db.pg_catalog.tables.records.PgClassRecord;


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
public class PgClass extends TableImpl<PgClassRecord> {

    private static final long serialVersionUID = -1923726379;

    /**
     * The reference instance of <code>pg_catalog.pg_class</code>
     */
    public static final PgClass PG_CLASS = new PgClass();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgClassRecord> getRecordType() {
        return PgClassRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_class.relname</code>.
     */
    public final TableField<PgClassRecord, String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relnamespace</code>.
     */
    public final TableField<PgClassRecord, Long> RELNAMESPACE = createField("relnamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reltype</code>.
     */
    public final TableField<PgClassRecord, Long> RELTYPE = createField("reltype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reloftype</code>.
     */
    public final TableField<PgClassRecord, Long> RELOFTYPE = createField("reloftype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relowner</code>.
     */
    public final TableField<PgClassRecord, Long> RELOWNER = createField("relowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relam</code>.
     */
    public final TableField<PgClassRecord, Long> RELAM = createField("relam", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relfilenode</code>.
     */
    public final TableField<PgClassRecord, Long> RELFILENODE = createField("relfilenode", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reltablespace</code>.
     */
    public final TableField<PgClassRecord, Long> RELTABLESPACE = createField("reltablespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relpages</code>.
     */
    public final TableField<PgClassRecord, Integer> RELPAGES = createField("relpages", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reltuples</code>.
     */
    public final TableField<PgClassRecord, Float> RELTUPLES = createField("reltuples", org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relallvisible</code>.
     */
    public final TableField<PgClassRecord, Integer> RELALLVISIBLE = createField("relallvisible", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reltoastrelid</code>.
     */
    public final TableField<PgClassRecord, Long> RELTOASTRELID = createField("reltoastrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relhasindex</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELHASINDEX = createField("relhasindex", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relisshared</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELISSHARED = createField("relisshared", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relpersistence</code>.
     */
    public final TableField<PgClassRecord, String> RELPERSISTENCE = createField("relpersistence", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relkind</code>.
     */
    public final TableField<PgClassRecord, String> RELKIND = createField("relkind", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relnatts</code>.
     */
    public final TableField<PgClassRecord, Short> RELNATTS = createField("relnatts", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relchecks</code>.
     */
    public final TableField<PgClassRecord, Short> RELCHECKS = createField("relchecks", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relhasoids</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELHASOIDS = createField("relhasoids", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relhaspkey</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELHASPKEY = createField("relhaspkey", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relhasrules</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELHASRULES = createField("relhasrules", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relhastriggers</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELHASTRIGGERS = createField("relhastriggers", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relhassubclass</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELHASSUBCLASS = createField("relhassubclass", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relrowsecurity</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELROWSECURITY = createField("relrowsecurity", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relforcerowsecurity</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELFORCEROWSECURITY = createField("relforcerowsecurity", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relispopulated</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELISPOPULATED = createField("relispopulated", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relreplident</code>.
     */
    public final TableField<PgClassRecord, String> RELREPLIDENT = createField("relreplident", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relispartition</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELISPARTITION = createField("relispartition", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relfrozenxid</code>.
     */
    public final TableField<PgClassRecord, Long> RELFROZENXID = createField("relfrozenxid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relminmxid</code>.
     */
    public final TableField<PgClassRecord, Long> RELMINMXID = createField("relminmxid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relacl</code>.
     */
    public final TableField<PgClassRecord, String[]> RELACL = createField("relacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reloptions</code>.
     */
    public final TableField<PgClassRecord, String[]> RELOPTIONS = createField("reloptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgClassRecord, Object> RELPARTBOUND = createField("relpartbound", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_node_tree"), this, "");

    /**
     * Create a <code>pg_catalog.pg_class</code> table reference
     */
    public PgClass() {
        this(DSL.name("pg_class"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_class</code> table reference
     */
    public PgClass(String alias) {
        this(DSL.name(alias), PG_CLASS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_class</code> table reference
     */
    public PgClass(Name alias) {
        this(alias, PG_CLASS);
    }

    private PgClass(Name alias, Table<PgClassRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgClass(Name alias, Table<PgClassRecord> aliased, Field<?>[] parameters) {
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_CLASS_RELNAME_NSP_INDEX, Indexes.PG_CLASS_TBLSPC_RELFILENODE_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgClass as(String alias) {
        return new PgClass(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgClass as(Name alias) {
        return new PgClass(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgClass rename(String name) {
        return new PgClass(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgClass rename(Name name) {
        return new PgClass(name, null);
    }
}
