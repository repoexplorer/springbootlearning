package com.sid.springdemo.mvc;

import java.util.LinkedHashMap;

//import java.util.List;

public class Student {
	private String firstName;
	private String lastName;
	//private List<String> country;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favriteLanguage;
	public Student() {
		// Populate country options : used ISO country code
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("IN", "INDIA");
		countryOptions.put("BR", "BRAZIL");
		countryOptions.put("DE", "GERMANY");
		countryOptions.put("FR", "FRANCE");
		countryOptions.put("US", "USA");
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
//	public List<String> getCountry() {
//		return country;
//	}
//	public void setCountry(List<String> country) {
//		this.country = country;
//	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	//We 
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	public String getFavriteLanguage() {
		return favriteLanguage;
	}
	public void setFavriteLanguage(String favriteLanguage) {
		this.favriteLanguage = favriteLanguage;
	}
}
