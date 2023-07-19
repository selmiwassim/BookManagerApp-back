package com.wassim.BookStore.repo;

import com.wassim.BookStore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface BookRepo extends JpaRepository<Book, Long> {


    void deleteBookById(Long id);

    Optional<Book> findBookById(Long id);
}
