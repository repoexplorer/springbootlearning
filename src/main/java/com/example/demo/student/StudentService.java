package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public List<Student> getStudents() {
		return List.of(
					new Student("Siddhant", 
								"sid@giit.com", 
								LocalDate.of(1996, Month.SEPTEMBER, 9),
								"Male")
				);
	}
}
