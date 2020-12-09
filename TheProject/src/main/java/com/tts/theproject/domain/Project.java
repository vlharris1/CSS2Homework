package com.tts.theproject.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String task;
	
//	@Column
//	@CreationTimestamp
	
	
	public Project() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Project(String task) {
		this.task = task;
	}
	
	@Override
	public String toString() {
		return "Project [id=" + id + ", task=" + task + "]";
	}
}
