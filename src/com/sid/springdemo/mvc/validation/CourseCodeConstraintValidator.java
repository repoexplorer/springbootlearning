package com.sid.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
		//ConstraintValidator.super.initialize(courseCode);
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext courseConstraintValidatorContext) {
		if(theCode!=null) {
		return theCode.startsWith(coursePrefix);
		}
		else
			return false;
	}

}
