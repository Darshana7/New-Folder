package com.te.multiplayer;

import java.util.ArrayList;

public class Main extends Album{
	
	public static ArrayList<Album> albums = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Album album = new Album(name+ "Album1", artist+ "Xyz"); 
		
		album.addSong("Perfect", 3.54, "Ed Sheran");
		album.addSong("Raabta", 3.59,"Arijit");
		album.addSong("Closer", 4.16, "Chainsmoker");
		album.addSong("Makhna", 3.26, "Asees Kaur");
		album.addSong("Addicted", 4.36, "Enrique");
		album.add(albums);
		
		

	}

}
