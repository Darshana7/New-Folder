package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class CreateTable {

	public static void main(String[] args) {
		
		Connection connection=null;
		Statement createStatement=null;
		
		try {
			//1 st step loading or register the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//2nd step create a connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/technoelevate?user=root&password=root");
			
			//3 rd step creating a platform (statement)
			createStatement = connection.createStatement();
			
			//4th execute query
			createStatement.execute("create table sweets (id int, name varchar(40),cost double, quantity int)");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//5th step close connection
		finally {
			if (connection!=null){
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(createStatement!=null) {
			try {
				createStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
		}
		
	}

}
