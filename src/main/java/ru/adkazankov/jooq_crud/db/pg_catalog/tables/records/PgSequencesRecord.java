/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;

import ru.adkazankov.jooq_crud.db.pg_catalog.tables.PgSequences;


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
public class PgSequencesRecord extends TableRecordImpl<PgSequencesRecord> implements Record11<String, String, String, Object, Long, Long, Long, Long, Boolean, Long, Long> {

    private static final long serialVersionUID = 2007675911;

    /**
     * Setter for <code>pg_catalog.pg_sequences.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.sequencename</code>.
     */
    public void setSequencename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.sequencename</code>.
     */
    public String getSequencename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.sequenceowner</code>.
     */
    public void setSequenceowner(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.sequenceowner</code>.
     */
    public String getSequenceowner() {
        return (String) get(2);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setDataType(Object value) {
        set(3, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getDataType() {
        return get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.start_value</code>.
     */
    public void setStartValue(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.start_value</code>.
     */
    public Long getStartValue() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.min_value</code>.
     */
    public void setMinValue(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.min_value</code>.
     */
    public Long getMinValue() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.max_value</code>.
     */
    public void setMaxValue(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.max_value</code>.
     */
    public Long getMaxValue() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.increment_by</code>.
     */
    public void setIncrementBy(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.increment_by</code>.
     */
    public Long getIncrementBy() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.cycle</code>.
     */
    public void setCycle(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.cycle</code>.
     */
    public Boolean getCycle() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.cache_size</code>.
     */
    public void setCacheSize(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.cache_size</code>.
     */
    public Long getCacheSize() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.last_value</code>.
     */
    public void setLastValue(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.last_value</code>.
     */
    public Long getLastValue() {
        return (Long) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, Object, Long, Long, Long, Long, Boolean, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, Object, Long, Long, Long, Long, Boolean, Long, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgSequences.PG_SEQUENCES.SCHEMANAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgSequences.PG_SEQUENCES.SEQUENCENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgSequences.PG_SEQUENCES.SEQUENCEOWNER;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field4() {
        return PgSequences.PG_SEQUENCES.DATA_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return PgSequences.PG_SEQUENCES.START_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return PgSequences.PG_SEQUENCES.MIN_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return PgSequences.PG_SEQUENCES.MAX_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return PgSequences.PG_SEQUENCES.INCREMENT_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return PgSequences.PG_SEQUENCES.CYCLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return PgSequences.PG_SEQUENCES.CACHE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return PgSequences.PG_SEQUENCES.LAST_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSequencename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSequenceowner();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component4() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getStartValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getMinValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getMaxValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getIncrementBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getCycle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getCacheSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getLastValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSequencename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSequenceowner();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value4() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getStartValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getMinValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getMaxValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getIncrementBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getCycle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getCacheSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getLastValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value1(String value) {
        setSchemaname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value2(String value) {
        setSequencename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value3(String value) {
        setSequenceowner(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public PgSequencesRecord value4(Object value) {
        setDataType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value5(Long value) {
        setStartValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value6(Long value) {
        setMinValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value7(Long value) {
        setMaxValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value8(Long value) {
        setIncrementBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value9(Boolean value) {
        setCycle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value10(Long value) {
        setCacheSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value11(Long value) {
        setLastValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord values(String value1, String value2, String value3, Object value4, Long value5, Long value6, Long value7, Long value8, Boolean value9, Long value10, Long value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgSequencesRecord
     */
    public PgSequencesRecord() {
        super(PgSequences.PG_SEQUENCES);
    }

    /**
     * Create a detached, initialised PgSequencesRecord
     */
    public PgSequencesRecord(String schemaname, String sequencename, String sequenceowner, Object dataType, Long startValue, Long minValue, Long maxValue, Long incrementBy, Boolean cycle, Long cacheSize, Long lastValue) {
        super(PgSequences.PG_SEQUENCES);

        set(0, schemaname);
        set(1, sequencename);
        set(2, sequenceowner);
        set(3, dataType);
        set(4, startValue);
        set(5, minValue);
        set(6, maxValue);
        set(7, incrementBy);
        set(8, cycle);
        set(9, cacheSize);
        set(10, lastValue);
    }
}
