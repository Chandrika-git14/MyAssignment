package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		String companyName = "TestLeaf";
		String reverseName =""; 
		
		
		
		//string to charArray
		char[] charArray = companyName.toCharArray();
		//System.out.println(charArray[2]);
		
		for (int i = charArray.length-1; i >=0; i--) {
			reverseName=reverseName+charArray[i];
		}
		System.out.println("The reversed Name is "+reverseName);
	}

}
