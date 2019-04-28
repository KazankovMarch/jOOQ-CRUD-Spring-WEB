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
import ru.adkazankov.jooq_crud.db.pg_catalog.tables.records.AclexplodeRecord;


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
public class Aclexplode extends TableImpl<AclexplodeRecord> {

    private static final long serialVersionUID = -740846683;

    /**
     * The reference instance of <code>pg_catalog.aclexplode</code>
     */
    public static final Aclexplode ACLEXPLODE = new Aclexplode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AclexplodeRecord> getRecordType() {
        return AclexplodeRecord.class;
    }

    /**
     * The column <code>pg_catalog.aclexplode.grantor</code>.
     */
    public final TableField<AclexplodeRecord, Long> GRANTOR = createField("grantor", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.aclexplode.grantee</code>.
     */
    public final TableField<AclexplodeRecord, Long> GRANTEE = createField("grantee", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.aclexplode.privilege_type</code>.
     */
    public final TableField<AclexplodeRecord, String> PRIVILEGE_TYPE = createField("privilege_type", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.aclexplode.is_grantable</code>.
     */
    public final TableField<AclexplodeRecord, Boolean> IS_GRANTABLE = createField("is_grantable", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>pg_catalog.aclexplode</code> table reference
     */
    public Aclexplode() {
        this(DSL.name("aclexplode"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.aclexplode</code> table reference
     */
    public Aclexplode(String alias) {
        this(DSL.name(alias), ACLEXPLODE);
    }

    /**
     * Create an aliased <code>pg_catalog.aclexplode</code> table reference
     */
    public Aclexplode(Name alias) {
        this(alias, ACLEXPLODE);
    }

    private Aclexplode(Name alias, Table<AclexplodeRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private Aclexplode(Name alias, Table<AclexplodeRecord> aliased, Field<?>[] parameters) {
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
    public Aclexplode as(String alias) {
        return new Aclexplode(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Aclexplode as(Name alias) {
        return new Aclexplode(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Aclexplode rename(String name) {
        return new Aclexplode(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Aclexplode rename(Name name) {
        return new Aclexplode(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public Aclexplode call(String[] acl) {
        return new Aclexplode(DSL.name(getName()), null, new Field[] { 
              DSL.val(acl, org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType())
        });
    }

    /**
     * Call this table-valued function
     */
    public Aclexplode call(Field<String[]> acl) {
        return new Aclexplode(DSL.name(getName()), null, new Field[] { 
              acl
        });
    }
}
