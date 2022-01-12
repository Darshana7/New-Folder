package com.te.arraypractice;

public class ReverseArray {
	public static void main(String[] args) {
	int a[] ={3,5,1,4,7};
	int temp;
	int i =0;
	int j=a.length-1;
	while(i<=j) {
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	for(i=0; i<a.length; i++) {
		System.out.println(a[i]);
	}
}
}
