package com.walshe.mcp_server_sse_mvc_spring_boot.service;

import com.walshe.mcp_server_sse_mvc_spring_boot.model.Book;
import jakarta.annotation.PostConstruct;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private final List<Book> books = new ArrayList<>();


    @Tool(
        name = "get_all_books",
        description = "Get a list of all books in the library for all authors"
    )
    public List<Book> getAllBooks() {
        return books;
    }

    @Tool(
        name = "get_books_by_author",
        description = "Get a list of books by a specific author"
    )
    public List<Book> getBooksByAuthor(String author) {
        return books.stream()
            .filter(book -> book.author().equalsIgnoreCase(author))
            .toList();
    }

    @PostConstruct
    public void init() {
        books.add(new Book(1L, "The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 1925));
        books.add(new Book(2L, "To Kill a Mockingbird", "Harper Lee", "9780061120084", 1960));
        books.add(new Book(3L, "1984", "George Orwell", "9780451524935", 1949));
        books.add(new Book(4L, "Pride and Prejudice", "Jane Austen", "9781503290563", 1813));
        books.add(new Book(5L, "The Catcher in the Rye", "J.D. Salinger", "9780316769488", 1951));
    }

}
