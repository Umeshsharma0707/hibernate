package com.hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Developer {
	@Id
	private int developerId;
	private String developerName;
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Project> projects;
	public int getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}
	public String getDeveloperName() {
		return developerName;
	}
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Developer [developerId=" + developerId + ", developerName=" + developerName + ", projects=" + projects
				+ "]";
	}
	
	
}
