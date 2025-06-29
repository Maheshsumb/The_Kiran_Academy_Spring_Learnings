package com.entities;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component
public class College {

	@Value("123")
	int cID;
	@Value("DYPCOEI")
	String cName;
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	@Override
	public String toString() {
		return "College [cID=" + cID + ", cName=" + cName + "]";
	}
	public College(int cID, String cName) {
		super();
		this.cID = cID;
		this.cName = cName;
	}
	public College() {
		
	}
	
}
