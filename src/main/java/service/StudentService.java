package service;

import model.StudentDto;
import org.springframework.stereotype.Service;
import repositoyry.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
}
