package org.ganesh.springframework.springdatawithh2andthymeleaf.domain.mappingexample.onetomany;

import org.ganesh.springframework.springdatawithh2andthymeleaf.domain.mappingexample.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Product extends BaseEntity {
    private String name;

    @OneToMany(mappedBy = "product")
    private Set<Review> reviews = new HashSet<>();

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, Set<Review> reviews) {
        this.name = name;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }
}
