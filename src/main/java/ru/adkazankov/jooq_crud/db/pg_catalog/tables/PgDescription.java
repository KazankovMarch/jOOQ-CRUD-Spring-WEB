/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.adkazankov.jooq_crud.db.pg_catalog.Indexes;
import ru.adkazankov.jooq_crud.db.pg_catalog.PgCatalog;
import ru.adkazankov.jooq_crud.db.pg_catalog.tables.records.PgDescriptionRecord;


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
public class PgDescription extends TableImpl<PgDescriptionRecord> {

    private static final long serialVersionUID = 1696920360;

    /**
     * The reference instance of <code>pg_catalog.pg_description</code>
     */
    public static final PgDescription PG_DESCRIPTION = new PgDescription();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgDescriptionRecord> getRecordType() {
        return PgDescriptionRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_description.objoid</code>.
     */
    public final TableField<PgDescriptionRecord, Long> OBJOID = createField("objoid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_description.classoid</code>.
     */
    public final TableField<PgDescriptionRecord, Long> CLASSOID = createField("classoid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_description.objsubid</code>.
     */
    public final TableField<PgDescriptionRecord, Integer> OBJSUBID = createField("objsubid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_description.description</code>.
     */
    public final TableField<PgDescriptionRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_description</code> table reference
     */
    public PgDescription() {
        this(DSL.name("pg_description"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_description</code> table reference
     */
    public PgDescription(String alias) {
        this(DSL.name(alias), PG_DESCRIPTION);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_description</code> table reference
     */
    public PgDescription(Name alias) {
        this(alias, PG_DESCRIPTION);
    }

    private PgDescription(Name alias, Table<PgDescriptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgDescription(Name alias, Table<PgDescriptionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_DESCRIPTION_O_C_O_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDescription as(String alias) {
        return new PgDescription(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDescription as(Name alias) {
        return new PgDescription(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgDescription rename(String name) {
        return new PgDescription(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgDescription rename(Name name) {
        return new PgDescription(name, null);
    }
}
