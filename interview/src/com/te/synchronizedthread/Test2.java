package com.te.synchronizedthread;
import java.lang.*;

public class Test2 implements Runnable{
	
	@Override
	public void run() {
		
	}
	
	public static void main(String[] args) {
		
		 Test2 test2 = new Test2();
		 Thread th=new Thread(test2);
		 th.start();
		 th.credit();
		  
	}
	
	public void credit() {

		System.out.println("10000");

	}

	public void debit() {

		System.out.println("1000");

	}
	
}
