package org.ganesh.springframework.lombokexample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Slf4j
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getStudentDetails() {
        log.info("getStudentDetails called from Service");
        return studentRepository.findAll();
    }
}
