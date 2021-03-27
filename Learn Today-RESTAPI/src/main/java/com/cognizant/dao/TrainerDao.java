package com.cognizant.dao;

import com.cognizant.model.Trainer;

public interface TrainerDao {
	
	int trainerSignUp(Trainer trainer);
	
	int updatePassword(Trainer trainer);

}
