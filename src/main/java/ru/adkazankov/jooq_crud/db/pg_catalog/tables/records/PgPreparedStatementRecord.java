/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.tables.records;


import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;

import ru.adkazankov.jooq_crud.db.pg_catalog.tables.PgPreparedStatement;


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
public class PgPreparedStatementRecord extends TableRecordImpl<PgPreparedStatementRecord> implements Record5<String, String, OffsetDateTime, Object[], Boolean> {

    private static final long serialVersionUID = 724627836;

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.statement</code>.
     */
    public void setStatement(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.statement</code>.
     */
    public String getStatement() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.prepare_time</code>.
     */
    public void setPrepareTime(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.prepare_time</code>.
     */
    public OffsetDateTime getPrepareTime() {
        return (OffsetDateTime) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.parameter_types</code>.
     */
    public void setParameterTypes(Object... value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.parameter_types</code>.
     */
    public Object[] getParameterTypes() {
        return (Object[]) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.from_sql</code>.
     */
    public void setFromSql(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.from_sql</code>.
     */
    public Boolean getFromSql() {
        return (Boolean) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, OffsetDateTime, Object[], Boolean> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, OffsetDateTime, Object[], Boolean> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgPreparedStatement.PG_PREPARED_STATEMENT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgPreparedStatement.PG_PREPARED_STATEMENT.STATEMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field3() {
        return PgPreparedStatement.PG_PREPARED_STATEMENT.PREPARE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object[]> field4() {
        return PgPreparedStatement.PG_PREPARED_STATEMENT.PARAMETER_TYPES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return PgPreparedStatement.PG_PREPARED_STATEMENT.FROM_SQL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getStatement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component3() {
        return getPrepareTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object[] component4() {
        return getParameterTypes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getFromSql();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getStatement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value3() {
        return getPrepareTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object[] value4() {
        return getParameterTypes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getFromSql();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedStatementRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedStatementRecord value2(String value) {
        setStatement(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedStatementRecord value3(OffsetDateTime value) {
        setPrepareTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedStatementRecord value4(Object... value) {
        setParameterTypes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedStatementRecord value5(Boolean value) {
        setFromSql(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedStatementRecord values(String value1, String value2, OffsetDateTime value3, Object[] value4, Boolean value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgPreparedStatementRecord
     */
    public PgPreparedStatementRecord() {
        super(PgPreparedStatement.PG_PREPARED_STATEMENT);
    }

    /**
     * Create a detached, initialised PgPreparedStatementRecord
     */
    public PgPreparedStatementRecord(String name, String statement, OffsetDateTime prepareTime, Object[] parameterTypes, Boolean fromSql) {
        super(PgPreparedStatement.PG_PREPARED_STATEMENT);

        set(0, name);
        set(1, statement);
        set(2, prepareTime);
        set(3, parameterTypes);
        set(4, fromSql);
    }
}
