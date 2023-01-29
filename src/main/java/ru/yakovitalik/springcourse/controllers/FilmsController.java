package ru.yakovitalik.springcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.yakovitalik.springcourse.dao.FilmDAO;
import ru.yakovitalik.springcourse.models.Film;

import javax.validation.Valid;

@Controller
@RequestMapping("/films")
public class FilmsController {

    private final FilmDAO filmDAO;

    @Autowired
    public FilmsController(FilmDAO filmDAO) {
        this.filmDAO = filmDAO;
    }

    @GetMapping()
    public String index(Model model) {
        // Получим все фильмы из DAO и передадим на отображение в представление
        model.addAttribute("films", filmDAO.index());
        return "films/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        // Получим один фильм по ID из DAO и передадим на отображение в представление
        model.addAttribute("film", filmDAO.show(id));
        return "films/show";
    }
}

