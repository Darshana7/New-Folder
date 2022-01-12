package com.te.prac;

public class Sorting {
	
	public static void main(String[] args) {
		int []a={6,8,2,3,7};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp= a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
//		for(int x:a) {
//			System.out.println(x);
//		}
		System.out.println("Largest of array "+ a[a.length-1]);
		
	}

}
