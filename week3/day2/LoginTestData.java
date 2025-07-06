package week3.day2;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Enter Username");
	}

	public void enterPassword() {
		System.out.println("Enter Password");

	}
	public static void main(String[] args) {
		TestData testDataOptions = new TestData();
		System.out.println("The below list are super class action");
		testDataOptions.enterCredentials();
		testDataOptions.navigateToHomePage();
		
		System.out.println("*********************************");
		
		LoginTestData loginTestDataOptions = new LoginTestData();
		System.out.println("The below list are sub class action");
		loginTestDataOptions.enterCredentials();
		loginTestDataOptions.navigateToHomePage();
		loginTestDataOptions.enterPassword();
		loginTestDataOptions.enterUsername();
	}

}
