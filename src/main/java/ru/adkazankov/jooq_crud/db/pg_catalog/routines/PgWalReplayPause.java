/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.pg_catalog.routines;


import javax.annotation.Generated;

import org.jooq.impl.AbstractRoutine;

import ru.adkazankov.jooq_crud.db.pg_catalog.PgCatalog;


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
public class PgWalReplayPause extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -997566437;

    /**
     * Create a new routine call instance
     */
    public PgWalReplayPause() {
        super("pg_wal_replay_pause", PgCatalog.PG_CATALOG);
    }
}
