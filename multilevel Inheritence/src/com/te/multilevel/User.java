package com.te.multilevel;

public class User {
public static void main(String[] args) {
	MessageRead messageRead= new MessageRead();
	messageRead.text();
	messageRead.textReceived();
	messageRead.messageRead();
	
	System.out.println("===========");
	MessageReceived messageReceived=new MessageReceived();
	messageReceived.text();
	messageReceived.textReceived();
}
}
