/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.tables.records;


import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.TableRecordImpl;

import ru.adkazankov.jooq_crud.db.pg_catalog.tables.PgStatAllTables;


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
public class PgStatAllTablesRecord extends TableRecordImpl<PgStatAllTablesRecord> implements Record22<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long, Long, Long, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, Long, Long, Long, Long> {

    private static final long serialVersionUID = 451443817;

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.relid</code>.
     */
    public void setRelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.relname</code>.
     */
    public void setRelname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.relname</code>.
     */
    public String getRelname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.seq_scan</code>.
     */
    public void setSeqScan(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.seq_scan</code>.
     */
    public Long getSeqScan() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.seq_tup_read</code>.
     */
    public void setSeqTupRead(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.seq_tup_read</code>.
     */
    public Long getSeqTupRead() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.idx_scan</code>.
     */
    public void setIdxScan(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.idx_scan</code>.
     */
    public Long getIdxScan() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.idx_tup_fetch</code>.
     */
    public void setIdxTupFetch(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.idx_tup_fetch</code>.
     */
    public Long getIdxTupFetch() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.n_tup_ins</code>.
     */
    public void setNTupIns(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.n_tup_ins</code>.
     */
    public Long getNTupIns() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.n_tup_upd</code>.
     */
    public void setNTupUpd(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.n_tup_upd</code>.
     */
    public Long getNTupUpd() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.n_tup_del</code>.
     */
    public void setNTupDel(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.n_tup_del</code>.
     */
    public Long getNTupDel() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.n_tup_hot_upd</code>.
     */
    public void setNTupHotUpd(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.n_tup_hot_upd</code>.
     */
    public Long getNTupHotUpd() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.n_live_tup</code>.
     */
    public void setNLiveTup(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.n_live_tup</code>.
     */
    public Long getNLiveTup() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.n_dead_tup</code>.
     */
    public void setNDeadTup(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.n_dead_tup</code>.
     */
    public Long getNDeadTup() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.n_mod_since_analyze</code>.
     */
    public void setNModSinceAnalyze(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.n_mod_since_analyze</code>.
     */
    public Long getNModSinceAnalyze() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.last_vacuum</code>.
     */
    public void setLastVacuum(OffsetDateTime value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.last_vacuum</code>.
     */
    public OffsetDateTime getLastVacuum() {
        return (OffsetDateTime) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.last_autovacuum</code>.
     */
    public void setLastAutovacuum(OffsetDateTime value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.last_autovacuum</code>.
     */
    public OffsetDateTime getLastAutovacuum() {
        return (OffsetDateTime) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.last_analyze</code>.
     */
    public void setLastAnalyze(OffsetDateTime value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.last_analyze</code>.
     */
    public OffsetDateTime getLastAnalyze() {
        return (OffsetDateTime) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.last_autoanalyze</code>.
     */
    public void setLastAutoanalyze(OffsetDateTime value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.last_autoanalyze</code>.
     */
    public OffsetDateTime getLastAutoanalyze() {
        return (OffsetDateTime) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.vacuum_count</code>.
     */
    public void setVacuumCount(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.vacuum_count</code>.
     */
    public Long getVacuumCount() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.autovacuum_count</code>.
     */
    public void setAutovacuumCount(Long value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.autovacuum_count</code>.
     */
    public Long getAutovacuumCount() {
        return (Long) get(19);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.analyze_count</code>.
     */
    public void setAnalyzeCount(Long value) {
        set(20, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.analyze_count</code>.
     */
    public Long getAnalyzeCount() {
        return (Long) get(20);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_all_tables.autoanalyze_count</code>.
     */
    public void setAutoanalyzeCount(Long value) {
        set(21, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_all_tables.autoanalyze_count</code>.
     */
    public Long getAutoanalyzeCount() {
        return (Long) get(21);
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long, Long, Long, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, Long, Long, Long, Long> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long, Long, Long, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, Long, Long, Long, Long> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.RELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.SCHEMANAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.RELNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.SEQ_SCAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.SEQ_TUP_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.IDX_SCAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.IDX_TUP_FETCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.N_TUP_INS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.N_TUP_UPD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.N_TUP_DEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.N_TUP_HOT_UPD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.N_LIVE_TUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.N_DEAD_TUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.N_MOD_SINCE_ANALYZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field15() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.LAST_VACUUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field16() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.LAST_AUTOVACUUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field17() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.LAST_ANALYZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field18() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.LAST_AUTOANALYZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field19() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.VACUUM_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field20() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.AUTOVACUUM_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field21() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.ANALYZE_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field22() {
        return PgStatAllTables.PG_STAT_ALL_TABLES.AUTOANALYZE_COUNT;
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
        return getSeqScan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getSeqTupRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getIdxScan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getIdxTupFetch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getNTupIns();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getNTupUpd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getNTupDel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getNTupHotUpd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component12() {
        return getNLiveTup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component13() {
        return getNDeadTup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component14() {
        return getNModSinceAnalyze();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component15() {
        return getLastVacuum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component16() {
        return getLastAutovacuum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component17() {
        return getLastAnalyze();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component18() {
        return getLastAutoanalyze();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component19() {
        return getVacuumCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component20() {
        return getAutovacuumCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component21() {
        return getAnalyzeCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component22() {
        return getAutoanalyzeCount();
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
        return getSeqScan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getSeqTupRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getIdxScan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getIdxTupFetch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getNTupIns();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getNTupUpd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getNTupDel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getNTupHotUpd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getNLiveTup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getNDeadTup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getNModSinceAnalyze();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value15() {
        return getLastVacuum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value16() {
        return getLastAutovacuum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value17() {
        return getLastAnalyze();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value18() {
        return getLastAutoanalyze();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value19() {
        return getVacuumCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value20() {
        return getAutovacuumCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value21() {
        return getAnalyzeCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value22() {
        return getAutoanalyzeCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value1(Long value) {
        setRelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value2(String value) {
        setSchemaname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value3(String value) {
        setRelname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value4(Long value) {
        setSeqScan(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value5(Long value) {
        setSeqTupRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value6(Long value) {
        setIdxScan(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value7(Long value) {
        setIdxTupFetch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value8(Long value) {
        setNTupIns(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value9(Long value) {
        setNTupUpd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value10(Long value) {
        setNTupDel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value11(Long value) {
        setNTupHotUpd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value12(Long value) {
        setNLiveTup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value13(Long value) {
        setNDeadTup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value14(Long value) {
        setNModSinceAnalyze(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value15(OffsetDateTime value) {
        setLastVacuum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value16(OffsetDateTime value) {
        setLastAutovacuum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value17(OffsetDateTime value) {
        setLastAnalyze(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value18(OffsetDateTime value) {
        setLastAutoanalyze(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value19(Long value) {
        setVacuumCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value20(Long value) {
        setAutovacuumCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value21(Long value) {
        setAnalyzeCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord value22(Long value) {
        setAutoanalyzeCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatAllTablesRecord values(Long value1, String value2, String value3, Long value4, Long value5, Long value6, Long value7, Long value8, Long value9, Long value10, Long value11, Long value12, Long value13, Long value14, OffsetDateTime value15, OffsetDateTime value16, OffsetDateTime value17, OffsetDateTime value18, Long value19, Long value20, Long value21, Long value22) {
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
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatAllTablesRecord
     */
    public PgStatAllTablesRecord() {
        super(PgStatAllTables.PG_STAT_ALL_TABLES);
    }

    /**
     * Create a detached, initialised PgStatAllTablesRecord
     */
    public PgStatAllTablesRecord(Long relid, String schemaname, String relname, Long seqScan, Long seqTupRead, Long idxScan, Long idxTupFetch, Long nTupIns, Long nTupUpd, Long nTupDel, Long nTupHotUpd, Long nLiveTup, Long nDeadTup, Long nModSinceAnalyze, OffsetDateTime lastVacuum, OffsetDateTime lastAutovacuum, OffsetDateTime lastAnalyze, OffsetDateTime lastAutoanalyze, Long vacuumCount, Long autovacuumCount, Long analyzeCount, Long autoanalyzeCount) {
        super(PgStatAllTables.PG_STAT_ALL_TABLES);

        set(0, relid);
        set(1, schemaname);
        set(2, relname);
        set(3, seqScan);
        set(4, seqTupRead);
        set(5, idxScan);
        set(6, idxTupFetch);
        set(7, nTupIns);
        set(8, nTupUpd);
        set(9, nTupDel);
        set(10, nTupHotUpd);
        set(11, nLiveTup);
        set(12, nDeadTup);
        set(13, nModSinceAnalyze);
        set(14, lastVacuum);
        set(15, lastAutovacuum);
        set(16, lastAnalyze);
        set(17, lastAutoanalyze);
        set(18, vacuumCount);
        set(19, autovacuumCount);
        set(20, analyzeCount);
        set(21, autoanalyzeCount);
    }
}
