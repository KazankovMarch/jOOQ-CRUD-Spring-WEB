/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db;


import javax.annotation.Generated;

import ru.adkazankov.jooq_crud.db.tables.Author;
import ru.adkazankov.jooq_crud.db.tables.Film;


/**
 * Convenience access to all tables in public
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
     * The table <code>public.author</code>.
     */
    public static final Author AUTHOR = ru.adkazankov.jooq_crud.db.tables.Author.AUTHOR;

    /**
     * The table <code>public.film</code>.
     */
    public static final Film FILM = ru.adkazankov.jooq_crud.db.tables.Film.FILM;
}