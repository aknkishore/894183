package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.TrainerDaoImpl;
import com.cognizant.model.Trainer;

@Service
public class TrainerService {
	@Autowired
	private TrainerDaoImpl trainerDaoImpl;
	
	public int trainerSignUp(Trainer trainer) {
		return trainerDaoImpl.trainerSignUp(trainer);
	}
	
	public int trainerUpdate(Trainer trainer) {
		return trainerDaoImpl.updatePassword(trainer);
	}
	
}
