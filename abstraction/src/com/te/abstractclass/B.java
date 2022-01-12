package com.te.abstractclass;

abstract class B extends A{
	public void sub(int i, int j) {
		System.out.println(i-j);
	}
	public abstract void mul();
}
