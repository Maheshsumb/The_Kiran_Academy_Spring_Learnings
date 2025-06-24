package com.Entity;

public class Student {
	private int sID;
	private String sName;
	private int sAge;
	private String sCity;

	

	public Student(int sID, String sName, int sAge, String sCity) {
		super();
		this.sID = sID;
		this.sName = sName;
		this.sAge = sAge;
		this.sCity = sCity;
	}

	public Student() {

	}

	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public String getsCity() {
		return sCity;
	}

	public void setsCity(String sCity) {
		this.sCity = sCity;
	}

	@Override
	public String toString() {
		return "Student [sID=" + sID + ", sName=" + sName + ", sAge=" + sAge + ", sCity=" + sCity + "]";
	}

	
}
