package com.te.runnableinterface;

public class MyThread implements Runnable {
	@Override
	public void run() {
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
		System.out.println("The name of the current thread is :" + Thread.currentThread().getName());
		System.out.println("The thread id is : " +Thread.currentThread().getId());
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}

