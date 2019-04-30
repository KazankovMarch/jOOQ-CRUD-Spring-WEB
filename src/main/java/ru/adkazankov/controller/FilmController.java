package ru.adkazankov.controller;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import ru.adkazankov.dto.FilmDto;
import ru.adkazankov.service.AuthorService;
import ru.adkazankov.service.FilmService;

@Controller
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @Autowired
    private AuthorService authorService;

    @GetMapping("/all")
    public String getAll(Model model){
        model.addAttribute("films", filmService.getAll());
        return "films";
    }

    @GetMapping
    public String create(Model model){
        model.addAttribute("authors", authorService.getAll());
        return "add_film";
    }

    @GetMapping("/{id}")
    public String put(@PathVariable Integer id, Model model){
        model.addAttribute("authors", authorService.getAll());
        model.addAttribute("film", filmService.getById(id));
        return "add_film";
    }

    @PostMapping
    public String save(@ModelAttribute(name = "film") FilmDto filmDto){
        filmService.save(filmDto);
        return "redirect:/film/all";
    }

    @PostMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id){
        filmService.deleteById(id);
        return "redirect:/film/all";
    }

}
