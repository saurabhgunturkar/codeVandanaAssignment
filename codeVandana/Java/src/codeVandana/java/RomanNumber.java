package codeVandana.java;

public class RomanNumber {
	
	int value(char roman) {
		if(roman=='I') {
			return 1;
		}
		if(roman=='V') {
			return 5;
		}
		if(roman=='X') {
			return 10;
		}
		if(roman=='L') {
			return 50;
		}
		if(roman=='C') {
			return 100;
		}
		if(roman=='D') {
			return 500;
		}
		if(roman=='M') {
			return 1000;
		}
		return -1;
	}
	
	int romanToInteger(String str) {
		
		int total = 0;
		
		for(int i = 0; i<str.length(); i++) {
			int n1 = value(str.charAt(i));
			
			if(i+1 < str.length()) {
				int n2 = value(str.charAt(i+1));
				
				if(n1>=n2) {
					total=total+n1;
				}else {
					total = total + n2 - n1;
				}
			}else {
				total = total+n1;
			}
			
		}
		
		return total;
		
	}
	
	

}
