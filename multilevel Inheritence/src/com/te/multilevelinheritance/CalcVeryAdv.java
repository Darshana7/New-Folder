package com.te.multilevelinheritance;

public class CalcVeryAdv extends CalcAdv {
	public int mul(int i, int j) {
		return i*j;
	}
	public static void main(String[] args) {
		CalcVeryAdv c=new CalcVeryAdv();
		System.out.println(c.add(5, 9));
		System.out.println(c.sub(9, 3));
		System.out.println(c.mul(4, 3));
	}
}
