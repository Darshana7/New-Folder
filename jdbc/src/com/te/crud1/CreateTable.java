package com.te.crud1;

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
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=root");
			
			createStatement = connection.createStatement();
			
			createStatement.execute("create table fruits(id int, name varchar(40), cost double, quantity int)");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
