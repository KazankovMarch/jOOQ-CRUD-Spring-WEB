/*
 * This file is generated by jOOQ.
*/
package ru.adkazankov.jooq_crud.db.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.adkazankov.jooq_crud.db.tables.Film;


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
public class FilmRecord extends UpdatableRecordImpl<FilmRecord> implements Record4<Integer, String, Date, Integer> {

    private static final long serialVersionUID = -944285571;

    /**
     * Setter for <code>public.film.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.film.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.film.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.film.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.film.release_date</code>.
     */
    public void setReleaseDate(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.film.release_date</code>.
     */
    public Date getReleaseDate() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>public.film.author_id</code>.
     */
    public void setAuthorId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.film.author_id</code>.
     */
    public Integer getAuthorId() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Date, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Date, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Film.FILM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Film.FILM.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field3() {
        return Film.FILM.RELEASE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Film.FILM.AUTHOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component3() {
        return getReleaseDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getAuthorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value3() {
        return getReleaseDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAuthorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value3(Date value) {
        setReleaseDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value4(Integer value) {
        setAuthorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord values(Integer value1, String value2, Date value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmRecord
     */
    public FilmRecord() {
        super(Film.FILM);
    }

    /**
     * Create a detached, initialised FilmRecord
     */
    public FilmRecord(Integer id, String name, Date releaseDate, Integer authorId) {
        super(Film.FILM);

        set(0, id);
        set(1, name);
        set(2, releaseDate);
        set(3, authorId);
    }
}
