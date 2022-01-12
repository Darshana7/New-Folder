package com.te.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("C:\\Users\\91774\\Desktop\\file.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		}
	}
}
