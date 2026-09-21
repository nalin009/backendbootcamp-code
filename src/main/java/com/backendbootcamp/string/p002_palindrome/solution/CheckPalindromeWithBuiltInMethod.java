package com.backendbootcamp.string.p002_palindrome.solution;

public class CheckPalindromeWithBuiltInMethod {

	public static void main(String[] args) {
		String name = "madam";
		
		StringBuilder sb = new StringBuilder(name);
		
		if(name.equals(sb.reverse().toString())) {
			System.out.println(name+" is Palindrome");
		}else {
			System.out.println(name+" is not Palindrome");
		}
	}

}
