package com.cognizant.model;

import java.sql.Date;



public class Course {

	private Integer courseId;
	private String title;
	private float fees;
	private String description;
	private String trainer;
	private Date start_date;
	private int student;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(Integer courseId, String title, float fees, String description, String trainer, Date start_date,
			int student) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.fees = fees;
		this.description = description;
		this.trainer = trainer;
		this.start_date = start_date;
		this.student = student;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public int getStudent() {
		return student;
	}

	public void setStudent(int student) {
		this.student = student;
	}

	
	
}
