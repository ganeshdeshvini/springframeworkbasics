package org.ganesh.springframework.springdatawithh2andthymeleaf.domain;

import org.ganesh.springframework.springdatawithh2andthymeleaf.domain.mappingexample.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Publisher extends BaseEntity {

    private String name;

    public Publisher() {
    }

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
