package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUsingPrepare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/technoelevate","root","root");
			statement=connection.prepareStatement("insert into sweets values (?,?,?,?)");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the id of sweets");
			int id=scan.nextInt();
			System.out.println("Enter the name of the sweet");
			String sweetname=scan.next();
			statement.setInt(1, id);
			statement.setString(2, sweetname);
			statement.setDouble(3, 50);
			statement.setInt(4, 1);
			int executeUpdate = statement.executeUpdate();
			System.out.println(executeUpdate);
			
		} catch (SQLException e) {
			 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
