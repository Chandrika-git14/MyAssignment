package week3.day1;

import java.util.Arrays;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class FindingMissingElement {

	public static void main(String[] args) {
		//Declaring an array
		int input [] = {1, 4,3,2,8, 6, 7};
		
		//To find the length of Array
		int lengthOfInput = input.length;
		System.out.println("The length of arrays is " +lengthOfInput);
		
		//Sort the array
		Arrays.sort(input);
		
		//Looping condition
		for (int i = 0; i < lengthOfInput-1; i++) {
			
			// Finding the missing element
			if (input[i+1] != input[i]+1) {
				System.out.println("The missing element is input " +(input[i]+1)); 
				
			}
		}
		
		
	}
}

