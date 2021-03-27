package com.cognizant.dao;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.model.Course;
import com.cognizant.model.Student;


public interface StudentDao {
	
	List<Course> getAllCourses();
	
	int addStudent(Student student);
	
	int deleteStudent(int studentId);
	
	Course getCourseById(int courseId);
	
	
	
	

}
