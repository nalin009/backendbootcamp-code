package com.backendbootcamp.string.p004_characterfrequency.solution;

import java.util.Map;
import java.util.HashMap;

public class CountCharacterFrequency {

	public static void main(String[] args) {
		String name = "Hello ";

	      //sanitize input
	      name = name.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

	      //count frequency
	      Map<Character, Integer> seen = new HashMap<>();

	      for(char ch : name.toCharArray()){
	        seen.put(ch, seen.getOrDefault(ch,0)+1);
	      }

	      for(Map.Entry<Character, Integer> entry : seen.entrySet()){
	        System.out.println(entry.getKey() + " : " +entry.getValue());
	      }

	}

}
