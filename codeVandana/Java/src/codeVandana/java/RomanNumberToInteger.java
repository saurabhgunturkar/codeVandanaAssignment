package codeVandana.java;

import java.util.Scanner;

public class RomanNumberToInteger {

	public static void main(String[] args) {
		RomanNumber rn = new RomanNumber();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(rn.romanToInteger(str));
		
		

	}

}
