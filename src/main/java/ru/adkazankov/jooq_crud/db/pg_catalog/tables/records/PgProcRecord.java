/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.tables.records;


import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;

import ru.adkazankov.jooq_crud.db.pg_catalog.tables.PgProc;


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
public class PgProcRecord extends TableRecordImpl<PgProcRecord> {

    private static final long serialVersionUID = -107777281;

    /**
     * Setter for <code>pg_catalog.pg_proc.proname</code>.
     */
    public void setProname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proname</code>.
     */
    public String getProname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.pronamespace</code>.
     */
    public void setPronamespace(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.pronamespace</code>.
     */
    public Long getPronamespace() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proowner</code>.
     */
    public void setProowner(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proowner</code>.
     */
    public Long getProowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.prolang</code>.
     */
    public void setProlang(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.prolang</code>.
     */
    public Long getProlang() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.procost</code>.
     */
    public void setProcost(Float value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.procost</code>.
     */
    public Float getProcost() {
        return (Float) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.prorows</code>.
     */
    public void setProrows(Float value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.prorows</code>.
     */
    public Float getProrows() {
        return (Float) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.provariadic</code>.
     */
    public void setProvariadic(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.provariadic</code>.
     */
    public Long getProvariadic() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.protransform</code>.
     */
    public void setProtransform(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.protransform</code>.
     */
    public String getProtransform() {
        return (String) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proisagg</code>.
     */
    public void setProisagg(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proisagg</code>.
     */
    public Boolean getProisagg() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proiswindow</code>.
     */
    public void setProiswindow(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proiswindow</code>.
     */
    public Boolean getProiswindow() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.prosecdef</code>.
     */
    public void setProsecdef(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.prosecdef</code>.
     */
    public Boolean getProsecdef() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proleakproof</code>.
     */
    public void setProleakproof(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proleakproof</code>.
     */
    public Boolean getProleakproof() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proisstrict</code>.
     */
    public void setProisstrict(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proisstrict</code>.
     */
    public Boolean getProisstrict() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proretset</code>.
     */
    public void setProretset(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proretset</code>.
     */
    public Boolean getProretset() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.provolatile</code>.
     */
    public void setProvolatile(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.provolatile</code>.
     */
    public String getProvolatile() {
        return (String) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proparallel</code>.
     */
    public void setProparallel(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proparallel</code>.
     */
    public String getProparallel() {
        return (String) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.pronargs</code>.
     */
    public void setPronargs(Short value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.pronargs</code>.
     */
    public Short getPronargs() {
        return (Short) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.pronargdefaults</code>.
     */
    public void setPronargdefaults(Short value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.pronargdefaults</code>.
     */
    public Short getPronargdefaults() {
        return (Short) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.prorettype</code>.
     */
    public void setProrettype(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.prorettype</code>.
     */
    public Long getProrettype() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proargtypes</code>.
     */
    public void setProargtypes(Long... value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proargtypes</code>.
     */
    public Long[] getProargtypes() {
        return (Long[]) get(19);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proallargtypes</code>.
     */
    public void setProallargtypes(Long... value) {
        set(20, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proallargtypes</code>.
     */
    public Long[] getProallargtypes() {
        return (Long[]) get(20);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proargmodes</code>.
     */
    public void setProargmodes(String... value) {
        set(21, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proargmodes</code>.
     */
    public String[] getProargmodes() {
        return (String[]) get(21);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proargnames</code>.
     */
    public void setProargnames(String... value) {
        set(22, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proargnames</code>.
     */
    public String[] getProargnames() {
        return (String[]) get(22);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setProargdefaults(Object value) {
        set(23, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getProargdefaults() {
        return get(23);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.protrftypes</code>.
     */
    public void setProtrftypes(Long... value) {
        set(24, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.protrftypes</code>.
     */
    public Long[] getProtrftypes() {
        return (Long[]) get(24);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.prosrc</code>.
     */
    public void setProsrc(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.prosrc</code>.
     */
    public String getProsrc() {
        return (String) get(25);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.probin</code>.
     */
    public void setProbin(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.probin</code>.
     */
    public String getProbin() {
        return (String) get(26);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proconfig</code>.
     */
    public void setProconfig(String... value) {
        set(27, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proconfig</code>.
     */
    public String[] getProconfig() {
        return (String[]) get(27);
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proacl</code>.
     */
    public void setProacl(String... value) {
        set(28, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proacl</code>.
     */
    public String[] getProacl() {
        return (String[]) get(28);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgProcRecord
     */
    public PgProcRecord() {
        super(PgProc.PG_PROC);
    }

    /**
     * Create a detached, initialised PgProcRecord
     */
    public PgProcRecord(String proname, Long pronamespace, Long proowner, Long prolang, Float procost, Float prorows, Long provariadic, String protransform, Boolean proisagg, Boolean proiswindow, Boolean prosecdef, Boolean proleakproof, Boolean proisstrict, Boolean proretset, String provolatile, String proparallel, Short pronargs, Short pronargdefaults, Long prorettype, Long[] proargtypes, Long[] proallargtypes, String[] proargmodes, String[] proargnames, Object proargdefaults, Long[] protrftypes, String prosrc, String probin, String[] proconfig, String[] proacl) {
        super(PgProc.PG_PROC);

        set(0, proname);
        set(1, pronamespace);
        set(2, proowner);
        set(3, prolang);
        set(4, procost);
        set(5, prorows);
        set(6, provariadic);
        set(7, protransform);
        set(8, proisagg);
        set(9, proiswindow);
        set(10, prosecdef);
        set(11, proleakproof);
        set(12, proisstrict);
        set(13, proretset);
        set(14, provolatile);
        set(15, proparallel);
        set(16, pronargs);
        set(17, pronargdefaults);
        set(18, prorettype);
        set(19, proargtypes);
        set(20, proallargtypes);
        set(21, proargmodes);
        set(22, proargnames);
        set(23, proargdefaults);
        set(24, protrftypes);
        set(25, prosrc);
        set(26, probin);
        set(27, proconfig);
        set(28, proacl);
    }
}
