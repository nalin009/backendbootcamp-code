package com.backendbootcamp.string.p009_reversewords.solution;

public class ReverseWords {

	public static void main(String[] args) {
		String sentence = "Java is powerful";
		
		String[] words = sentence.replaceAll("[^a-zA-Z0-9 ]", "").trim().split("\\s+");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=words.length-1; i>=0;i--) {
			sb.append(words[i]);
			if(i != 0){
				sb.append(" ");
			}
		}
		
		System.out.println("Reverse Words in a Sentence: "+sb.toString());
	}

}
