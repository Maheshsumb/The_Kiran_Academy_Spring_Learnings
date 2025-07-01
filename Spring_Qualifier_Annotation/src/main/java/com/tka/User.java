package com.tka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Autowired
	@Qualifier("jio")
	Sim s1;
	@Autowired
	@Qualifier("air")
	Sim s2;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Sim s1, Sim s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}

	public Sim getS1() {
		return s1;
	}

	public void setS1(Sim s1) {
		this.s1 = s1;
	}

	public Sim getS2() {
		return s2;
	}

	public void setS2(Sim s2) {
		this.s2 = s2;
	}

	@Override
	public String toString() {
		return "User [s1=" + s1 + ", s2=" + s2 + "]";
	}

}
