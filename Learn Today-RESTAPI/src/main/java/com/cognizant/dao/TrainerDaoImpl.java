package com.cognizant.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Trainer;

@Transactional
@Repository
public class TrainerDaoImpl implements TrainerDao {
	
	@Autowired
	 private JdbcTemplate jdbcTemplate;

	@Override
	public int trainerSignUp(Trainer trainer) {
		String sql="insert into trainer (trainerId, password) values("+trainer.getTrainerId()+","+trainer.getPassword()+")";    
	    return jdbcTemplate.update(sql); 
	}

	@Override
	public int updatePassword(Trainer trainer) {
		
		return jdbcTemplate.update("update trainer " + " set password = ?" + " where id = ?",
	            new Object[] {
	                trainer.getPassword()
	            });
	}

}
