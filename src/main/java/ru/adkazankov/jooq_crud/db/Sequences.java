/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.author_id_seq</code>
     */
    public static final Sequence<Integer> AUTHOR_ID_SEQ = new SequenceImpl<Integer>("author_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.film_id_seq</code>
     */
    public static final Sequence<Integer> FILM_ID_SEQ = new SequenceImpl<Integer>("film_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));
}
