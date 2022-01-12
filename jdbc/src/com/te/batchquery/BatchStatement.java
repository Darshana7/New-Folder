package com.te.batchquery;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class BatchStatement {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		FileReader fileReader;
		Connection connection=null;
		Statement stmt=null;
		try {
			fileReader=new FileReader("C:\\Users\\91774\\Desktop\\dbcred.txt");
			Properties properties = new Properties();
			properties.load(fileReader);
			DriverManager.getConnection(url, properties);
			stmt=connection.createStatement();
			
			stmt.addBatch("insert into employees values(101,'Kumar')");
//			stmt.addBatch("update employees set name='manju'where id =101");
			stmt.addBatch("insert into employee values(103,'Rashmika Mandana')");
			
			stmt.executeBatch();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
