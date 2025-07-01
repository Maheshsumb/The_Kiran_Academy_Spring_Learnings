package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("1")
	int sID;
	@Value("Datta")
	String sName;
	@Value("21")
	int sAge;
	@Autowired
	College clg;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sID, String sName, int sAge, College clg) {
		super();
		this.sID = sID;
		this.sName = sName;
		this.sAge = sAge;
		this.clg = clg;
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
	public College getClg() {
		return clg;
	}
	public void setClg(College clg) {
		this.clg = clg;
	}
	@Override
	public String toString() {
		return "Student [sID=" + sID + ", sName=" + sName + ", sAge=" + sAge + ", clg=" + clg + "]";
	}
	
	

}
