package com.te.arraypractice;

public class Sorting1 {

	public static void main(String[] args) {
		int a[]={2,10,6,4,7};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if (a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int x:a) {
			System.out.println(x);
		}
		System.out.println("Second largest of array : "+a[a.length-2]);
	}
}
