package com.cognizant.model;

import javax.persistence.Entity;


public class Trainer {
	private int trainerId;
	private String password;
	public Trainer() {
		// TODO Auto-generated constructor stub
	}
	public Trainer(int trainerId, String password) {
		super();
		this.trainerId = trainerId;
		this.password = password;
	}
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", password=" + password + "]";
	}
	
	

}
