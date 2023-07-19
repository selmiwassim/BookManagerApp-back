package com.wassim.BookStore.service;

import com.wassim.BookStore.exception.UserNotFoundException;
import com.wassim.BookStore.model.Book;
import com.wassim.BookStore.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class BookService {
    private final BookRepo bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public Book addBook(Book book){
        book.setBookCode(UUID.randomUUID().toString());
        return bookRepo.save(book);
    }

    public List<Book> findAllBooks(){
        return bookRepo.findAll();
    }

    public Book updateBook(Book book){
        return bookRepo.save(book);
    }

    public Book findBookById(Long id){
        return bookRepo.findBookById(id).orElseThrow(() -> new UserNotFoundException("User by id" + id + " was not found"));
    }


    @Transactional
    public void deleteBook(Long id ){
        bookRepo.deleteBookById(id);
    }

}
