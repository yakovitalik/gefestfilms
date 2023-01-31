package ru.yakovitalik.springcourse.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.yakovitalik.springcourse.models.Film;
import java.util.List;

@Component
public class FilmDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public FilmDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Film> index() {
        return jdbcTemplate.query("SELECT * FROM film", new BeanPropertyRowMapper<>(Film.class));
    }

    public Film show(int id) {
        return jdbcTemplate.query("SELECT * FROM film WHERE id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(Film.class)).stream().findAny().orElse(null);
        // вместо null в реальном приложении orElse как правило возвращает объект с текстом ошибки
    }

    public void save(Film film) {
        jdbcTemplate.update("INSERT INTO film(title, genre, country, year, director, duration, description, cover, file)" +
                        " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", film.getTitle(), film.getGenre(), film.getCountry(), film.getYear(),
                film.getDirector(), film.getDuration(), film.getDescription(), film.getCover(), film.getFile());
    }

    public void update(int id, Film updateFilm) {
        jdbcTemplate.update("UPDATE film SET title=?, genre=?, country=?, year=?, director=?, duration=?," +
                        " description=?, cover=?, file=? WHERE id=?", updateFilm.getTitle(),
                updateFilm.getGenre(), updateFilm.getCountry(), updateFilm.getYear(), updateFilm.getDirector(),
                updateFilm.getDuration(), updateFilm.getDescription(), updateFilm.getCover(), updateFilm.getFile(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM film WHERE id=?", id);
    }

}