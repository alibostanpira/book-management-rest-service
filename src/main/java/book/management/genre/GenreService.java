package book.management.genre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;


    public List<Genre> getAllGenres() {
        List<Genre> genres = new ArrayList<>();
        genreRepository.findAll().forEach(genres::add);
        return genres;
    }

    public Genre getGenre(String name) {
//        return genres.stream().filter(genre -> genre.getName().equals(name)).findFirst().get();
        return genreRepository.findById(name).orElse(null);
    }

    public void addGenre(Genre genre) {
        genreRepository.save(genre);
    }

    public void updateGenre(Genre genre, String name) {
//        genres.set(genres.indexOf(genres.stream().filter(g -> g.getName().equals(name)).findFirst().get()), genre);
        genreRepository.save(genre);
    }

    public void deleteGenre(String name) {
        //genres.removeIf(genre -> genre.getName().equals(name));
        genreRepository.deleteById(name);

    }
}
