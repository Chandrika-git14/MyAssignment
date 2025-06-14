package week3.day1;

import java.util.Arrays;
import java.util.Iterator;

public class FindDuplicates {

	public static void main(String[] args) {
		int [] num= {2, 5, 7, 7, 5, 9, 2, 3};
		
	int lengthOfArray = num.length;
	System.out.println("The length is :" +lengthOfArray);
	
	Arrays.sort(num);
		System.out.println(num);
		
	for (int i = 0; i < num.length-1; i++) {
		if (num[i]== num[i+1]) {
		System.out.println(num[i]);	
		}
		
	}


	}

}
