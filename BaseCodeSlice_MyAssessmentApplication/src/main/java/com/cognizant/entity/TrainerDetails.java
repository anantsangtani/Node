package com.cognizant.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;





@Entity
public class TrainerDetails {
	
	@Id
	int trainerId;
	String trainerName;
	String collegeName;
	String domain;
	
	@OneToMany(mappedBy="trainer",cascade=CascadeType.ALL, fetch=FetchType.EAGER) 
	List<SheduleDetails> shedule;
	
	
	
	
	public long getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	@Override
	public String toString() {
		return "TrainerDetails [trainerId=" + trainerId + ", trainerName=" + trainerName + ", collegeName="
				+ collegeName + ", domain=" + domain + ", shedule=" + shedule + "]";
	}
	public TrainerDetails()
	{
		
	}
	public TrainerDetails(int trainerId, String trainerName, String collegeName, String domain,
			List<SheduleDetails> shedule) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.collegeName = collegeName;
		this.domain = domain;
		this.shedule = shedule;
	}
	public TrainerDetails(int trainerId, String trainerName, String collegeName, String domain) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.collegeName = collegeName;
		this.domain = domain;
	}

}
