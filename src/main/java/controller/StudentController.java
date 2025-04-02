package controller;

import model.StudentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.StudentService;

import java.util.List;

@RestController
@RequestMapping (path = "/college/v1")
public class StudentController {

    private StudentService studentService;

    public StudentController (StudentService studentService){
        this.studentService = studentService;
    }


   /* @PostMapping(path = "/student")
    public ResponseEntity<?> createStudent(){

    }



    @GetMapping(path = "/student")
    public ResponseEntity<?> getAllStudents(){

        List<StudentDto> students = this.studentService.getAllStudents();

        return ResponseEntity.status(200).body(students);
    }*/
}
