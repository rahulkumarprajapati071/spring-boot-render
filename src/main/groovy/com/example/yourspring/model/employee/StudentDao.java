package com.example.yourspring.model.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentDao {
    @Autowired
    private StudentRegistrationRepository studentRegistrationRepository;

    public void save(StudentRegistration studentRegistration)
    {
        studentRegistrationRepository.save(studentRegistration);
    }

    public List<StudentRegistration> getAllStudent()
    {
        List<StudentRegistration> students = new ArrayList<>();
        Streamable.of(studentRegistrationRepository.findAll()).forEach(students::add);
        return students;
    }

    public void delete(StudentRegistration studentRegistration)
    {
        studentRegistrationRepository.delete(studentRegistration);
    }

}
