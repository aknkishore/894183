package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Course;
import com.cognizant.model.Student;
import com.cognizant.service.StudentService;

@RestController
public class AdminController {
	
	@Autowired
	public StudentService studentService;
	
	@RequestMapping(value="/courses",method = RequestMethod.GET)
	public List<Course> getAllCourse(){
		
		
		return studentService.getAllCourses();
		
		
	}

	@PostMapping(value="/studentAdd",consumes= MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_JSON_VALUE)
	public int addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@RequestMapping(value="/studentDelete/{studentId}",method=RequestMethod.DELETE,produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public int deleteStudent(@PathVariable("studentId") int studentId)
	{
		return studentService.deleteStudent(studentId);
	}
	
	@GetMapping(value="/course/{courseId}")
	public Course getCourseById(@PathVariable int courseId) {
		return studentService.getCourseById(courseId);
	}
}
