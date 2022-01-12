package com.te.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		HashMap<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1, "Ramya");
		hashMap.put(2, "Sunny");
		hashMap.put(3, "Jackie");
		hashMap.put(2, "Emmy");//replaces Sunny
		Set<Integer> keySet = hashMap.keySet();
		
		for(Integer i : keySet) {
			System.out.println("Keys "+i+", values : "+hashMap.get(i));
		}
		
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		
		for(Entry<Integer, String> s : entrySet) {
			System.out.println(s);
		}
		
	}

}
