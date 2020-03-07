package org.ganesh.springframework.springdatawithh2andthymeleaf.repositories;

import org.ganesh.springframework.springdatawithh2andthymeleaf.domain.mappingexample.manytomany.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
