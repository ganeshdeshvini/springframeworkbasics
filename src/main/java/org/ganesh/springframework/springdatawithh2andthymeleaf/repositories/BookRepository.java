package org.ganesh.springframework.springdatawithh2andthymeleaf.repositories;

import org.ganesh.springframework.springdatawithh2andthymeleaf.domain.mappingexample.manytomany.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
