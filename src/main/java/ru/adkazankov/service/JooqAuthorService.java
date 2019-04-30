package ru.adkazankov.service;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SelectConditionStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.adkazankov.dto.AuthorDto;
import ru.adkazankov.dto.FilmDto;
import ru.adkazankov.jooq_crud.db.tables.records.AuthorRecord;

import java.util.List;

import static ru.adkazankov.jooq_crud.db.tables.Author.AUTHOR;


@Service
public class JooqAuthorService implements AuthorService {

    @Autowired
    private DSLContext jooq;

    @Override
    public AuthorDto getById(Integer id) {
        Record authorRecord = jooq.select().from(AUTHOR).where(AUTHOR.ID.equal(id)).fetchSingle();
        return AuthorDto.builder()
                .id(authorRecord.getValue(AUTHOR.ID))
                .name(authorRecord.getValue(AUTHOR.NAME))
                .build();
    }

    @Override
    public List<AuthorDto> getAll() {
        Result<Record> fetch = jooq.select().from(AUTHOR).fetch();
        return fetch.map(record -> AuthorDto.builder()
                .id(record.getValue(AUTHOR.ID))
                .name(record.getValue(AUTHOR.NAME))
                .build());
    }

    @Override
    public void save(AuthorDto author) {
        if(author.getId()==null){
            jooq.insertInto(AUTHOR, AUTHOR.NAME).values(
                    author.getName()
            ).returning(AUTHOR.ID).execute();
        }
        else {
            jooq.update(AUTHOR)
                    .set(AUTHOR.NAME, author.getName())
                    .where(AUTHOR.ID.equal(author.getId()))
                    .execute();
        }
    }

    @Override
    public AuthorDto getByName(String author) {
        Record record = jooq.select().from(AUTHOR).where(AUTHOR.NAME.equal(author)).fetchSingle();
        return AuthorDto.builder()
                .id(record.getValue(AUTHOR.ID))
                .name(record.getValue(AUTHOR.NAME))
                .build();
    }

    @Override
    public void deleteById(Integer id) {
        jooq.deleteFrom(AUTHOR).where(AUTHOR.ID.equal(id)).execute();
    }
}
