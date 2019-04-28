/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;

import ru.adkazankov.jooq_crud.db.pg_catalog.tables.PgEnum;


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
public class PgEnumRecord extends TableRecordImpl<PgEnumRecord> implements Record3<Long, Float, String> {

    private static final long serialVersionUID = 1426724044;

    /**
     * Setter for <code>pg_catalog.pg_enum.enumtypid</code>.
     */
    public void setEnumtypid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_enum.enumtypid</code>.
     */
    public Long getEnumtypid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_enum.enumsortorder</code>.
     */
    public void setEnumsortorder(Float value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_enum.enumsortorder</code>.
     */
    public Float getEnumsortorder() {
        return (Float) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_enum.enumlabel</code>.
     */
    public void setEnumlabel(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_enum.enumlabel</code>.
     */
    public String getEnumlabel() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Float, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Float, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgEnum.PG_ENUM.ENUMTYPID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Float> field2() {
        return PgEnum.PG_ENUM.ENUMSORTORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgEnum.PG_ENUM.ENUMLABEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getEnumtypid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float component2() {
        return getEnumsortorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEnumlabel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getEnumtypid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float value2() {
        return getEnumsortorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEnumlabel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgEnumRecord value1(Long value) {
        setEnumtypid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgEnumRecord value2(Float value) {
        setEnumsortorder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgEnumRecord value3(String value) {
        setEnumlabel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgEnumRecord values(Long value1, Float value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgEnumRecord
     */
    public PgEnumRecord() {
        super(PgEnum.PG_ENUM);
    }

    /**
     * Create a detached, initialised PgEnumRecord
     */
    public PgEnumRecord(Long enumtypid, Float enumsortorder, String enumlabel) {
        super(PgEnum.PG_ENUM);

        set(0, enumtypid);
        set(1, enumsortorder);
        set(2, enumlabel);
    }
}
