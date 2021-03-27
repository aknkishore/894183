package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.StudentDaoImpl;
import com.cognizant.model.Course;
import com.cognizant.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDaoImpl studentDaoImpl;
	
	public List<Course> getAllCourses(){
		return studentDaoImpl.getAllCourses();
	}
	
	
	public int addStudent(Student student) {
		return studentDaoImpl.addStudent(student);
	}
	
	public int deleteStudent(int studentId) {
		return studentDaoImpl.deleteStudent(studentId);
	}
	
	public Course getCourseById(int courseId) {
		return studentDaoImpl.getCourseById(courseId);
	}
	
}
