/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.information_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;

import ru.adkazankov.jooq_crud.db.information_schema.tables.ConstraintTableUsage;


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
public class ConstraintTableUsageRecord extends TableRecordImpl<ConstraintTableUsageRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = -591303616;

    /**
     * Setter for <code>information_schema.constraint_table_usage.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.constraint_table_usage.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.constraint_table_usage.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.constraint_table_usage.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.constraint_table_usage.table_name</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.constraint_table_usage.table_name</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.constraint_table_usage.constraint_catalog</code>.
     */
    public void setConstraintCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.constraint_table_usage.constraint_catalog</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.constraint_table_usage.constraint_schema</code>.
     */
    public void setConstraintSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.constraint_table_usage.constraint_schema</code>.
     */
    public String getConstraintSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.constraint_table_usage.constraint_name</code>.
     */
    public void setConstraintName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.constraint_table_usage.constraint_name</code>.
     */
    public String getConstraintName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ConstraintTableUsage.CONSTRAINT_TABLE_USAGE.TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ConstraintTableUsage.CONSTRAINT_TABLE_USAGE.TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ConstraintTableUsage.CONSTRAINT_TABLE_USAGE.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ConstraintTableUsage.CONSTRAINT_TABLE_USAGE.CONSTRAINT_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ConstraintTableUsage.CONSTRAINT_TABLE_USAGE.CONSTRAINT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ConstraintTableUsage.CONSTRAINT_TABLE_USAGE.CONSTRAINT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getConstraintCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getConstraintSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getConstraintCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getConstraintSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstraintTableUsageRecord value1(String value) {
        setTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstraintTableUsageRecord value2(String value) {
        setTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstraintTableUsageRecord value3(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstraintTableUsageRecord value4(String value) {
        setConstraintCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstraintTableUsageRecord value5(String value) {
        setConstraintSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstraintTableUsageRecord value6(String value) {
        setConstraintName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstraintTableUsageRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ConstraintTableUsageRecord
     */
    public ConstraintTableUsageRecord() {
        super(ConstraintTableUsage.CONSTRAINT_TABLE_USAGE);
    }

    /**
     * Create a detached, initialised ConstraintTableUsageRecord
     */
    public ConstraintTableUsageRecord(String tableCatalog, String tableSchema, String tableName, String constraintCatalog, String constraintSchema, String constraintName) {
        super(ConstraintTableUsage.CONSTRAINT_TABLE_USAGE);

        set(0, tableCatalog);
        set(1, tableSchema);
        set(2, tableName);
        set(3, constraintCatalog);
        set(4, constraintSchema);
        set(5, constraintName);
    }
}