package com.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Student {

	@Value("1")
	int sId;
	@Value("Ram")
	String sName;
	 @Value("Pune")
	String sCity;
	 
	 @Autowired
	 College sCollege;
	public Student(int sId, String sName, String sCity, College sCollege) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sCity = sCity;
		this.sCollege = sCollege;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	public College getsCollege() {
		return sCollege;
	}
	public void setsCollege(College cName) {
		this.sCollege = cName;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sCity=" + sCity + ", cName=" + sCollege + "]";
	}
	 
	 
	
}
