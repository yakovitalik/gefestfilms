package ru.yakovitalik.springcourse.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Film {
    // в поля добавлены валидация форм в соответствии с ячейками базы данных
    private int id;             // id фильма, генерируется в БД

    @NotEmpty(message = "Название фильма не может быть пустым!")
    @Size(min = 1, max = 150, message = "Название фильма должно быть от 1 до 150 символов!")
    private String title;       // название фильма

    @NotEmpty(message = "Жанр не может быть пустым!")
    @Size(min = 1, max = 40, message = "Жанр должен быть от 1 до 40 символов!")
    private String genre;       // жанр

    @NotEmpty(message = "Страна не может быть пустой!")
    @Size(min = 1, max = 70, message = "Страна должна быть от 1 до 70 символов!")
    private String country;     // страна

    @Min(value = 1900, message = "Фильм не может быть раньше 1900 года!")
    private int year;           // год выхода фильма

    @NotEmpty(message = "Фильм не может быть без режиссера!")
    @Size(min = 1, max = 40, message = "Имя режиссера должно быть от 1 до 40 символов!")
    private String director;    // режиссер

    @NotEmpty(message = "Фильм не может быть без актеров!")
    @Size(min = 1, max = 600, message = "Список актеров должен быть от 1 до 600 символов!")
    private String actors;    // актеры

    @NotEmpty(message = "Длительность фильма должна быть указана!")
    @Size(min = 1, max = 20, message = "Длительность фильма должна быть от 1 до 20 символов!")
    private String duration;    // длительность фильма (1ч 23мин)

    @NotEmpty(message = "Фильм должен иметь описание сюжета!")
    private String description; // описание фильма (текст, о чем фильм)

    @NotEmpty(message = "У фильма должна быть обложка. Укажите путь к ней!")
    private String cover;   // путь к изображению-обложке фильма

    @NotEmpty(message = "Фильм должен быть добавлен. Укажите путь к файлу с фильмом!")
    private String file;    // путь к самому видео с фильмом для воспроизведения

    // конструктор по умолчанию для создания бина спрингом
    public Film() {  }

    // конструктор с параметрами
    public Film(int id, String title, String genre, String country,
                int year, String director, String actors, String duration, String description,
                String cover, String file) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.country = country;
        this.year = year;
        this.director = director;
        this.actors = actors;
        this.duration = duration;
        this.description = description;
        this.cover = cover;
        this.file = file;
    }

    // гетеры и сеттеры для полей
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
