package book.management.genre;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GenreController {

    @Autowired
    private GenreService genreService;

    @RequestMapping("/genres")
    public List<Genre> getAllGenres() {
        return genreService.getAllGenres();
    }


    @RequestMapping("/genres/{name}")
    public Genre getGenre(@PathVariable String name) {
        return genreService.getGenre(name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/genres")
    public void addGenre(@RequestBody Genre genre) {
        genreService.addGenre(genre);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/genres/{name}")
    public void updateGenre(@RequestBody Genre genre, @PathVariable String name) {
        genreService.updateGenre(genre, name);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/genres/{name}")
    public void deleteGenre(@PathVariable String name) {
        genreService.deleteGenre(name);
    }
}