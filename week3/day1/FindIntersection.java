package week3.day1;

import java.util.Iterator;

public class FindIntersection {

	public static void main(String[] args) {
	//Declare An array
	int a[] = {3,2,11,4,6,7};
	int b[] = {1,2,8,4,9,7};
	
	//to find the length of array
	int lengthOfArray_a = a.length;
	System.out.println("The length of array(a) is " +lengthOfArray_a);
 
	int lengthOfArray_b = b.length;
	System.out.println("The length of array(b) is " +lengthOfArray_b);
	
	//nested for loop
	for (int i = 0; i < lengthOfArray_a; i++) {
	for (int j = 0; j <lengthOfArray_b; j++) {
		
		//Compare both array	
		if (a[i] == b[j]) {
				System.out.println(a[i]);
			}
		}
	}
	}
}
