package com.te.multiplayer2;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Multiplayer multiplayer = new Multiplayer();
		String function;
		String song;
		int count = 1;
		do{
			System.out.println("Type the function you want");
			System.out.println(">>>add\n>>>delete\n>>>play\n>>>search\n>>>display\n>>>exit");
			function = sc.next();
			
			switch (function) {
			
			case "add":{
				System.out.println("Add a song to playlist and id ");
				int id=sc.nextInt();
				sc.nextLine();
				song = sc.nextLine();
				multiplayer.add(id,song);
				break;
			}
			
			case "search":{
				System.out.println("Search a song from playlist");
				sc.nextLine();
				song = sc.nextLine();
				multiplayer.search(song);
				break;
			}
			
			case "play":{
				System.out.println("Play a song from playlist");
				sc.nextLine();
				song = sc.nextLine();
				multiplayer.play(song,multiplayer);
				break;
			}
			
			case "delete":{
				System.out.println("Delete a song from playlist");
				sc.nextLine();
				song = sc.nextLine();
				multiplayer.delete(song);
				break;
			}
			
			case "display":{
				multiplayer.display();
				break;
			}

			case "exit":
				count=0;
				break;
				
			default:
				System.out.println("Please check the function");
				break;
			}
		}
		
		while(count != 0);
	}
}