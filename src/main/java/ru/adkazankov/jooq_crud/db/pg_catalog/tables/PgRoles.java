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
import ru.adkazankov.jooq_crud.db.pg_catalog.tables.records.PgRolesRecord;


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
public class PgRoles extends TableImpl<PgRolesRecord> {

    private static final long serialVersionUID = -960799419;

    /**
     * The reference instance of <code>pg_catalog.pg_roles</code>
     */
    public static final PgRoles PG_ROLES = new PgRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgRolesRecord> getRecordType() {
        return PgRolesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_roles.rolname</code>.
     */
    public final TableField<PgRolesRecord, String> ROLNAME = createField("rolname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolsuper</code>.
     */
    public final TableField<PgRolesRecord, Boolean> ROLSUPER = createField("rolsuper", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolinherit</code>.
     */
    public final TableField<PgRolesRecord, Boolean> ROLINHERIT = createField("rolinherit", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolcreaterole</code>.
     */
    public final TableField<PgRolesRecord, Boolean> ROLCREATEROLE = createField("rolcreaterole", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolcreatedb</code>.
     */
    public final TableField<PgRolesRecord, Boolean> ROLCREATEDB = createField("rolcreatedb", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolcanlogin</code>.
     */
    public final TableField<PgRolesRecord, Boolean> ROLCANLOGIN = createField("rolcanlogin", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolreplication</code>.
     */
    public final TableField<PgRolesRecord, Boolean> ROLREPLICATION = createField("rolreplication", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolconnlimit</code>.
     */
    public final TableField<PgRolesRecord, Integer> ROLCONNLIMIT = createField("rolconnlimit", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolpassword</code>.
     */
    public final TableField<PgRolesRecord, String> ROLPASSWORD = createField("rolpassword", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolvaliduntil</code>.
     */
    public final TableField<PgRolesRecord, OffsetDateTime> ROLVALIDUNTIL = createField("rolvaliduntil", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolbypassrls</code>.
     */
    public final TableField<PgRolesRecord, Boolean> ROLBYPASSRLS = createField("rolbypassrls", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolconfig</code>.
     */
    public final TableField<PgRolesRecord, String[]> ROLCONFIG = createField("rolconfig", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_roles.oid</code>.
     */
    public final TableField<PgRolesRecord, Long> OID = createField("oid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_roles</code> table reference
     */
    public PgRoles() {
        this(DSL.name("pg_roles"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_roles</code> table reference
     */
    public PgRoles(String alias) {
        this(DSL.name(alias), PG_ROLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_roles</code> table reference
     */
    public PgRoles(Name alias) {
        this(alias, PG_ROLES);
    }

    private PgRoles(Name alias, Table<PgRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgRoles(Name alias, Table<PgRolesRecord> aliased, Field<?>[] parameters) {
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
    public PgRoles as(String alias) {
        return new PgRoles(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRoles as(Name alias) {
        return new PgRoles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgRoles rename(String name) {
        return new PgRoles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgRoles rename(Name name) {
        return new PgRoles(name, null);
    }
}
