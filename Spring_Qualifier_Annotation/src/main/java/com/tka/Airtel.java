package com.tka;

import org.springframework.stereotype.Component;

@Component("air")
public class Airtel  implements Sim{
	@Override
	public String calling() {
		
		return "CALLING FROM AIRTEL..........";
	}

}
