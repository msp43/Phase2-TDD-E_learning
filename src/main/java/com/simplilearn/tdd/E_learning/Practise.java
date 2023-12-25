package com.simplilearn.tdd.E_learning;

public class Practise {
	
	public int practiceId;
	public String PracticeName;
	public int getPracticeId() {
		return practiceId;
	}
	public void setPracticeId(int practiceId) {
		this.practiceId = practiceId;
	}
	public String getPracticeName() {
		return PracticeName;
	}
	public void setPracticeName(String practiceName) {
		PracticeName = practiceName;
	}
	public Practise(int practiceId, String practiceName) {
		super();
		this.practiceId = practiceId;
		PracticeName = practiceName;
	}

}
