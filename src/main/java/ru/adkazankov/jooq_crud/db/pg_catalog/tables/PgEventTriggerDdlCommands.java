/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.adkazankov.jooq_crud.db.pg_catalog.PgCatalog;
import ru.adkazankov.jooq_crud.db.pg_catalog.tables.records.PgEventTriggerDdlCommandsRecord;


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
public class PgEventTriggerDdlCommands extends TableImpl<PgEventTriggerDdlCommandsRecord> {

    private static final long serialVersionUID = -936591369;

    /**
     * The reference instance of <code>pg_catalog.pg_event_trigger_ddl_commands</code>
     */
    public static final PgEventTriggerDdlCommands PG_EVENT_TRIGGER_DDL_COMMANDS = new PgEventTriggerDdlCommands();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgEventTriggerDdlCommandsRecord> getRecordType() {
        return PgEventTriggerDdlCommandsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_event_trigger_ddl_commands.classid</code>.
     */
    public final TableField<PgEventTriggerDdlCommandsRecord, Long> CLASSID = createField("classid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_ddl_commands.objid</code>.
     */
    public final TableField<PgEventTriggerDdlCommandsRecord, Long> OBJID = createField("objid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_ddl_commands.objsubid</code>.
     */
    public final TableField<PgEventTriggerDdlCommandsRecord, Integer> OBJSUBID = createField("objsubid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_ddl_commands.command_tag</code>.
     */
    public final TableField<PgEventTriggerDdlCommandsRecord, String> COMMAND_TAG = createField("command_tag", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_ddl_commands.object_type</code>.
     */
    public final TableField<PgEventTriggerDdlCommandsRecord, String> OBJECT_TYPE = createField("object_type", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_ddl_commands.schema_name</code>.
     */
    public final TableField<PgEventTriggerDdlCommandsRecord, String> SCHEMA_NAME = createField("schema_name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_ddl_commands.object_identity</code>.
     */
    public final TableField<PgEventTriggerDdlCommandsRecord, String> OBJECT_IDENTITY = createField("object_identity", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_ddl_commands.in_extension</code>.
     */
    public final TableField<PgEventTriggerDdlCommandsRecord, Boolean> IN_EXTENSION = createField("in_extension", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgEventTriggerDdlCommandsRecord, Object> COMMAND = createField("command", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_ddl_command"), this, "");

    /**
     * Create a <code>pg_catalog.pg_event_trigger_ddl_commands</code> table reference
     */
    public PgEventTriggerDdlCommands() {
        this(DSL.name("pg_event_trigger_ddl_commands"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_event_trigger_ddl_commands</code> table reference
     */
    public PgEventTriggerDdlCommands(String alias) {
        this(DSL.name(alias), PG_EVENT_TRIGGER_DDL_COMMANDS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_event_trigger_ddl_commands</code> table reference
     */
    public PgEventTriggerDdlCommands(Name alias) {
        this(alias, PG_EVENT_TRIGGER_DDL_COMMANDS);
    }

    private PgEventTriggerDdlCommands(Name alias, Table<PgEventTriggerDdlCommandsRecord> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private PgEventTriggerDdlCommands(Name alias, Table<PgEventTriggerDdlCommandsRecord> aliased, Field<?>[] parameters) {
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
    public PgEventTriggerDdlCommands as(String alias) {
        return new PgEventTriggerDdlCommands(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgEventTriggerDdlCommands as(Name alias) {
        return new PgEventTriggerDdlCommands(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgEventTriggerDdlCommands rename(String name) {
        return new PgEventTriggerDdlCommands(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgEventTriggerDdlCommands rename(Name name) {
        return new PgEventTriggerDdlCommands(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgEventTriggerDdlCommands call() {
        return new PgEventTriggerDdlCommands(DSL.name(getName()), null, new Field[] { 
        });
    }
}
