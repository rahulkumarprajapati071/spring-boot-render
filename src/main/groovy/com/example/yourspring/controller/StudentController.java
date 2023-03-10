package com.example.yourspring.controller;

import com.example.yourspring.model.employee.StudentDao;
import com.example.yourspring.model.employee.StudentRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentDao studentDao;

    @GetMapping("/student/get-all")
    public List<StudentRegistration> getAllStudent()
    {
        return studentDao.getAllStudent();
    }

    @PostMapping("/student/save")
    public void save(@RequestBody StudentRegistration students)
    {
        studentDao.save(students);
    }


}
