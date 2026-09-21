package com.backendbootcamp.string.p001_reversestring.solution;

public class ReverseStringWithOutUsingMethod {

	public static void main(String[] args) {
		String name = "1234";
		
		//sanitize string
		name = name.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		//reverse without using reverse()
		StringBuilder sb = new StringBuilder();
		int nameLenght = name.length()-1;
		
		
		for(int i=nameLenght; i>=0; i--) {
			sb.append(name.charAt(i));
		}
		
		System.out.println("Original : "+name);
		System.out.println("Reversed : "+sb.toString());

	}

}
