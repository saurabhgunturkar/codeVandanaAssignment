package codeVandana.java;

import java.util.Scanner;

public class CheckPangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		boolean pangram = isPangram(input);
		if(pangram) {
			System.out.println("The input is a Pangram");
		}else {
			System.out.println("The input is not a Pangram");
		}
		
		sc.close();
	}
	
	public static boolean isPangram(String input) {
		 input = input.toLowerCase();
		 
		 boolean[] alphabets = new boolean[26];
		 
		 for(int i = 0; i < input.length(); i++) {
			 char c = input.charAt(i);
			 if(c >= 'a' && c <= 'z') {
				 alphabets[c - 'a']=true;
			 }
		 }
	
		 for(boolean letters : alphabets) {
			 if(!letters) {
				 return false;
			 }
		 }
		
		return true;
		
		
	}

}
