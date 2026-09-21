package com.backendbootcamp.string.p003_vowelsandconsonants.solution;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		String name = "Nalin Sahu";
		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < name.length(); i++) {
			char ch = Character.toLowerCase(name.charAt(i));

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else {
				consonants++;
			}
		}

		System.out.println("Total Vowels : " + vowels);
		System.out.println("Total Consonants : " + consonants);
	}

}
