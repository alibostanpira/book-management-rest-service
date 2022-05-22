package book.management.book;


import book.management.genre.Genre;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {

    @Id
    private String name;
    private String author;
    private String description;


    @ManyToOne
    private Genre genre;

    public Book() {
    }

    public Book(String name, String author, String description, String genreName) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.genre = new Genre(genreName, "");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
