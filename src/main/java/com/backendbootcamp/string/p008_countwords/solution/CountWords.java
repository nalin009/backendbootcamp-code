package com.backendbootcamp.string.p008_countwords.solution;

public class CountWords {

	public static void main(String[] args) {
		String sentence = "   This is a sample    sentence with several words.  ";
		
		String[] words = sentence.trim().split("\\s+");
		
		System.out.println("Number of words: " + words.length);

	}

}
