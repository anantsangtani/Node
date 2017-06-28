package com.cog.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.dao.TrainerDAO;
import com.cognizant.entity.SheduleDetails;
import com.cognizant.entity.TrainerDetails;
import com.cognizant.service.TrainerService;

public class TestTrainer {
	@Autowired
	TrainerDAO trainerDao;
	
	@Autowired
	TrainerService service;
	@Test
	public void addTrainerDetails() throws ParseException{
		
		String date1="28/07/2017";
		Date date=new SimpleDateFormat("dd/MM/yyyy").parse(date1);
		
		SheduleDetails shedule=new SheduleDetails(12,date,30);
		List<SheduleDetails> List=new ArrayList<SheduleDetails>();
		List.add(shedule);
		TrainerDetails trainer1 = new TrainerDetails(1234,"anant","modi", "java",List);
		
		System.out.println(trainer1);
		
		service.addTrainer(trainer1);
		assertTrue(true);
		
	}

	


}
