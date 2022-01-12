package com.te.multiplayer1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class User {

	public void display(HashSet songList) {
		Iterator iterator = songList.iterator();
		for (Object x : songList) {
			System.out.println("* "+x);
		}

	}

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement stmt=null;
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root,password=root");
		stmt=connection.prepareStatement("insert into songs values (?,?,?,?)");
		int count=0;
		String song;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the track_no.");
		int track_no=scan.nextInt();
		System.out.println("Enter the name of the song");
		String songName=scan.next();
		Multiplayer multiplayer = new Multiplayer();
		User user = new User();
		HashSet songList = new HashSet<String>();
		String option;
		
		songList.add("Perfect");
		songList.add("Raabta");
		songList.add("Closer");
		songList.add("Makhna");
		songList.add("FinallyFound");
		songList.add("Addicted");
		ArrayList arraylist = new ArrayList(songList);
		do {
		System.out.println("Type the action that you want:\n->play\n->search\n->add\n->delete\n->display\n->exit");
		option = scan.next();
		switch (option) {
		case "search": {
			System.out.println("Enter the song that you want to search");
			scan.nextLine();
			song = scan.nextLine();
			multiplayer.search(arraylist, song);
			
			break;
			
		}
		case "play": {
			System.out.println("Enter the song that you want to play");
			scan.nextLine();
			song = scan.nextLine();
			
			multiplayer.Play(arraylist, song);
			
			break;

		}
		case "add": {
			System.out.println("enter the song that you want to add");
			scan.nextLine();
			song = scan.nextLine();
			multiplayer.addSong(songList, song);
			System.out.println("======Song List=====");
			user.display(songList);
		
			break;
			

		}
		case "delete": {
			System.out.println("Enter the song that you want to delete");
			scan.nextLine();
			song = scan.nextLine();
			multiplayer.delete(songList, song);
			System.out.println("======Song List======");
			user.display(songList);
			
			break;
			

		}
		case "display":{
			System.out.println("======Song List======");
			user.display(songList);
			System.out.println("=====================");

			break;
			
		}
		case "exit":{
			count++;
			break;
		}
			
		default:{	
			System.out.println("Please try again");
			main(null);
		}
			
		}
		}while(count==0);
		}

	}
