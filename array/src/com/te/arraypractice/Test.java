package com.te.arraypractice;

public class Test {
	public static void main(String[] args) {
		int []a= {123,55,1,-99,56};
		int smallest = a[0];
		for (int i=0; i<a.length;i++) {
			if (smallest>a[i]) {
//				System.out.println(smallest>a[i]);
				smallest=a[i];
//				System.out.println(smallest = a[i]);
			}
		}
		System.out.println(smallest);
	}
}