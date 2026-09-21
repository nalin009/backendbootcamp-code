package com.backendbootcamp.string.p001_reversestring.solution;

public class ReverseStringUsingMethod {

	public static void main(String[] args) {
		String name = "Nalin Sahu 1 ";

		// sanitize string
		name = name.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		// reverse() method
		String reverse = new StringBuilder(name).reverse().toString();

		System.out.println("Original : " + name);
		System.out.println("Reversed : " + reverse);

	}

}
