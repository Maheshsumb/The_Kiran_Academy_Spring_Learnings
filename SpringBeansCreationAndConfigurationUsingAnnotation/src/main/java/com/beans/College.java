package com.beans;



import org.springframework.beans.factory.annotation.Value;

public class College {
	@Value("1634")
	int cID;
	@Value("DYPCOEI")
	String cName;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int cID, String cName) {
		super();
		this.cID = cID;
		this.cName = cName;
	}
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
	
	
	

}
