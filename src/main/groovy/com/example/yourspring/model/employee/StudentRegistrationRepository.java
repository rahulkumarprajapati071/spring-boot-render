package com.example.yourspring.model.employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRegistrationRepository extends CrudRepository<StudentRegistration,Integer> {

}
