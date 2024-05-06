package com.springlearn.udemy.repositories;

import com.springlearn.udemy.domain.Publisher;
import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
