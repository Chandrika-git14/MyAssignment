package week3.day1;

import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";

		//Split the text
		String[] split = text.split(" ");
		System.out.println(split[5]);//
		
		 for (int i = 0; i < split.length; i++) {
	            for (int j = i + 1; j < split.length; j++) {
	                if (split[i].equals(split[j])) {
	                    System.out.println(split[i]);
		
				}
			}

		}
	}

}
