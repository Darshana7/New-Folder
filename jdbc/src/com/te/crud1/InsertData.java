package com.te.crud1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection connection=null;
		Statement statement=null;
		
		try {
			DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=root");
			
			statement = connection.createStatement();
			
			boolean execute = statement.execute("Insert into fruits value(101,'Apple',30,1)");
			boolean execute1 = statement.execute("Insert into fruits value(102,'Banana',50,12)");
			boolean execute2 = statement.execute("Insert into fruits value(103,'Pineapple',100,2)"); 
			
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
			if(statement!=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
