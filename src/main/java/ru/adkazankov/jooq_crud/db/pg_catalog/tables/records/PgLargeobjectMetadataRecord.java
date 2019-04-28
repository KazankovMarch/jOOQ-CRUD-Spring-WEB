/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;

import ru.adkazankov.jooq_crud.db.pg_catalog.tables.PgLargeobjectMetadata;


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
public class PgLargeobjectMetadataRecord extends TableRecordImpl<PgLargeobjectMetadataRecord> implements Record2<Long, String[]> {

    private static final long serialVersionUID = -849768188;

    /**
     * Setter for <code>pg_catalog.pg_largeobject_metadata.lomowner</code>.
     */
    public void setLomowner(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_largeobject_metadata.lomowner</code>.
     */
    public Long getLomowner() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_largeobject_metadata.lomacl</code>.
     */
    public void setLomacl(String... value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_largeobject_metadata.lomacl</code>.
     */
    public String[] getLomacl() {
        return (String[]) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String[]> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String[]> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA.LOMOWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field2() {
        return PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA.LOMACL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getLomowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component2() {
        return getLomacl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getLomowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value2() {
        return getLomacl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLargeobjectMetadataRecord value1(Long value) {
        setLomowner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLargeobjectMetadataRecord value2(String... value) {
        setLomacl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLargeobjectMetadataRecord values(Long value1, String[] value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgLargeobjectMetadataRecord
     */
    public PgLargeobjectMetadataRecord() {
        super(PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA);
    }

    /**
     * Create a detached, initialised PgLargeobjectMetadataRecord
     */
    public PgLargeobjectMetadataRecord(Long lomowner, String[] lomacl) {
        super(PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA);

        set(0, lomowner);
        set(1, lomacl);
    }
}