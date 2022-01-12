package com.te.arraypractice;

public class Sorting {

	public static void main(String[] args) {
		int a[]={3,18,17,45,99,7,1,10,8,12};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a);
		for(int x : a) {
			System.out.println(x);
		}
	}
}
