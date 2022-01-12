package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/technoelevate","root","root");
			statement=connection.createStatement();
			boolean execute = statement.execute("Insert into sweets values(101,'Gulabjamun',10,1)");
			boolean execute1 = statement.execute("Insert into sweets values(102,'Kajukatli',40,3)");
			
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
