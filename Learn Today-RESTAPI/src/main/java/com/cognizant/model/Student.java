package com.cognizant.model;

import javax.persistence.Entity;


public class Student {

	private int enrollmentId;
	private int studentId;
	private int courseId;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int enrollmentId, int studentId, int courseId) {
		super();
		this.enrollmentId = enrollmentId;
		this.studentId = studentId;
		this.courseId = courseId;
	}

	public int getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Student [enrollmentId=" + enrollmentId + ", studentId=" + studentId + ", courseId=" + courseId + "]";
	}
	
	
}
