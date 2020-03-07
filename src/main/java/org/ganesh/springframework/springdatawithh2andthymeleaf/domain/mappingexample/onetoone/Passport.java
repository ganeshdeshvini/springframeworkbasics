package org.ganesh.springframework.springdatawithh2andthymeleaf.domain.mappingexample.onetoone;

import org.ganesh.springframework.springdatawithh2andthymeleaf.domain.mappingexample.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Passport extends BaseEntity {
    private int uniquePassportId;

    @OneToOne(mappedBy = "passport")
    private Employee employee;

    public Passport() {
    }

    public Passport(int uniquePassportId) {
        this.uniquePassportId = uniquePassportId;
    }

    public int getUniquePassportId() {
        return uniquePassportId;
    }

    public void setUniquePassportId(int uniquePassportId) {
        this.uniquePassportId = uniquePassportId;
    }
}