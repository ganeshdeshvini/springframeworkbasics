package org.ganesh.springframework.springdatawithh2andthymeleaf.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PublisherTest {
    private Publisher publisher;

    @Before
    public void setUp() {
        publisher = new Publisher();
    }

    @Test
    public void testName() {
        String name = "Ganesh";
        publisher.setName(name);
        Assert.assertEquals(name, publisher.getName());
    }
}