package book.management.book;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, String> {

    List<Book> findByGenreName(String genreName);

}
