package com.technoelevate.methodoverloading;

public class ChangingTheNoPara {
public static void add(int x,int y) {
	System.out.println(x+y);
}
public void add(int x,int y, int z) {
	System.out.println(x+y+z);
}
public static void main(String[] args) {
	ChangingTheNoPara obj = new ChangingTheNoPara();
	// Static methods can be accessed within the class by the name itself
	add(2, 3);//5
	obj.add(5, 6, 7);//18
}
}



