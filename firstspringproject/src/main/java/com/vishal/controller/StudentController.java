package com.vishal.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.entity.Faculty;
import com.vishal.entity.Subject;
import com.vishal.service.FacultyService;

@RestController
public class StudentController {

	@GetMapping("welcome")
	public String welcome() {
		return """
				 Hello and welcome! It's wonderful to see you.
				""";
	}

	@GetMapping("faculty")
	public List<Faculty> getAllFaculty() {
		FacultyService service = new FacultyService();
		return service.getListOfFaculty();
	}

	@GetMapping("subject")
	public List<Subject> getAllSubjects() {
		List<Subject> subjects = new ArrayList<Subject>();
		FacultyService service = new FacultyService();
		for(Faculty faculty : service.getListOfFaculty()) {
			subjects.addAll(faculty.getSubjects());	
		}
		
		return subjects;
	}

	
}
