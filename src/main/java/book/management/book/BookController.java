package book.management.book;


import book.management.genre.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;


    @RequestMapping("/genres/{genreName}/books")
    public List<Book> getAllBooks(@PathVariable String genreName) {
        return bookService.getAllBooks(genreName);
    }

    @RequestMapping("/genres/{genreName}/books/{bookName}")
    public Book getBook(@PathVariable String bookName) {
        return bookService.getBook(bookName);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/genres/{genreName}/books")
    public void addBook(@RequestBody Book book, @PathVariable String genreName) {
        book.setGenre(new Genre(genreName, ""));
        bookService.addBook(book);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/genres/{genreName}/books/{bookName}")
    public void updateBook(@RequestBody Book book, @PathVariable String bookName, @PathVariable String genreName) {
        book.setGenre(new Genre(genreName, ""));
        bookService.updateBook(book);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/genres/{genreName}/books/{bookName}")
    public void deleteBook(@PathVariable String bookName) {
        bookService.deleteBook(bookName);
    }
}
