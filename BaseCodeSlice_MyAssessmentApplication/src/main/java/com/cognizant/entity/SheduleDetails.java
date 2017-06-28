package com.cognizant.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class SheduleDetails {
	
	int sheduleId;
	Date startDate;
	int duration;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY,cascade= CascadeType.ALL)
	@JoinColumn(name="trainerId")
    private TrainerDetails trainer;



	public int getSheduleId() {
		return sheduleId;
	}



	public void setSheduleId(int sheduleId) {
		this.sheduleId = sheduleId;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public int getDuration() {
		return duration;
	}



	public void setDuration(int duration) {
		this.duration = duration;
	}



	public TrainerDetails getTrainer() {
		return trainer;
	}



	public void setTrainer(TrainerDetails trainer) {
		this.trainer = trainer;
	}



	@Override
	public String toString() {
		return "SheduleDetails [sheduleId=" + sheduleId + ", startDate=" + startDate + ", duration=" + duration + "]";
	}



	public SheduleDetails(int sheduleId, Date startDate, int duration, TrainerDetails trainer) {
		super();
		this.sheduleId = sheduleId;
		this.startDate = startDate;
		this.duration = duration;
		this.trainer = trainer;
	}



	public SheduleDetails(int sheduleId, Date startDate, int duration) {
		super();
		this.sheduleId = sheduleId;
		this.startDate = startDate;
		this.duration = duration;
	}
	
	public SheduleDetails()
	{
		
	}
}
