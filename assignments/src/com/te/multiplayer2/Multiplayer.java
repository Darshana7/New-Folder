package com.te.multiplayer2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Multiplayer {

//	Connection connection = null;
//	Statement stmt = null;
//	PreparedStatement statement = null;
//	String url = "jdbc:mysql://localhost:3306/jdbcdemo";
	static int count;

	public void add(int id,String song) {

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");
			PreparedStatement statement = connection.prepareStatement("Insert into playlist values(?,?)");
			statement.setInt(1,id);
			statement.setString(2,song);
			statement.executeUpdate();
		//	System.out.println(song + " added to list");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void search(String song) {

		count = 0;

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");
			PreparedStatement statement = connection.prepareStatement("select song from playlist where song (?,?)");
			statement.setString(2, song);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				count = 1;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (count == 1)
			System.out.println(song + " is Playing*$");
		else
			System.out.println("Song not present");

	}

	public void play(String song, Multiplayer multiplayer) {

		multiplayer.search(song);

	}

	public void delete(String song) {

		try {
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=root");
			PreparedStatement statement = connection.prepareStatement("delete from playlist where song (?,?)");
			statement.setString(1, song);
			statement.executeUpdate();
			System.out.println(song + " deleted from list");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void display() {

		try {
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=root");
			Statement stmt = connection.createStatement();
			ResultSet result = stmt.executeQuery("select * from playlist");
			System.out.println("+++++++Playlist+++++++");
			while (result.next()) {
				System.out.println(result.getString(2));
			}
			System.out.println("++++++++++++++++");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
