package org.ganesh.springframework.springdatawithh2andthymeleaf.repositories;

import org.ganesh.springframework.springdatawithh2andthymeleaf.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
