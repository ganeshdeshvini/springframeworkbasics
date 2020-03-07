package org.ganesh.springframework.configurations.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dummythirdpartypackages.JavaBasedConfigurationClass;

@RestController
@RequestMapping("javaconfig")
public class JavaConfigurationController {
    @Autowired
    private JavaBasedConfigurationClass javaBasedConfigurationClass;

    @GetMapping("/greet")
    public String getGreeting() {
        return javaBasedConfigurationClass.greet();
    }
}