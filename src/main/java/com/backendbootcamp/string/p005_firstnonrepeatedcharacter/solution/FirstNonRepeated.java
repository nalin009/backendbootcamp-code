package com.backendbootcamp.string.p005_firstnonrepeatedcharacter.solution;

import java.util.Map;
import java.util.HashMap;

public class FirstNonRepeated {

	public static char nonRepeating(String name) {
		// sanitize input
		name = name.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		// find the non repeated Character
		Map<Character, Integer> seen = new HashMap<>();

		for (char ch : name.toCharArray()) {
			seen.put(ch, seen.getOrDefault(ch, 0) + 1);
		}

		for (char ch : name.toCharArray()) {
			if (seen.get(ch) == 1) {
				return ch;
			}
		}

		return '-';
	}

	public static void main(String[] args) {
		String name = "Nalin Sahu";
		char ch = nonRepeating(name);
		System.out.println("Non Repeated Character : "+ch);

	}

}
