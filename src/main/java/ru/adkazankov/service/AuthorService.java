package ru.adkazankov.service;

import ru.adkazankov.dto.AuthorDto;

import java.util.List;

public interface AuthorService {

    AuthorDto getById(Integer id);

    List<AuthorDto> getAll();

    void save(AuthorDto author);

    AuthorDto getByName(String author);

    void deleteById(Integer id);
}
