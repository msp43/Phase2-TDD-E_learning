package com.simplilearn.tdd.E_learning;

import java.util.ArrayList;
import java.util.List;

public class PractiseService {
	
	List<Practise> prac;
	public PractiseService() {
		prac=new ArrayList<>();
		prac.add(new Practise(1,"Selenium"));
		prac.add(new Practise(2,"Selenium-Grid"));
		prac.add(new Practise(3,"TestNG"));
		prac.add(new Practise(1,"POM Framework"));
		prac.add(new Practise(1,"JUnit"));
	}
	public List<Practise> getPractice(){
		return prac;
	}

}
