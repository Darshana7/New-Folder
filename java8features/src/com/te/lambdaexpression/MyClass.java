package com.te.lambdaexpression;

public class MyClass {
	
	public static int sum(int i, int j) {
		return i+j;
	}
	
	public int addition(int i,int j) {
		return i+j;
	}
	
	public static int sub(int i, int j) {
		return i-j;
	}
	
	public static void main(String[] args) {
		
		Test test = new MyClass()::addition;
		System.out.println(test.add(10, 50));
		
//		Test test2 = new MyClass()::sum;
//		System.out.println(test2.add(50, 60));
		
		
		// Anonymous class
//		Test test = new Test() {
//			
//			@Override
//			public void message() {
//				System.out.println("Namaste guys!!!");
//				
//			}
//		};
//		test.message();
//		System.out.println("==============");
//		Test test1 =(i,j)-> {
//			return i-j;
//		};
//		System.out.println(test1.sub(66, 50));
		
//		Runnable run =()-> {
//			for(int i=0; i<=5; i++) {
//				System.out.println(i);
//			}	
//		};
//		
//		Thread thread = new Thread(run);
//		thread.start();
	}

}
