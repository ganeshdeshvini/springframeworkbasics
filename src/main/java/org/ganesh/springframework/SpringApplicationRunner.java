package org.ganesh.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:xmlconfigsample.xml")
public class SpringApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationRunner.class, args);
    }

}
