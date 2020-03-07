package org.ganesh.springframework.springdatawithh2andthymeleaf.bootstrap;

import org.ganesh.springframework.lombokexample.Student;
import org.ganesh.springframework.lombokexample.StudentRepository;
import org.ganesh.springframework.springdatawithh2andthymeleaf.domain.Publisher;
import org.ganesh.springframework.springdatawithh2andthymeleaf.domain.mappingexample.Status;
import org.ganesh.springframework.springdatawithh2andthymeleaf.domain.mappingexample.manytomany.Author;
import org.ganesh.springframework.springdatawithh2andthymeleaf.domain.mappingexample.manytomany.Book;
import org.ganesh.springframework.springdatawithh2andthymeleaf.repositories.AuthorRepository;
import org.ganesh.springframework.springdatawithh2andthymeleaf.repositories.BookRepository;
import org.ganesh.springframework.springdatawithh2andthymeleaf.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DummyData implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private PublisherRepository publisherRepository;
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {
        Publisher publisher = new Publisher("Publisher1");
        publisher.setStatus(Status.ACTIVE);
        publisherRepository.save(publisher);

        Author author1 = new Author("GaurGopal", "Das");
        author1.setStatus(Status.ACTIVE);
        Book book1 = new Book("Life Amazing Secrets", "123", publisher);
        book1.setStatus(Status.ACTIVE);
        author1.addAuthorConvenienceMethod(book1);
        authorRepository.save(author1);
        bookRepository.save(book1);

        Author author2 = new Author("ShyamSundar", "Das");
        author2.setStatus(Status.ACTIVE);
        Book book2 = new Book("Chasing Rhinos", "456", publisher);
        book2.setStatus(Status.ACTIVE);
        author2.addAuthorConvenienceMethod(book2);
        authorRepository.save(author2);
        bookRepository.save(book2);

        Book book3 = new Book("The way of the Monk", "789", publisher);
        book3.setStatus(Status.INACTIVE);
        author1.addAuthorConvenienceMethod(book3);
        bookRepository.save(book3);
        authorRepository.save(author1);

        studentRepository.save(new Student("Ganesh"));
        studentRepository.save(new Student("Radhika"));
    }
}
