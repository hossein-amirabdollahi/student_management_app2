package com.school.studentmanagement2.controller;

import com.school.studentmanagement2.dto.StudentSaveDTO;
import com.school.studentmanagement2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(path = "/save")
    public String saveStudent(@RequestBody StudentSaveDTO studentSaveDTO){
        String studentName = studentService.addStudent(studentSaveDTO);
        return studentName;
    }
}
