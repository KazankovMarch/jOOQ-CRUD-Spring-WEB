/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;

import ru.adkazankov.jooq_crud.db.pg_catalog.tables.PgStatioSysTables;


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
public class PgStatioSysTablesRecord extends TableRecordImpl<PgStatioSysTablesRecord> implements Record11<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long> {

    private static final long serialVersionUID = -482486872;

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.relid</code>.
     */
    public void setRelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.relname</code>.
     */
    public void setRelname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.relname</code>.
     */
    public String getRelname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.heap_blks_read</code>.
     */
    public void setHeapBlksRead(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.heap_blks_read</code>.
     */
    public Long getHeapBlksRead() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.heap_blks_hit</code>.
     */
    public void setHeapBlksHit(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.heap_blks_hit</code>.
     */
    public Long getHeapBlksHit() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.idx_blks_read</code>.
     */
    public void setIdxBlksRead(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.idx_blks_read</code>.
     */
    public Long getIdxBlksRead() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.idx_blks_hit</code>.
     */
    public void setIdxBlksHit(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.idx_blks_hit</code>.
     */
    public Long getIdxBlksHit() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.toast_blks_read</code>.
     */
    public void setToastBlksRead(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.toast_blks_read</code>.
     */
    public Long getToastBlksRead() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.toast_blks_hit</code>.
     */
    public void setToastBlksHit(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.toast_blks_hit</code>.
     */
    public Long getToastBlksHit() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.tidx_blks_read</code>.
     */
    public void setTidxBlksRead(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.tidx_blks_read</code>.
     */
    public Long getTidxBlksRead() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_tables.tidx_blks_hit</code>.
     */
    public void setTidxBlksHit(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_tables.tidx_blks_hit</code>.
     */
    public Long getTidxBlksHit() {
        return (Long) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgStatioSysTables.PG_STATIO_SYS_TABLES.RELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgStatioSysTables.PG_STATIO_SYS_TABLES.SCHEMANAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgStatioSysTables.PG_STATIO_SYS_TABLES.RELNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return PgStatioSysTables.PG_STATIO_SYS_TABLES.HEAP_BLKS_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return PgStatioSysTables.PG_STATIO_SYS_TABLES.HEAP_BLKS_HIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return PgStatioSysTables.PG_STATIO_SYS_TABLES.IDX_BLKS_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return PgStatioSysTables.PG_STATIO_SYS_TABLES.IDX_BLKS_HIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return PgStatioSysTables.PG_STATIO_SYS_TABLES.TOAST_BLKS_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return PgStatioSysTables.PG_STATIO_SYS_TABLES.TOAST_BLKS_HIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return PgStatioSysTables.PG_STATIO_SYS_TABLES.TIDX_BLKS_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return PgStatioSysTables.PG_STATIO_SYS_TABLES.TIDX_BLKS_HIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getRelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getRelname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getHeapBlksRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getHeapBlksHit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getIdxBlksRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getIdxBlksHit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getToastBlksRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getToastBlksHit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getTidxBlksRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getTidxBlksHit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getRelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRelname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getHeapBlksRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getHeapBlksHit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getIdxBlksRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getIdxBlksHit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getToastBlksRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getToastBlksHit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getTidxBlksRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getTidxBlksHit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysTablesRecord value1(Long value) {
        setRelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysTablesRecord value2(String value) {
        setSchemaname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysTablesRecord value3(String value) {
        setRelname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysTablesRecord value4(Long value) {
        setHeapBlksRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysTablesRecord value5(Long value) {
        setHeapBlksHit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysTablesRecord value6(Long value) {
        setIdxBlksRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysTablesRecord value7(Long value) {
        setIdxBlksHit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysTablesRecord value8(Long value) {
        setToastBlksRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysTablesRecord value9(Long value) {
        setToastBlksHit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysTablesRecord value10(Long value) {
        setTidxBlksRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysTablesRecord value11(Long value) {
        setTidxBlksHit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysTablesRecord values(Long value1, String value2, String value3, Long value4, Long value5, Long value6, Long value7, Long value8, Long value9, Long value10, Long value11) {
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
     * Create a detached PgStatioSysTablesRecord
     */
    public PgStatioSysTablesRecord() {
        super(PgStatioSysTables.PG_STATIO_SYS_TABLES);
    }

    /**
     * Create a detached, initialised PgStatioSysTablesRecord
     */
    public PgStatioSysTablesRecord(Long relid, String schemaname, String relname, Long heapBlksRead, Long heapBlksHit, Long idxBlksRead, Long idxBlksHit, Long toastBlksRead, Long toastBlksHit, Long tidxBlksRead, Long tidxBlksHit) {
        super(PgStatioSysTables.PG_STATIO_SYS_TABLES);

        set(0, relid);
        set(1, schemaname);
        set(2, relname);
        set(3, heapBlksRead);
        set(4, heapBlksHit);
        set(5, idxBlksRead);
        set(6, idxBlksHit);
        set(7, toastBlksRead);
        set(8, toastBlksHit);
        set(9, tidxBlksRead);
        set(10, tidxBlksHit);
    }
}
