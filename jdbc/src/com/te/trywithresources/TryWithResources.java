package com.te.trywithresources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=root");
				Statement stmt=con.createStatement();) {
				boolean execute = stmt.execute("alter table fruits rename to sweets");
				System.out.println(execute);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
