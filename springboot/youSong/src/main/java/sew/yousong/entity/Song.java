package sew.yousong.entity;

import jakarta.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "genre", nullable = false)
    private String genre;

    @Column(name = "releaseYear", nullable = false)
    private int releaseYear;

    @Column(name = "duration", nullable = false)
    private String duration;

    // Standardkonstruktor für JPA
    protected Song() {
    }

    // Konstruktor mit allen Feldern
    public Song(String title, String author, String duration, int releaseYear, String genre) {
        this.title = title;
        this.author = author;
        this.duration = duration;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getDuration() {
        return duration;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "song [id=" + id + ", title=" + title + ", author=" + author +
                ", genre=" + genre + ", release year=" + releaseYear + ", duration=" + duration + "]";
    }

}
