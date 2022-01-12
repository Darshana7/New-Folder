package com.te.runnableinterface;

public class Main {
	public Main() {
		Runnable myThread = new MyThread();
//		Thread thread = new Thread(myThread);
		Thread currentThread = Thread.currentThread();
		System.out.println("The name of the current thread is :" + currentThread);
		//the code to set the name of the thread
		currentThread.setName("Chota Bheem");
		System.out.println("The name of the current thread is :" + currentThread);
		Thread thread = new Thread(myThread);
		thread.setName("Chutki");
		thread.start();
		//The code for id
		System.out.println("The thread id is : " +currentThread.getId());
	}

}
