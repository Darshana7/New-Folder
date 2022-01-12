package com.te.multiplayer;

import java.util.HashSet;
import java.util.Iterator;

public class SongsList {
	
	public static void main(String[] args) {
		HashSet<Songs> hashSet = new HashSet<>();
		hashSet.add(new Songs("Perfect", "Ed Sheran", 3.54));
		hashSet.add(new Songs("Raabta", "Arijit", 3.59));
		hashSet.add(new Songs("Closer", "Chainsmoker", 4.16));
		hashSet.add(new Songs("Makhna", "Asees Kaur", 3.26));
		hashSet.add(new Songs("Addicted", "Enrique", 4.36));
		
		Iterator iterator=hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
