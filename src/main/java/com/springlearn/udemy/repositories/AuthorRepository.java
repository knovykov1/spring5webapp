package com.springlearn.udemy.repositories;


import com.springlearn.udemy.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
