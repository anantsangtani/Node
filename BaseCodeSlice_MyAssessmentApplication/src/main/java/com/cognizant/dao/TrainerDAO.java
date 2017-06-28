package com.cognizant.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.TrainerDetails;

@Component
public class TrainerDAO {
	
	
	@PersistenceContext
    private EntityManager em;
	
	@Transactional
	public void addTrainer(TrainerDetails trainer1) {
		
		// TODO Auto-generated method stub
		em.persist(trainer1);
		System.out.println(trainer1);
	}

}
