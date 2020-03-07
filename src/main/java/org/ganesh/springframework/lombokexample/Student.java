package org.ganesh.springframework.lombokexample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.ganesh.springframework.springdatawithh2andthymeleaf.domain.mappingexample.BaseEntity;

import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student extends BaseEntity {
    private String name;
}
