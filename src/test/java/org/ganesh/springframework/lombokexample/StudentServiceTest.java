package org.ganesh.springframework.lombokexample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceTest {

    @InjectMocks
    private StudentService studentService;

    @Mock
    private StudentRepository studentRepository;

    @Test
    public void getStudentDetails() {
        List<Student> mockedList = new ArrayList<>();
        mockedList.add(new Student());
        when(studentRepository.findAll()).thenReturn(mockedList);
        List<Student> studentDetails = studentService.getStudentDetails();
        assertEquals(1, studentDetails.size());
        verify(studentRepository, times(2)).findAll();
    }
}