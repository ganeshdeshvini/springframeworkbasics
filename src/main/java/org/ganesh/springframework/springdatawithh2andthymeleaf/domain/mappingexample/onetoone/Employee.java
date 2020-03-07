package org.ganesh.springframework.springdatawithh2andthymeleaf.domain.mappingexample.onetoone;

import org.ganesh.springframework.springdatawithh2andthymeleaf.domain.mappingexample.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee extends BaseEntity {
    private String name;

    @OneToOne
    @JoinColumn(name = "passport_id")
    private Passport passport;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }
}