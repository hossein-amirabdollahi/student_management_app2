package com.school.studentmanagement2.service.IMPL;

import com.school.studentmanagement2.dto.StudentSaveDTO;
import com.school.studentmanagement2.entity.Student;
import com.school.studentmanagement2.repository.StudentRepository;
import com.school.studentmanagement2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceIMPL implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public String addStudent(StudentSaveDTO studentSaveDTO) {

        Student student = new Student(

                studentSaveDTO.getName(),
                studentSaveDTO.getAddress(),
                studentSaveDTO.getPhone()
        );

        studentRepository.save(student);

        return student.getName();
    }
}
