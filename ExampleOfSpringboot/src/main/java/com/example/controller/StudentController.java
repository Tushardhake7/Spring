package com.example.controller;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.StudentDetailsDto;
import com.example.exceptionHandle.ValidationException;

@RestController
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/details/{id}")
	public StudentDetailsDto getStudentDetailsById(@PathVariable("id") Integer id) {

		StudentDetailsDto dto = new StudentDetailsDto();
		dto.setFirstName("Tushar");
		dto.setLastname("Dhake");
		dto.setRollNo(07);

		if(id == 1) {
			System.out.println("Get Record Details: " + dto);
			return dto;
		}
		else
			return null;
	}

	@GetMapping("/details")
	public StudentDetailsDto getStudentDetaillsByIdAsRequestParam(@RequestParam("id") Integer id) {

		StudentDetailsDto dto = new StudentDetailsDto();
		dto.setFirstName("Tushar");
		dto.setLastname("Dhake");
		dto.setRollNo(07);

		if(id == 1)
			return dto;
		else
			return null;
	}

	@GetMapping("/detailsById/{id}")
	public void getStudentDetaillsById(@RequestBody StudentDetailsDto dto, @PathVariable("id") Integer id) {
		System.out.println("Get By Id===idd=== " + id);
		System.out.println("Get By ID======== " + dto);
	}

	@PostMapping("/createById/{id}")
	public void createStudent(@RequestBody StudentDetailsDto studentDetailsDto, @PathVariable("id") Integer id) {
		System.out.println("Post By Id===idd=== " + id);
		System.out.println("Post By Id====== " + studentDetailsDto);
	}

	@PostMapping("/create")
	public void createStudent(@RequestBody @Valid StudentDetailsDto studentDetailsDto, BindingResult result) {
		if(result.hasErrors()) {
			//System.out.println("Error Present...");
			throw new ValidationException(result.getFieldError().getDefaultMessage());
		}		
		System.out.println(studentDetailsDto);
	}

	@PutMapping("/update/{id}")
	public void updateStudentDetails(@PathVariable("id") Integer id, @RequestBody StudentDetailsDto studentDetailsDto) {
		System.out.println("Updated Record: " + studentDetailsDto);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteStudentDetails(@PathVariable("id") Integer id, @RequestBody StudentDetailsDto studentDetailsDto) {
		System.out.println("Record Deleted Successfully...");	
	}

	/*
	 * // class level handle exception
	 * 
	 * @ExceptionHandler(Exception.class) public void exceptionHandler() {
	 * 
	 * }
	 */	
}
