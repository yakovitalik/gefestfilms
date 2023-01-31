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
@RequestMapping("/admin")
public class AdminController {

    private final FilmDAO filmDAO;


    @Autowired
    public AdminController(FilmDAO filmDAO) {

        this.filmDAO = filmDAO;
    }

    @GetMapping()
    public String index(Model model) {
        // Получим все фильмы из DAO и передадим на отображение в представление
        model.addAttribute("films", filmDAO.index());
        return "admin/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        // Получим один фильм по ID из DAO и передадим на отображение в представление
        model.addAttribute("film", filmDAO.show(id));
        return "admin/show";
    }

    @GetMapping("/new")
    public String newFilm(@ModelAttribute("film") Film film) {
        return "admin/new";
    }

    @PostMapping
    public String create(@ModelAttribute("film") @Valid Film film,
                         BindingResult bindingResult) {
        if(bindingResult.hasErrors())
            return "admin/new";
        filmDAO.save(film);
        return "redirect:/admin";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("film", filmDAO.show(id));
        return "admin/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("film") @Valid Film film,
                         BindingResult bindingResult, @PathVariable("id") int id) {
        if(bindingResult.hasErrors())
            return "admin/edit";
        filmDAO.update(id, film);
        return "redirect:/admin";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        filmDAO.delete(id);
        return "redirect:/admin";
    }
}

