package com.backendbootcamp.string.p007_removeduplicatecharacters.solution;

import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String name = "Nalin Sahu";
		
		//sanitize the input string
		name = name.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		//Remove Duplicate Characters
		Set<Character> seen = new LinkedHashSet<>();
		StringBuilder sb = new StringBuilder();
		
		for(char ch : name.toCharArray()){
			seen.add(ch);
		}
		
		for(char ch: seen){
			sb.append(ch);
		}
		
		System.out.println(sb.toString());

	}

}
