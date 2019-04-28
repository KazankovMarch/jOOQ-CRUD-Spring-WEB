/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.information_schema.tables;


import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.adkazankov.jooq_crud.db.information_schema.InformationSchema;
import ru.adkazankov.jooq_crud.db.information_schema.tables.records.TriggersRecord;


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
public class Triggers extends TableImpl<TriggersRecord> {

    private static final long serialVersionUID = 1540455941;

    /**
     * The reference instance of <code>information_schema.triggers</code>
     */
    public static final Triggers TRIGGERS = new Triggers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TriggersRecord> getRecordType() {
        return TriggersRecord.class;
    }

    /**
     * The column <code>information_schema.triggers.trigger_catalog</code>.
     */
    public final TableField<TriggersRecord, String> TRIGGER_CATALOG = createField("trigger_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.trigger_schema</code>.
     */
    public final TableField<TriggersRecord, String> TRIGGER_SCHEMA = createField("trigger_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.trigger_name</code>.
     */
    public final TableField<TriggersRecord, String> TRIGGER_NAME = createField("trigger_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.event_manipulation</code>.
     */
    public final TableField<TriggersRecord, String> EVENT_MANIPULATION = createField("event_manipulation", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.event_object_catalog</code>.
     */
    public final TableField<TriggersRecord, String> EVENT_OBJECT_CATALOG = createField("event_object_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.event_object_schema</code>.
     */
    public final TableField<TriggersRecord, String> EVENT_OBJECT_SCHEMA = createField("event_object_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.event_object_table</code>.
     */
    public final TableField<TriggersRecord, String> EVENT_OBJECT_TABLE = createField("event_object_table", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.action_order</code>.
     */
    public final TableField<TriggersRecord, Integer> ACTION_ORDER = createField("action_order", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.triggers.action_condition</code>.
     */
    public final TableField<TriggersRecord, String> ACTION_CONDITION = createField("action_condition", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.action_statement</code>.
     */
    public final TableField<TriggersRecord, String> ACTION_STATEMENT = createField("action_statement", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.action_orientation</code>.
     */
    public final TableField<TriggersRecord, String> ACTION_ORIENTATION = createField("action_orientation", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.action_timing</code>.
     */
    public final TableField<TriggersRecord, String> ACTION_TIMING = createField("action_timing", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.action_reference_old_table</code>.
     */
    public final TableField<TriggersRecord, String> ACTION_REFERENCE_OLD_TABLE = createField("action_reference_old_table", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.action_reference_new_table</code>.
     */
    public final TableField<TriggersRecord, String> ACTION_REFERENCE_NEW_TABLE = createField("action_reference_new_table", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.action_reference_old_row</code>.
     */
    public final TableField<TriggersRecord, String> ACTION_REFERENCE_OLD_ROW = createField("action_reference_old_row", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.action_reference_new_row</code>.
     */
    public final TableField<TriggersRecord, String> ACTION_REFERENCE_NEW_ROW = createField("action_reference_new_row", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.created</code>.
     */
    public final TableField<TriggersRecord, OffsetDateTime> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * Create a <code>information_schema.triggers</code> table reference
     */
    public Triggers() {
        this(DSL.name("triggers"), null);
    }

    /**
     * Create an aliased <code>information_schema.triggers</code> table reference
     */
    public Triggers(String alias) {
        this(DSL.name(alias), TRIGGERS);
    }

    /**
     * Create an aliased <code>information_schema.triggers</code> table reference
     */
    public Triggers(Name alias) {
        this(alias, TRIGGERS);
    }

    private Triggers(Name alias, Table<TriggersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Triggers(Name alias, Table<TriggersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Triggers as(String alias) {
        return new Triggers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Triggers as(Name alias) {
        return new Triggers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Triggers rename(String name) {
        return new Triggers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Triggers rename(Name name) {
        return new Triggers(name, null);
    }
}
