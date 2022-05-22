package book.management.book;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(String genreName) {
        List<Book> books = new ArrayList<>();
        bookRepository.findByGenreName(genreName).forEach(books::add);
        return books;
    }

    public Book getBook(String name) {
        return bookRepository.findById(name).orElse(null);
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void updateBook(Book book) {
        bookRepository.save(book);
    }

    public void deleteBook(String name) {
        bookRepository.deleteById(name);
    }
}
