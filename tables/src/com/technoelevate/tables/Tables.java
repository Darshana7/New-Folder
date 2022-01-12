package com.technoelevate.tables;

import java.util.Scanner;
public class Tables {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int a=sc.nextInt();
int sum=0;
for(int i=1; i<=10; i++)
    {
	sum=sum+(a*i);
	System.out.println(a+"*"+i+"="+a*i);
	}
System.out.println("Sum:"+ sum);
sc.close();
	}
}
