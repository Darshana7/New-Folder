package com.te.threadclass;

public class Demo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			//even if exception occurs in demo main method is not affected
//			if(i==3) {
//				throw new ArrayIndexOutOfBoundsException();
//			}
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}
	
}
