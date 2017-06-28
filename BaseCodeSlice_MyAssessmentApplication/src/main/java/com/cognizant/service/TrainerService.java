package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.dao.TrainerDAO;
import com.cognizant.entity.TrainerDetails;

@Component
public class TrainerService {

	@Autowired
	TrainerDAO trainerDao;
	
	public void addTrainer(TrainerDetails trainer1) {
		
		// TODO Auto-generated method stub
		trainerDao.addTrainer(trainer1);
		System.out.println(trainer1);
		
	}

}
