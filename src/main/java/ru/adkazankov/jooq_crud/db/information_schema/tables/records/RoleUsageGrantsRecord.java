/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.information_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;

import ru.adkazankov.jooq_crud.db.information_schema.tables.RoleUsageGrants;


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
public class RoleUsageGrantsRecord extends TableRecordImpl<RoleUsageGrantsRecord> implements Record8<String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1475800600;

    /**
     * Setter for <code>information_schema.role_usage_grants.grantor</code>.
     */
    public void setGrantor(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.role_usage_grants.grantor</code>.
     */
    public String getGrantor() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.role_usage_grants.grantee</code>.
     */
    public void setGrantee(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.role_usage_grants.grantee</code>.
     */
    public String getGrantee() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.role_usage_grants.object_catalog</code>.
     */
    public void setObjectCatalog(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.role_usage_grants.object_catalog</code>.
     */
    public String getObjectCatalog() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.role_usage_grants.object_schema</code>.
     */
    public void setObjectSchema(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.role_usage_grants.object_schema</code>.
     */
    public String getObjectSchema() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.role_usage_grants.object_name</code>.
     */
    public void setObjectName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.role_usage_grants.object_name</code>.
     */
    public String getObjectName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.role_usage_grants.object_type</code>.
     */
    public void setObjectType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.role_usage_grants.object_type</code>.
     */
    public String getObjectType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.role_usage_grants.privilege_type</code>.
     */
    public void setPrivilegeType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.role_usage_grants.privilege_type</code>.
     */
    public String getPrivilegeType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.role_usage_grants.is_grantable</code>.
     */
    public void setIsGrantable(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.role_usage_grants.is_grantable</code>.
     */
    public String getIsGrantable() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return RoleUsageGrants.ROLE_USAGE_GRANTS.GRANTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RoleUsageGrants.ROLE_USAGE_GRANTS.GRANTEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return RoleUsageGrants.ROLE_USAGE_GRANTS.OBJECT_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return RoleUsageGrants.ROLE_USAGE_GRANTS.OBJECT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return RoleUsageGrants.ROLE_USAGE_GRANTS.OBJECT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return RoleUsageGrants.ROLE_USAGE_GRANTS.OBJECT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return RoleUsageGrants.ROLE_USAGE_GRANTS.PRIVILEGE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return RoleUsageGrants.ROLE_USAGE_GRANTS.IS_GRANTABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getGrantor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGrantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getObjectCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getObjectSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getObjectName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getObjectType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPrivilegeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getIsGrantable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGrantor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGrantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getObjectCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getObjectSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getObjectName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getObjectType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPrivilegeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getIsGrantable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleUsageGrantsRecord value1(String value) {
        setGrantor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleUsageGrantsRecord value2(String value) {
        setGrantee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleUsageGrantsRecord value3(String value) {
        setObjectCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleUsageGrantsRecord value4(String value) {
        setObjectSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleUsageGrantsRecord value5(String value) {
        setObjectName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleUsageGrantsRecord value6(String value) {
        setObjectType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleUsageGrantsRecord value7(String value) {
        setPrivilegeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleUsageGrantsRecord value8(String value) {
        setIsGrantable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleUsageGrantsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoleUsageGrantsRecord
     */
    public RoleUsageGrantsRecord() {
        super(RoleUsageGrants.ROLE_USAGE_GRANTS);
    }

    /**
     * Create a detached, initialised RoleUsageGrantsRecord
     */
    public RoleUsageGrantsRecord(String grantor, String grantee, String objectCatalog, String objectSchema, String objectName, String objectType, String privilegeType, String isGrantable) {
        super(RoleUsageGrants.ROLE_USAGE_GRANTS);

        set(0, grantor);
        set(1, grantee);
        set(2, objectCatalog);
        set(3, objectSchema);
        set(4, objectName);
        set(5, objectType);
        set(6, privilegeType);
        set(7, isGrantable);
    }
}
