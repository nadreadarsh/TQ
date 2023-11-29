package com.vectorDemo;

import java.util.ArrayList;

public class Trainer {
	String name;
	int Experience;
	String education;
	

	@Override
	public String toString() {
		return "Trainer [name=" + name + ", Experience=" + Experience + ", education=" + education + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getExperience() {
		return Experience;
	}


	public void setExperience(int experience) {
		Experience = experience;
	}


	public String getEducation() {
		return education;
	}


	public void setEducation(String education) {
		this.education = education;
	}


	public Trainer(String name, int experience, String education) {
		super();
		this.name = name;
		Experience = experience;
		this.education = education;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Trainer> tList = new ArrayList<>();
		

	}

}
