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
import ru.adkazankov.jooq_crud.db.pg_catalog.tables.records.JsonArrayElementsRecord;


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
public class JsonArrayElements extends TableImpl<JsonArrayElementsRecord> {

    private static final long serialVersionUID = 252835329;

    /**
     * The reference instance of <code>pg_catalog.json_array_elements</code>
     */
    public static final JsonArrayElements JSON_ARRAY_ELEMENTS = new JsonArrayElements();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonArrayElementsRecord> getRecordType() {
        return JsonArrayElementsRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JsonArrayElementsRecord, Object> VALUE = createField("value", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * Create a <code>pg_catalog.json_array_elements</code> table reference
     */
    public JsonArrayElements() {
        this(DSL.name("json_array_elements"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.json_array_elements</code> table reference
     */
    public JsonArrayElements(String alias) {
        this(DSL.name(alias), JSON_ARRAY_ELEMENTS);
    }

    /**
     * Create an aliased <code>pg_catalog.json_array_elements</code> table reference
     */
    public JsonArrayElements(Name alias) {
        this(alias, JSON_ARRAY_ELEMENTS);
    }

    private JsonArrayElements(Name alias, Table<JsonArrayElementsRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private JsonArrayElements(Name alias, Table<JsonArrayElementsRecord> aliased, Field<?>[] parameters) {
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
    public JsonArrayElements as(String alias) {
        return new JsonArrayElements(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonArrayElements as(Name alias) {
        return new JsonArrayElements(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonArrayElements rename(String name) {
        return new JsonArrayElements(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonArrayElements rename(Name name) {
        return new JsonArrayElements(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public JsonArrayElements call(Object fromJson) {
        return new JsonArrayElements(DSL.name(getName()), null, new Field[] { 
              DSL.val(fromJson, org.jooq.impl.SQLDataType.OTHER)
        });
    }

    /**
     * Call this table-valued function
     */
    public JsonArrayElements call(Field<Object> fromJson) {
        return new JsonArrayElements(DSL.name(getName()), null, new Field[] { 
              fromJson
        });
    }
}
