package com.example.yourspring

import com.example.yourspring.model.employee.StudentDao
import com.example.yourspring.model.employee.StudentRegistration
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class YourSpringApplicationTests {

	@Autowired
	private StudentDao studentDao;

//	@Test
	void studentRegistration() {
		StudentRegistration studentRegistration = new StudentRegistration();
		studentRegistration.setFirstName("Rahul");
		studentRegistration.setLastName("Prajapati");
		studentRegistration.setSemester(6);
		studentRegistration.setBranch("IT");
		studentRegistration.setMobileNumber(9179953727L);
		studentRegistration.setPassword("9786");
		studentRegistration.setRollNumber("0829IT201029");

		studentDao.save(studentRegistration);

	}

	@Test
	void getAllStudent()
	{
		List<StudentRegistration> students = studentDao.getAllStudent();
		for(StudentRegistration allStudents : students)
		{
			studentDao.delete(allStudents);
		}
	}

}
