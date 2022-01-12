package com.te.storedprocedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		Connection connection=null;
		CallableStatement callStatement=null;
		
		try {
			connection = DriverManager.getConnection(url,"root","root");
			callStatement = connection.prepareCall("call put(?,?,?,?)");
			//Taking inputs from user
			Scanner scan=new Scanner(System.in);
			while(true) {
				System.out.println("Enter the id of sweets");
				int id= scan.nextInt();
				System.out.println("Enter the name of sweets");
				String name= scan.next();
				System.out.println("Enter the cost of sweets");
				double price= scan.nextDouble();
				System.out.println("Enter the quantity");
				int kg=scan.nextInt();
				
				//Assigning the values to table
				callStatement.setInt(1, id);
				callStatement.setString(2, name);
				callStatement.setDouble(3, price);
				callStatement.setInt(4, kg);
				
				//Execute the statement
				callStatement.execute();
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
