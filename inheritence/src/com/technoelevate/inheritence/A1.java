package com.technoelevate.inheritence;

public class A1 extends B1 {

	public void methodA()
	{
		System.out.println("Method of class A1");
	}
	public static void main(String[] args) {
		B1 obj1=new B1();
		//C1 obj2=new C1();
		//D1 obj3=new D1();
		obj1.methodB();
		//obj2.methodA();
		//obj3.methodA();
	}
}

class B1 {
		
	public void methodB()
	{
		System.out.println("Method of class B1");
	}
}

class C1 extends A1 {
	
	 public void methodC()
	 {
		 System.out.println("Method of class C1");
	 }
}

public class D1 extends A1 {
	
	public void method()
	{
		System.out.println("Method of class D1");
	}
}
}

