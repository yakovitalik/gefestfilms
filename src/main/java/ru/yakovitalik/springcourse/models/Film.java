package ru.yakovitalik.springcourse.models;

public class Film {
    private int id;             // id фильма, генерируется в БД
    private String title;       // название фильма
    private String genre;       // жанр
    private String country;     // страна
    private int year;           // год выхода фильма
    private String director;    // режиссер
    private String duration;    // длительность фильма (1ч 23мин)
    private String description; // описание фильма (текст, о чем фильм)
    private String coverPath;   // путь к изображению-обложке фильма
    private String filePath;    // путь к самому видео с фильмом для воспроизведения

    public Film() {

    }

    public Film(int id, String title, String genre, String country,
                int year, String director, String duration, String description,
                String coverPath, String filePath) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.country = country;
        this.year = year;
        this.director = director;
        this.duration = duration;
        this.description = description;
        this.coverPath = coverPath;
        this.filePath = filePath;
    }

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

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverRuth(String coverPath) {
        this.coverPath = coverPath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
