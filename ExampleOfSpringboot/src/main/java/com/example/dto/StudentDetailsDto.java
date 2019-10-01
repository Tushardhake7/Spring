package com.example.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class StudentDetailsDto {

	@NotNull(message = "First name should not be less than 5")
	@Size(max = 10, min = 5, message = "First name should not be Greater than 5")
	private String firstName;
	
	private String lastname;
	private Integer rollNo;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public Integer getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "StudentDetailsDto [firstName=" + firstName + ", lastname=" + lastname + ", rollNo=" + rollNo + "]";
	}
}
