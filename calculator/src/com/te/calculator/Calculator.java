package com.te.calculator;

import java.util.Scanner;

public class Calculator {
	
	  public static void main(String[] args) {
	    char operator;
	    int n1, n2;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Choose an operator: +, -, *, /, %, $ or #");
	    operator = input.next().charAt(0);
	    System.out.println("Enter first number");
	    n1 = input.nextInt();
	    System.out.println("Enter second number");
	    n2 = input.nextInt();
	    switch (operator) {
	      case '+':
	        System.out.println(n1+"+"+n2+"="+(n1+n2));
	        break;
	      case '-':
	        System.out.println(n1+"-"+n2+"="+(n1-n2));
	        break;
	      case '*':
	        System.out.println(n1+"*"+n2+"="+(n1*n2));
	        break;
	      case '/':
	        System.out.println(n1+"/"+n2+"="+(n1/n2));
	        break;
	      case '%':
		        System.out.println(n1+"%"+n2+"="+(n1%n2));
		        break;
	      case '#':
		        System.out.println("GST Amount="+(n1*n2/100));
		        break;
	      case '$':
	        System.out.println("Total Amount with GST=" +((n1*n2/100)+n1));
	        break;
	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
	    input.close();
	  }
	}