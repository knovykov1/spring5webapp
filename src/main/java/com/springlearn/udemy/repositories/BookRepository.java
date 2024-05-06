package com.springlearn.udemy.repositories;

import com.springlearn.udemy.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
