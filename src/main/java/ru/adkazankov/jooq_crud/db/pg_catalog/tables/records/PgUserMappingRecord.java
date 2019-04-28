/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;

import ru.adkazankov.jooq_crud.db.pg_catalog.tables.PgUserMapping;


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
public class PgUserMappingRecord extends TableRecordImpl<PgUserMappingRecord> implements Record3<Long, Long, String[]> {

    private static final long serialVersionUID = 1100002249;

    /**
     * Setter for <code>pg_catalog.pg_user_mapping.umuser</code>.
     */
    public void setUmuser(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mapping.umuser</code>.
     */
    public Long getUmuser() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mapping.umserver</code>.
     */
    public void setUmserver(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mapping.umserver</code>.
     */
    public Long getUmserver() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mapping.umoptions</code>.
     */
    public void setUmoptions(String... value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mapping.umoptions</code>.
     */
    public String[] getUmoptions() {
        return (String[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, String[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, String[]> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgUserMapping.PG_USER_MAPPING.UMUSER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgUserMapping.PG_USER_MAPPING.UMSERVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field3() {
        return PgUserMapping.PG_USER_MAPPING.UMOPTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getUmuser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getUmserver();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component3() {
        return getUmoptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getUmuser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getUmserver();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value3() {
        return getUmoptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserMappingRecord value1(Long value) {
        setUmuser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserMappingRecord value2(Long value) {
        setUmserver(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserMappingRecord value3(String... value) {
        setUmoptions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserMappingRecord values(Long value1, Long value2, String[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgUserMappingRecord
     */
    public PgUserMappingRecord() {
        super(PgUserMapping.PG_USER_MAPPING);
    }

    /**
     * Create a detached, initialised PgUserMappingRecord
     */
    public PgUserMappingRecord(Long umuser, Long umserver, String[] umoptions) {
        super(PgUserMapping.PG_USER_MAPPING);

        set(0, umuser);
        set(1, umserver);
        set(2, umoptions);
    }
}
