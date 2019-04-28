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
import ru.adkazankov.jooq_crud.db.information_schema.tables.records.ConstraintTableUsageRecord;


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
public class ConstraintTableUsage extends TableImpl<ConstraintTableUsageRecord> {

    private static final long serialVersionUID = -1045285766;

    /**
     * The reference instance of <code>information_schema.constraint_table_usage</code>
     */
    public static final ConstraintTableUsage CONSTRAINT_TABLE_USAGE = new ConstraintTableUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConstraintTableUsageRecord> getRecordType() {
        return ConstraintTableUsageRecord.class;
    }

    /**
     * The column <code>information_schema.constraint_table_usage.table_catalog</code>.
     */
    public final TableField<ConstraintTableUsageRecord, String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.constraint_table_usage.table_schema</code>.
     */
    public final TableField<ConstraintTableUsageRecord, String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.constraint_table_usage.table_name</code>.
     */
    public final TableField<ConstraintTableUsageRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.constraint_table_usage.constraint_catalog</code>.
     */
    public final TableField<ConstraintTableUsageRecord, String> CONSTRAINT_CATALOG = createField("constraint_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.constraint_table_usage.constraint_schema</code>.
     */
    public final TableField<ConstraintTableUsageRecord, String> CONSTRAINT_SCHEMA = createField("constraint_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.constraint_table_usage.constraint_name</code>.
     */
    public final TableField<ConstraintTableUsageRecord, String> CONSTRAINT_NAME = createField("constraint_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.constraint_table_usage</code> table reference
     */
    public ConstraintTableUsage() {
        this(DSL.name("constraint_table_usage"), null);
    }

    /**
     * Create an aliased <code>information_schema.constraint_table_usage</code> table reference
     */
    public ConstraintTableUsage(String alias) {
        this(DSL.name(alias), CONSTRAINT_TABLE_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.constraint_table_usage</code> table reference
     */
    public ConstraintTableUsage(Name alias) {
        this(alias, CONSTRAINT_TABLE_USAGE);
    }

    private ConstraintTableUsage(Name alias, Table<ConstraintTableUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private ConstraintTableUsage(Name alias, Table<ConstraintTableUsageRecord> aliased, Field<?>[] parameters) {
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
    public ConstraintTableUsage as(String alias) {
        return new ConstraintTableUsage(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstraintTableUsage as(Name alias) {
        return new ConstraintTableUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ConstraintTableUsage rename(String name) {
        return new ConstraintTableUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ConstraintTableUsage rename(Name name) {
        return new ConstraintTableUsage(name, null);
    }
}