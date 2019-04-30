package ru.adkazankov.service;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.adkazankov.dto.FilmDto;
import ru.adkazankov.jooq_crud.db.tables.records.FilmRecord;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import static ru.adkazankov.jooq_crud.db.tables.Author.AUTHOR;
import static ru.adkazankov.jooq_crud.db.tables.Film.FILM;


@Service
public class JooqFilmService implements FilmService {

    @Autowired
    private DSLContext jooq;

    @Autowired
    private AuthorService authorService;

    @Override
    public List<FilmDto> getAll() {
        return jooq.select().from(FILM).fetch().map(record -> FilmDto.builder()
                .id(record.getValue(FILM.ID))
                .name(record.getValue(FILM.NAME))
                .releaseDate(record.getValue(FILM.RELEASE_DATE).toLocalDate())
                .author(authorService.getById(record.getValue(FILM.AUTHOR_ID)).getName())
                .build());
    }

    @Override
    public void save(FilmDto filmDto) {
        System.out.println(filmDto);
        if(filmDto.getId()==null) {
            jooq.insertInto(FILM, FILM.NAME, FILM.AUTHOR_ID, FILM.RELEASE_DATE).values(
                    filmDto.getName(),
                    authorService.getByName(filmDto.getAuthor()).getId(),
                    Date.valueOf(filmDto.getReleaseDate())
            ).returning(FILM.ID).fetch();
        }else {
            jooq.update(FILM)
                    .set(FILM.NAME, filmDto.getName())
                    .set(FILM.AUTHOR_ID, authorService.getByName(filmDto.getAuthor()).getId())
                    .set(FILM.RELEASE_DATE, Date.valueOf(filmDto.getReleaseDate()))
                    .where(FILM.ID.equal(filmDto.getId()))
                    .execute();
        }
    }

    @Override
    public FilmDto getById(Integer id) {
        Record record = jooq.select().from(FILM).where(FILM.ID.equal(id)).fetchSingle();
        return FilmDto.builder()
                .name(record.getValue(FILM.NAME))
                .author(authorService.getById(record.getValue(FILM.AUTHOR_ID)).getName())
                .releaseDate(record.getValue(FILM.RELEASE_DATE).toLocalDate())
                .id(record.getValue(FILM.ID))
                .build();
    }

    @Override
    public void deleteById(Integer id) {
        jooq.deleteFrom(FILM).where(FILM.ID.equal(id)).execute();
    }
}
