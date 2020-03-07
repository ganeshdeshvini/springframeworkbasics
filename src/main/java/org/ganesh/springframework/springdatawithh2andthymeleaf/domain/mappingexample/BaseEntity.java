package org.ganesh.springframework.springdatawithh2andthymeleaf.domain.mappingexample;

import javax.persistence.*;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Prefer to use EnumType as STRING & not as ORDINAL, because
     * ORDINAL stores the value as index value in 1, 2, 3...
     * STRING stores the actual string values
     * Suppose tomorrow if you introduce another status say NEW or ONHOLD & try to
     * add in between of existing enums then the index value would get conflicting/changed which will impact the old data as well
     * eg:-
     * old:- ACTIVE, DELETED (Active is 1 & Deleted is 2)
     * new:- ACTIVE, IN_ACTIVE, DELETED (Active is 1, Inactive is 2 & Deleted now becomes 3)
     */
    @Enumerated(value = EnumType.STRING)
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
