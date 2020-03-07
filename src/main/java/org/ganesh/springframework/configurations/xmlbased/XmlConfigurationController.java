package org.ganesh.springframework.configurations.xmlbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dummythirdpartypackages.XmlBasedConfigurationClass;

@RestController
@RequestMapping("xmlconfig")
public class XmlConfigurationController {
    @Autowired
    private XmlBasedConfigurationClass xmlBasedConfigurationClass;

    @GetMapping("/greet")
    public String getGreeting() {
        return xmlBasedConfigurationClass.greet();
    }
}
