package com.technoelevate.methodoverloading;

public class MothodOverloadingWithNoDiffArgs {
public void login(String username, String password) {
	System.out.println("Your username is " +username);
	System.out.println("Your password is " +password);
}
public void login(String password, long phoneNumber) {
	System.out.println("Your password is " + password);
	System.out.println("Your phoneNumber is "+ phoneNumber);
}
public static void main(String[] args) {
	MothodOverloadingWithNoDiffArgs obj = new MothodOverloadingWithNoDiffArgs();
	obj.login("dee4mch97", "dee4mch97@D");
	obj.login("dee4mch97@D", 987654321l);
}
}

