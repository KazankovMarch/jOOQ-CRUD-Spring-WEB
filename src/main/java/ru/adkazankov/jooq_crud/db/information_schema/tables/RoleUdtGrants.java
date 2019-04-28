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
import ru.adkazankov.jooq_crud.db.information_schema.tables.records.RoleUdtGrantsRecord;


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
public class RoleUdtGrants extends TableImpl<RoleUdtGrantsRecord> {

    private static final long serialVersionUID = 452150262;

    /**
     * The reference instance of <code>information_schema.role_udt_grants</code>
     */
    public static final RoleUdtGrants ROLE_UDT_GRANTS = new RoleUdtGrants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleUdtGrantsRecord> getRecordType() {
        return RoleUdtGrantsRecord.class;
    }

    /**
     * The column <code>information_schema.role_udt_grants.grantor</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> GRANTOR = createField("grantor", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_udt_grants.grantee</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> GRANTEE = createField("grantee", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_udt_grants.udt_catalog</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> UDT_CATALOG = createField("udt_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_udt_grants.udt_schema</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> UDT_SCHEMA = createField("udt_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_udt_grants.udt_name</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> UDT_NAME = createField("udt_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_udt_grants.privilege_type</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> PRIVILEGE_TYPE = createField("privilege_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_udt_grants.is_grantable</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> IS_GRANTABLE = createField("is_grantable", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * Create a <code>information_schema.role_udt_grants</code> table reference
     */
    public RoleUdtGrants() {
        this(DSL.name("role_udt_grants"), null);
    }

    /**
     * Create an aliased <code>information_schema.role_udt_grants</code> table reference
     */
    public RoleUdtGrants(String alias) {
        this(DSL.name(alias), ROLE_UDT_GRANTS);
    }

    /**
     * Create an aliased <code>information_schema.role_udt_grants</code> table reference
     */
    public RoleUdtGrants(Name alias) {
        this(alias, ROLE_UDT_GRANTS);
    }

    private RoleUdtGrants(Name alias, Table<RoleUdtGrantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleUdtGrants(Name alias, Table<RoleUdtGrantsRecord> aliased, Field<?>[] parameters) {
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
    public RoleUdtGrants as(String alias) {
        return new RoleUdtGrants(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleUdtGrants as(Name alias) {
        return new RoleUdtGrants(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleUdtGrants rename(String name) {
        return new RoleUdtGrants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleUdtGrants rename(Name name) {
        return new RoleUdtGrants(name, null);
    }
}
