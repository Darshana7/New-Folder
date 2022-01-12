package com.te.staticanddefault;

public class Hello {

	public static void main(String[] args) {
		PhoneCall call=new Maharashtra();
		PhoneCall call2=new Tamilnadu();
		PhoneCall call3=new Karnataka();
		
		call.busyMessage();
		call2.busyMessage();
		call3.busyMessage();
		System.out.println("==============");
		call.covidAlert();
		call2.covidAlert();
		call3.covidAlert();

	}

}
