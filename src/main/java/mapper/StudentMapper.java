package mapper;

import enttity.Student;
import model.StudentDto;

public class StudentMapper {

    public Student toStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setFirstname(studentDto.getFirstname());
        student.setLastname(studentDto.getLastname());
        student.setAge(studentDto.getAge());
        student.setEmail(studentDto.getEmail());
        student.setGender(studentDto.getGender());

        return student;
    }



}
