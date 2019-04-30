package ru.adkazankov.service;

import ru.adkazankov.dto.FilmDto;

import java.util.List;

public interface FilmService {

    List<FilmDto> getAll();

    void save(FilmDto filmDto);

    FilmDto getById(Integer id);

    void deleteById(Integer id);
}
