package org.ganesh.springframework.configurations.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import dummythirdpartypackages.JavaBasedConfigurationClass;

@Configuration
public class JavaBasedConfiguration {
    @Bean
    public JavaBasedConfigurationClass getSomeDummyClassBean() {
        return new JavaBasedConfigurationClass();
    }
}
