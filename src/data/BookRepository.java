package data;

import domain.Book;

import java.util.ArrayList;
import java.util.List;

public interface BookRepository {

    public void addBook(Book book);

    public void removeBook(Book book);

    public List<Book> getAllBooks();
}
