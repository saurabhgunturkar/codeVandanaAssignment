package codeVandana.java;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
	
	public static void shuffleArray(int[] array) {
		int n = array.length;
		Random random = new Random();
		
		for(int i =0; i < n; i++) {
			int randomIndex = i + random.nextInt(n - i); 
			int temp = array[i]; 
			array[i]=array[randomIndex]; 
			array[randomIndex] = temp;	
		}
		
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		shuffleArray(array);
		System.out.println("Shuffle array is : "+ Arrays.toString(array));
	}
	

	


}
