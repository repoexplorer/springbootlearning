package com.example.demo.student;

import java.time.LocalDate;

public class Student {
	private Long id;
	private String name;
	private String email;
	private LocalDate dob;
	private String gender;
	public Student(Long id, String name, String email, LocalDate dob, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
	}
	public Student(String name, String email, LocalDate dob, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id 
				+ ", name=" + name 
				+ ", email=" + email 
				+ ", dob=" + dob 
				+ ", gender=" + gender
				+ "]";
	}
	
}
