package com.te.singlelevelinheritance;

public class CalcAdv extends Calculator{
	public int sub(int i, int j) {
		return i-j;
	}
	public static void main(String[] args) {
		CalcAdv c=new CalcAdv();
		System.out.println(c.add(5, 9));
		System.out.println(c.sub(9, 3));
	}
}
