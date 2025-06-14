package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		String companyName = "TestLeaf";
		
		//string to charArray
		char[] charArray = companyName.toCharArray();
		//System.out.println(charArray[2]);
		
		for (int i = charArray.length-1; i >=0; i--) {
			System.out.println(charArray[i]);
		}
	}

}
