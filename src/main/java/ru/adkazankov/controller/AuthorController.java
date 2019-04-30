package ru.adkazankov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.adkazankov.dto.AuthorDto;
import ru.adkazankov.dto.FilmDto;
import ru.adkazankov.service.AuthorService;

@Controller
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("all")
    public String getAll(Model model){
        model.addAttribute("authors", authorService.getAll());
        return "authors";
    }

    @GetMapping
    public String create(Model model){
        return "add_author";
    }

    @GetMapping("/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("author", authorService.getById(id));
        return "add_author";
    }

    @PostMapping
    public String save(@ModelAttribute AuthorDto authorDto){
        authorService.save(authorDto);
        return "redirect:/author/all";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        authorService.deleteById(id);
        return "redirect:/author/all";
    }

}
