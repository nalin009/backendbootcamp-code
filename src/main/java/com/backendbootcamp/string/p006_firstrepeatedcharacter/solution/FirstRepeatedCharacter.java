package com.backendbootcamp.string.p006_firstrepeatedcharacter.solution;

import java.util.Map;
import java.util.HashMap;

public class FirstRepeatedCharacter {
	
	public static char findRepeatedCharacter(String name){
	      //sanitize input
	      name = name.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

	      //Find First Repeated Character
	      Map<Character, Integer> seen = new HashMap<>();

	      for(char ch: name.toCharArray()){
	        seen.put(ch, seen.getOrDefault(ch,0)+1);
	      }

	      for(char ch: name.toCharArray()){
	        if(seen.get(ch) != 1){
	          return ch;
	        }
	      }

	      return '-';
	    }

	public static void main(String[] args) {
		String name = "Nalin Sahu";
	      char ch = findRepeatedCharacter(name);
	      System.out.println("Repeated Character is : "+ch);

	}

}
