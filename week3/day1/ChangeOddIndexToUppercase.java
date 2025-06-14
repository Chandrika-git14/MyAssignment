package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		
		int lengthOfString = test.length();
		System.out.println("The length of the string is "+lengthOfString);
		
		//String to a character array.
		char[] charArray = test.toCharArray();
		System.out.println(charArray);
		
for (int i = 0; i < test.length(); i++) {
			if (i%2 !=0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
				
			}
				System.out.println(charArray[i]);
			}
		}
		
	}


