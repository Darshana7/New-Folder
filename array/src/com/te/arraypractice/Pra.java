package com.te.arraypractice;

import java.util.Scanner;

public class Pra {
 public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 String a= in.nextLine();
	 
	 String b=a;
	 
	StringBuffer stringBuffer = new StringBuffer(b);
	//System.out.println(stringBuffer);
	String re = new String(stringBuffer.reverse());
	
	
	if (a.equals(re)){
		System.out.println("plindrom");
	}
	else
	
		System.out.println("not plindrom");
	
	
}
}
