package presentation;

import data.BookRepository;
import data.InMemoryBookRepository;
import domain.Book;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookRepository books = new InMemoryBookRepository();
        Book three_comrades = new Book("1", "Three Comrades","Erich Maria Remarque", 4);
        Book ruslanAndLudmila = new Book("2", "Ruslan and Ludmila","Alexander Sergeevich Pushkin", 6 );
        books.addBook(three_comrades);
        books.addBook(ruslanAndLudmila);
        List<Book> allBooks = books.getAllBooks();
        for (Book book : allBooks) {
            System.out.println("Книга: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", Цена: $" + book.getPrice());
        }
    }
}