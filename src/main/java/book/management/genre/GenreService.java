package book.management.genre;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GenreService {

    List<Genre> genres = new ArrayList<>(Arrays.asList(
            new Genre("Fiction", "Something invented by the imagination"),
            new Genre("Fantasy", "Fiction with strange or other worldly settings or characters"),
            new Genre("Horror", "Fiction in which events evoke a feeling of dread"),
            new Genre("Fiction full of fun", "Fiction full of fun"),
            new Genre("Poetry", "Verse and rhythmic writing with imagery that creates emotional responses")
    ));

    public List<Genre> getAllGenres() {
        return genres;
    }

    public Genre getGenre(String name) {
        return genres.stream().filter(genre -> genre.getName().equals(name)).findFirst().get();
    }

    public void addGenre(Genre genre) {
        genres.add(genre);
    }

    public void updateGenre(Genre genre, String name) {
        genres.set(genres.indexOf(genres.stream().filter(g -> g.getName().equals(name)).findFirst().get()), genre);
    }

    public void deleteGenre(String name) {
        genres.removeIf(genre -> genre.getName().equals(name));
    }
}
