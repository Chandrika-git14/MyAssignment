package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "posts";
		
		//Check if the lengths of the two strings are equal
		int lengthOfString1 = text1.length();
		System.out.println("Length of strings(text1) is " +lengthOfString1);
		int lengthOfString2 = text2.length();
		System.out.println("Length of strings(text2) is " +lengthOfString2);
		
			if (lengthOfString1==lengthOfString2) {
				System.out.println("Lengths match, therefore the strings are an Anagram");
			} 
			else 
			{
System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			}
		
			//Convert both the strings to character arrays
			char[] charArray1 = text1.toCharArray();
			System.out.println(charArray1);
			
			char[] charArray2 = text2.toCharArray();
			System.out.println(charArray2);
			
			//Sort both the character arrays
			Arrays.sort(charArray1);
			System.out.println(charArray1);
			
			Arrays.sort(charArray2);
			System.out.println(charArray2);
			
			//Check if the sorted arrays are equal
			if (Arrays.equals(charArray1, charArray2)) {
				System.out.println("The given strings are Anagram.");
			} else {
System.out.println("The given strings are not an Anagram.");
			}
	}

}
