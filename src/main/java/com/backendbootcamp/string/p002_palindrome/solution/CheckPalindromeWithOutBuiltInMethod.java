package com.backendbootcamp.string.p002_palindrome.solution;

public class CheckPalindromeWithOutBuiltInMethod {

	public static void main(String[] args) {
		String name = "madamq";

		int nameLength = name.length() - 1;
		int left = 0;
		boolean isPalindrome = true;

		while (left < nameLength) {
			if (name.charAt(left) != name.charAt(nameLength)) {
				isPalindrome = false;
				break;
			}

			left++;
			nameLength--;
		}

		System.out.println("Given String is Palindrome : " + isPalindrome);
	}

}
