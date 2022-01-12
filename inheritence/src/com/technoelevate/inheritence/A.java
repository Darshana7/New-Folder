package com.technoelevate.inheritence;

public class A {
	int x;
	int y;
	A(int x, int y){
		this.x=x;
		this.y=y;
	}
}



class B extends A{
	int a;
	int b;
	B(int a, int b, int x, int y) {
	super(x,y);
	this.a=a;
	this.b=b;
}
  
	
public static void main(String[] args) {
  B.b1=new B(1,2,3,4);
  System.out.println(b1.a);
  System.out.println(b1.b);
  System.out.println(b1.x);
  System.out.println(b1.y);
	}
}
  