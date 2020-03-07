package org.ganesh.springframework.lombokexample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StudentControllerTest {
    @InjectMocks
    private StudentController studentController;

    @Mock
    private StudentService studentService;

    @Test
    public void getStudentDetails() {
        List<Student> students = Arrays.asList(new Student());
        when(studentService.getStudentDetails()).thenReturn(students);
        List<Student> studentDetails = studentController.getStudentDetails();
        assertEquals(1, studentDetails.size());
    }
}