/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.information_schema;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.impl.DSL;

import ru.adkazankov.jooq_crud.db.information_schema.tables.AdministrableRoleAuthorizations;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ApplicableRoles;
import ru.adkazankov.jooq_crud.db.information_schema.tables.Attributes;
import ru.adkazankov.jooq_crud.db.information_schema.tables.CharacterSets;
import ru.adkazankov.jooq_crud.db.information_schema.tables.CheckConstraintRoutineUsage;
import ru.adkazankov.jooq_crud.db.information_schema.tables.CheckConstraints;
import ru.adkazankov.jooq_crud.db.information_schema.tables.CollationCharacterSetApplicability;
import ru.adkazankov.jooq_crud.db.information_schema.tables.Collations;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ColumnDomainUsage;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ColumnOptions;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ColumnPrivileges;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ColumnUdtUsage;
import ru.adkazankov.jooq_crud.db.information_schema.tables.Columns;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ConstraintColumnUsage;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ConstraintTableUsage;
import ru.adkazankov.jooq_crud.db.information_schema.tables.DataTypePrivileges;
import ru.adkazankov.jooq_crud.db.information_schema.tables.DomainConstraints;
import ru.adkazankov.jooq_crud.db.information_schema.tables.DomainUdtUsage;
import ru.adkazankov.jooq_crud.db.information_schema.tables.Domains;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ElementTypes;
import ru.adkazankov.jooq_crud.db.information_schema.tables.EnabledRoles;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ForeignDataWrapperOptions;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ForeignDataWrappers;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ForeignServerOptions;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ForeignServers;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ForeignTableOptions;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ForeignTables;
import ru.adkazankov.jooq_crud.db.information_schema.tables.InformationSchemaCatalogName;
import ru.adkazankov.jooq_crud.db.information_schema.tables.KeyColumnUsage;
import ru.adkazankov.jooq_crud.db.information_schema.tables.Parameters;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ReferentialConstraints;
import ru.adkazankov.jooq_crud.db.information_schema.tables.RoleColumnGrants;
import ru.adkazankov.jooq_crud.db.information_schema.tables.RoleRoutineGrants;
import ru.adkazankov.jooq_crud.db.information_schema.tables.RoleTableGrants;
import ru.adkazankov.jooq_crud.db.information_schema.tables.RoleUdtGrants;
import ru.adkazankov.jooq_crud.db.information_schema.tables.RoleUsageGrants;
import ru.adkazankov.jooq_crud.db.information_schema.tables.RoutinePrivileges;
import ru.adkazankov.jooq_crud.db.information_schema.tables.Routines;
import ru.adkazankov.jooq_crud.db.information_schema.tables.Schemata;
import ru.adkazankov.jooq_crud.db.information_schema.tables.Sequences;
import ru.adkazankov.jooq_crud.db.information_schema.tables.SqlFeatures;
import ru.adkazankov.jooq_crud.db.information_schema.tables.SqlImplementationInfo;
import ru.adkazankov.jooq_crud.db.information_schema.tables.SqlLanguages;
import ru.adkazankov.jooq_crud.db.information_schema.tables.SqlPackages;
import ru.adkazankov.jooq_crud.db.information_schema.tables.SqlParts;
import ru.adkazankov.jooq_crud.db.information_schema.tables.SqlSizing;
import ru.adkazankov.jooq_crud.db.information_schema.tables.SqlSizingProfiles;
import ru.adkazankov.jooq_crud.db.information_schema.tables.TableConstraints;
import ru.adkazankov.jooq_crud.db.information_schema.tables.TablePrivileges;
import ru.adkazankov.jooq_crud.db.information_schema.tables.Transforms;
import ru.adkazankov.jooq_crud.db.information_schema.tables.TriggeredUpdateColumns;
import ru.adkazankov.jooq_crud.db.information_schema.tables.Triggers;
import ru.adkazankov.jooq_crud.db.information_schema.tables.UdtPrivileges;
import ru.adkazankov.jooq_crud.db.information_schema.tables.UsagePrivileges;
import ru.adkazankov.jooq_crud.db.information_schema.tables.UserDefinedTypes;
import ru.adkazankov.jooq_crud.db.information_schema.tables.UserMappingOptions;
import ru.adkazankov.jooq_crud.db.information_schema.tables.UserMappings;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ViewColumnUsage;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ViewRoutineUsage;
import ru.adkazankov.jooq_crud.db.information_schema.tables.ViewTableUsage;
import ru.adkazankov.jooq_crud.db.information_schema.tables.Views;
import ru.adkazankov.jooq_crud.db.information_schema.tables._PgExpandarray;
import ru.adkazankov.jooq_crud.db.information_schema.tables._PgForeignDataWrappers;
import ru.adkazankov.jooq_crud.db.information_schema.tables._PgForeignServers;
import ru.adkazankov.jooq_crud.db.information_schema.tables._PgForeignTableColumns;
import ru.adkazankov.jooq_crud.db.information_schema.tables._PgForeignTables;
import ru.adkazankov.jooq_crud.db.information_schema.tables._PgUserMappings;
import ru.adkazankov.jooq_crud.db.information_schema.tables.records._PgExpandarrayRecord;


/**
 * Convenience access to all tables in information_schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>information_schema._pg_expandarray</code>.
     */
    public static final _PgExpandarray _PG_EXPANDARRAY = ru.adkazankov.jooq_crud.db.information_schema.tables._PgExpandarray._PG_EXPANDARRAY;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<_PgExpandarrayRecord> _PG_EXPANDARRAY(Configuration configuration, Object __1) {
        return DSL.using(configuration).selectFrom(ru.adkazankov.jooq_crud.db.information_schema.tables._PgExpandarray._PG_EXPANDARRAY.call(__1)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static _PgExpandarray _PG_EXPANDARRAY(Object __1) {
        return ru.adkazankov.jooq_crud.db.information_schema.tables._PgExpandarray._PG_EXPANDARRAY.call(__1);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static _PgExpandarray _PG_EXPANDARRAY(Field<Object> __1) {
        return ru.adkazankov.jooq_crud.db.information_schema.tables._PgExpandarray._PG_EXPANDARRAY.call(__1);
    }

    /**
     * The table <code>information_schema._pg_foreign_data_wrappers</code>.
     */
    public static final _PgForeignDataWrappers _PG_FOREIGN_DATA_WRAPPERS = ru.adkazankov.jooq_crud.db.information_schema.tables._PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS;

    /**
     * The table <code>information_schema._pg_foreign_servers</code>.
     */
    public static final _PgForeignServers _PG_FOREIGN_SERVERS = ru.adkazankov.jooq_crud.db.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS;

    /**
     * The table <code>information_schema._pg_foreign_table_columns</code>.
     */
    public static final _PgForeignTableColumns _PG_FOREIGN_TABLE_COLUMNS = ru.adkazankov.jooq_crud.db.information_schema.tables._PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS;

    /**
     * The table <code>information_schema._pg_foreign_tables</code>.
     */
    public static final _PgForeignTables _PG_FOREIGN_TABLES = ru.adkazankov.jooq_crud.db.information_schema.tables._PgForeignTables._PG_FOREIGN_TABLES;

    /**
     * The table <code>information_schema._pg_user_mappings</code>.
     */
    public static final _PgUserMappings _PG_USER_MAPPINGS = ru.adkazankov.jooq_crud.db.information_schema.tables._PgUserMappings._PG_USER_MAPPINGS;

    /**
     * The table <code>information_schema.administrable_role_authorizations</code>.
     */
    public static final AdministrableRoleAuthorizations ADMINISTRABLE_ROLE_AUTHORIZATIONS = ru.adkazankov.jooq_crud.db.information_schema.tables.AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS;

    /**
     * The table <code>information_schema.applicable_roles</code>.
     */
    public static final ApplicableRoles APPLICABLE_ROLES = ru.adkazankov.jooq_crud.db.information_schema.tables.ApplicableRoles.APPLICABLE_ROLES;

    /**
     * The table <code>information_schema.attributes</code>.
     */
    public static final Attributes ATTRIBUTES = ru.adkazankov.jooq_crud.db.information_schema.tables.Attributes.ATTRIBUTES;

    /**
     * The table <code>information_schema.character_sets</code>.
     */
    public static final CharacterSets CHARACTER_SETS = ru.adkazankov.jooq_crud.db.information_schema.tables.CharacterSets.CHARACTER_SETS;

    /**
     * The table <code>information_schema.check_constraint_routine_usage</code>.
     */
    public static final CheckConstraintRoutineUsage CHECK_CONSTRAINT_ROUTINE_USAGE = ru.adkazankov.jooq_crud.db.information_schema.tables.CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE;

    /**
     * The table <code>information_schema.check_constraints</code>.
     */
    public static final CheckConstraints CHECK_CONSTRAINTS = ru.adkazankov.jooq_crud.db.information_schema.tables.CheckConstraints.CHECK_CONSTRAINTS;

    /**
     * The table <code>information_schema.collation_character_set_applicability</code>.
     */
    public static final CollationCharacterSetApplicability COLLATION_CHARACTER_SET_APPLICABILITY = ru.adkazankov.jooq_crud.db.information_schema.tables.CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY;

    /**
     * The table <code>information_schema.collations</code>.
     */
    public static final Collations COLLATIONS = ru.adkazankov.jooq_crud.db.information_schema.tables.Collations.COLLATIONS;

    /**
     * The table <code>information_schema.column_domain_usage</code>.
     */
    public static final ColumnDomainUsage COLUMN_DOMAIN_USAGE = ru.adkazankov.jooq_crud.db.information_schema.tables.ColumnDomainUsage.COLUMN_DOMAIN_USAGE;

    /**
     * The table <code>information_schema.column_options</code>.
     */
    public static final ColumnOptions COLUMN_OPTIONS = ru.adkazankov.jooq_crud.db.information_schema.tables.ColumnOptions.COLUMN_OPTIONS;

    /**
     * The table <code>information_schema.column_privileges</code>.
     */
    public static final ColumnPrivileges COLUMN_PRIVILEGES = ru.adkazankov.jooq_crud.db.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES;

    /**
     * The table <code>information_schema.column_udt_usage</code>.
     */
    public static final ColumnUdtUsage COLUMN_UDT_USAGE = ru.adkazankov.jooq_crud.db.information_schema.tables.ColumnUdtUsage.COLUMN_UDT_USAGE;

    /**
     * The table <code>information_schema.columns</code>.
     */
    public static final Columns COLUMNS = ru.adkazankov.jooq_crud.db.information_schema.tables.Columns.COLUMNS;

    /**
     * The table <code>information_schema.constraint_column_usage</code>.
     */
    public static final ConstraintColumnUsage CONSTRAINT_COLUMN_USAGE = ru.adkazankov.jooq_crud.db.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE;

    /**
     * The table <code>information_schema.constraint_table_usage</code>.
     */
    public static final ConstraintTableUsage CONSTRAINT_TABLE_USAGE = ru.adkazankov.jooq_crud.db.information_schema.tables.ConstraintTableUsage.CONSTRAINT_TABLE_USAGE;

    /**
     * The table <code>information_schema.data_type_privileges</code>.
     */
    public static final DataTypePrivileges DATA_TYPE_PRIVILEGES = ru.adkazankov.jooq_crud.db.information_schema.tables.DataTypePrivileges.DATA_TYPE_PRIVILEGES;

    /**
     * The table <code>information_schema.domain_constraints</code>.
     */
    public static final DomainConstraints DOMAIN_CONSTRAINTS = ru.adkazankov.jooq_crud.db.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS;

    /**
     * The table <code>information_schema.domain_udt_usage</code>.
     */
    public static final DomainUdtUsage DOMAIN_UDT_USAGE = ru.adkazankov.jooq_crud.db.information_schema.tables.DomainUdtUsage.DOMAIN_UDT_USAGE;

    /**
     * The table <code>information_schema.domains</code>.
     */
    public static final Domains DOMAINS = ru.adkazankov.jooq_crud.db.information_schema.tables.Domains.DOMAINS;

    /**
     * The table <code>information_schema.element_types</code>.
     */
    public static final ElementTypes ELEMENT_TYPES = ru.adkazankov.jooq_crud.db.information_schema.tables.ElementTypes.ELEMENT_TYPES;

    /**
     * The table <code>information_schema.enabled_roles</code>.
     */
    public static final EnabledRoles ENABLED_ROLES = ru.adkazankov.jooq_crud.db.information_schema.tables.EnabledRoles.ENABLED_ROLES;

    /**
     * The table <code>information_schema.foreign_data_wrapper_options</code>.
     */
    public static final ForeignDataWrapperOptions FOREIGN_DATA_WRAPPER_OPTIONS = ru.adkazankov.jooq_crud.db.information_schema.tables.ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS;

    /**
     * The table <code>information_schema.foreign_data_wrappers</code>.
     */
    public static final ForeignDataWrappers FOREIGN_DATA_WRAPPERS = ru.adkazankov.jooq_crud.db.information_schema.tables.ForeignDataWrappers.FOREIGN_DATA_WRAPPERS;

    /**
     * The table <code>information_schema.foreign_server_options</code>.
     */
    public static final ForeignServerOptions FOREIGN_SERVER_OPTIONS = ru.adkazankov.jooq_crud.db.information_schema.tables.ForeignServerOptions.FOREIGN_SERVER_OPTIONS;

    /**
     * The table <code>information_schema.foreign_servers</code>.
     */
    public static final ForeignServers FOREIGN_SERVERS = ru.adkazankov.jooq_crud.db.information_schema.tables.ForeignServers.FOREIGN_SERVERS;

    /**
     * The table <code>information_schema.foreign_table_options</code>.
     */
    public static final ForeignTableOptions FOREIGN_TABLE_OPTIONS = ru.adkazankov.jooq_crud.db.information_schema.tables.ForeignTableOptions.FOREIGN_TABLE_OPTIONS;

    /**
     * The table <code>information_schema.foreign_tables</code>.
     */
    public static final ForeignTables FOREIGN_TABLES = ru.adkazankov.jooq_crud.db.information_schema.tables.ForeignTables.FOREIGN_TABLES;

    /**
     * The table <code>information_schema.information_schema_catalog_name</code>.
     */
    public static final InformationSchemaCatalogName INFORMATION_SCHEMA_CATALOG_NAME = ru.adkazankov.jooq_crud.db.information_schema.tables.InformationSchemaCatalogName.INFORMATION_SCHEMA_CATALOG_NAME;

    /**
     * The table <code>information_schema.key_column_usage</code>.
     */
    public static final KeyColumnUsage KEY_COLUMN_USAGE = ru.adkazankov.jooq_crud.db.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE;

    /**
     * The table <code>information_schema.parameters</code>.
     */
    public static final Parameters PARAMETERS = ru.adkazankov.jooq_crud.db.information_schema.tables.Parameters.PARAMETERS;

    /**
     * The table <code>information_schema.referential_constraints</code>.
     */
    public static final ReferentialConstraints REFERENTIAL_CONSTRAINTS = ru.adkazankov.jooq_crud.db.information_schema.tables.ReferentialConstraints.REFERENTIAL_CONSTRAINTS;

    /**
     * The table <code>information_schema.role_column_grants</code>.
     */
    public static final RoleColumnGrants ROLE_COLUMN_GRANTS = ru.adkazankov.jooq_crud.db.information_schema.tables.RoleColumnGrants.ROLE_COLUMN_GRANTS;

    /**
     * The table <code>information_schema.role_routine_grants</code>.
     */
    public static final RoleRoutineGrants ROLE_ROUTINE_GRANTS = ru.adkazankov.jooq_crud.db.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS;

    /**
     * The table <code>information_schema.role_table_grants</code>.
     */
    public static final RoleTableGrants ROLE_TABLE_GRANTS = ru.adkazankov.jooq_crud.db.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS;

    /**
     * The table <code>information_schema.role_udt_grants</code>.
     */
    public static final RoleUdtGrants ROLE_UDT_GRANTS = ru.adkazankov.jooq_crud.db.information_schema.tables.RoleUdtGrants.ROLE_UDT_GRANTS;

    /**
     * The table <code>information_schema.role_usage_grants</code>.
     */
    public static final RoleUsageGrants ROLE_USAGE_GRANTS = ru.adkazankov.jooq_crud.db.information_schema.tables.RoleUsageGrants.ROLE_USAGE_GRANTS;

    /**
     * The table <code>information_schema.routine_privileges</code>.
     */
    public static final RoutinePrivileges ROUTINE_PRIVILEGES = ru.adkazankov.jooq_crud.db.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES;

    /**
     * The table <code>information_schema.routines</code>.
     */
    public static final Routines ROUTINES = ru.adkazankov.jooq_crud.db.information_schema.tables.Routines.ROUTINES;

    /**
     * The table <code>information_schema.schemata</code>.
     */
    public static final Schemata SCHEMATA = ru.adkazankov.jooq_crud.db.information_schema.tables.Schemata.SCHEMATA;

    /**
     * The table <code>information_schema.sequences</code>.
     */
    public static final Sequences SEQUENCES = ru.adkazankov.jooq_crud.db.information_schema.tables.Sequences.SEQUENCES;

    /**
     * The table <code>information_schema.sql_features</code>.
     */
    public static final SqlFeatures SQL_FEATURES = ru.adkazankov.jooq_crud.db.information_schema.tables.SqlFeatures.SQL_FEATURES;

    /**
     * The table <code>information_schema.sql_implementation_info</code>.
     */
    public static final SqlImplementationInfo SQL_IMPLEMENTATION_INFO = ru.adkazankov.jooq_crud.db.information_schema.tables.SqlImplementationInfo.SQL_IMPLEMENTATION_INFO;

    /**
     * The table <code>information_schema.sql_languages</code>.
     */
    public static final SqlLanguages SQL_LANGUAGES = ru.adkazankov.jooq_crud.db.information_schema.tables.SqlLanguages.SQL_LANGUAGES;

    /**
     * The table <code>information_schema.sql_packages</code>.
     */
    public static final SqlPackages SQL_PACKAGES = ru.adkazankov.jooq_crud.db.information_schema.tables.SqlPackages.SQL_PACKAGES;

    /**
     * The table <code>information_schema.sql_parts</code>.
     */
    public static final SqlParts SQL_PARTS = ru.adkazankov.jooq_crud.db.information_schema.tables.SqlParts.SQL_PARTS;

    /**
     * The table <code>information_schema.sql_sizing</code>.
     */
    public static final SqlSizing SQL_SIZING = ru.adkazankov.jooq_crud.db.information_schema.tables.SqlSizing.SQL_SIZING;

    /**
     * The table <code>information_schema.sql_sizing_profiles</code>.
     */
    public static final SqlSizingProfiles SQL_SIZING_PROFILES = ru.adkazankov.jooq_crud.db.information_schema.tables.SqlSizingProfiles.SQL_SIZING_PROFILES;

    /**
     * The table <code>information_schema.table_constraints</code>.
     */
    public static final TableConstraints TABLE_CONSTRAINTS = ru.adkazankov.jooq_crud.db.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS;

    /**
     * The table <code>information_schema.table_privileges</code>.
     */
    public static final TablePrivileges TABLE_PRIVILEGES = ru.adkazankov.jooq_crud.db.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES;

    /**
     * The table <code>information_schema.tables</code>.
     */
    public static final ru.adkazankov.jooq_crud.db.information_schema.tables.Tables TABLES = ru.adkazankov.jooq_crud.db.information_schema.tables.Tables.TABLES;

    /**
     * The table <code>information_schema.transforms</code>.
     */
    public static final Transforms TRANSFORMS = ru.adkazankov.jooq_crud.db.information_schema.tables.Transforms.TRANSFORMS;

    /**
     * The table <code>information_schema.triggered_update_columns</code>.
     */
    public static final TriggeredUpdateColumns TRIGGERED_UPDATE_COLUMNS = ru.adkazankov.jooq_crud.db.information_schema.tables.TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS;

    /**
     * The table <code>information_schema.triggers</code>.
     */
    public static final Triggers TRIGGERS = ru.adkazankov.jooq_crud.db.information_schema.tables.Triggers.TRIGGERS;

    /**
     * The table <code>information_schema.udt_privileges</code>.
     */
    public static final UdtPrivileges UDT_PRIVILEGES = ru.adkazankov.jooq_crud.db.information_schema.tables.UdtPrivileges.UDT_PRIVILEGES;

    /**
     * The table <code>information_schema.usage_privileges</code>.
     */
    public static final UsagePrivileges USAGE_PRIVILEGES = ru.adkazankov.jooq_crud.db.information_schema.tables.UsagePrivileges.USAGE_PRIVILEGES;

    /**
     * The table <code>information_schema.user_defined_types</code>.
     */
    public static final UserDefinedTypes USER_DEFINED_TYPES = ru.adkazankov.jooq_crud.db.information_schema.tables.UserDefinedTypes.USER_DEFINED_TYPES;

    /**
     * The table <code>information_schema.user_mapping_options</code>.
     */
    public static final UserMappingOptions USER_MAPPING_OPTIONS = ru.adkazankov.jooq_crud.db.information_schema.tables.UserMappingOptions.USER_MAPPING_OPTIONS;

    /**
     * The table <code>information_schema.user_mappings</code>.
     */
    public static final UserMappings USER_MAPPINGS = ru.adkazankov.jooq_crud.db.information_schema.tables.UserMappings.USER_MAPPINGS;

    /**
     * The table <code>information_schema.view_column_usage</code>.
     */
    public static final ViewColumnUsage VIEW_COLUMN_USAGE = ru.adkazankov.jooq_crud.db.information_schema.tables.ViewColumnUsage.VIEW_COLUMN_USAGE;

    /**
     * The table <code>information_schema.view_routine_usage</code>.
     */
    public static final ViewRoutineUsage VIEW_ROUTINE_USAGE = ru.adkazankov.jooq_crud.db.information_schema.tables.ViewRoutineUsage.VIEW_ROUTINE_USAGE;

    /**
     * The table <code>information_schema.view_table_usage</code>.
     */
    public static final ViewTableUsage VIEW_TABLE_USAGE = ru.adkazankov.jooq_crud.db.information_schema.tables.ViewTableUsage.VIEW_TABLE_USAGE;

    /**
     * The table <code>information_schema.views</code>.
     */
    public static final Views VIEWS = ru.adkazankov.jooq_crud.db.information_schema.tables.Views.VIEWS;
}
