package week3.day2;

public class LoginPage extends BasePage{
	
	@Override
	public void performCommonTasks() {
		System.out.println("1. Perform the common task in login page");
	}
	
	public void login() {
		System.out.println("2. Login page");

	}
	
	public static void main(String[] args) {
		 BasePage basePageOption = new BasePage();
		 System.out.println("The below list are base page actions");
		 basePageOption.findElement();
		 basePageOption.clickElement();
		 basePageOption.enterText();
		 basePageOption.performCommonTasks();
	
		 System.out.println("----------------------------");
	 
		// Create LoginPage object and call its methods
   LoginPage loginPageOptions = new LoginPage();
   System.out.println("The below list are login page actions");
   loginPageOptions.findElement();          // Inherited from BasePage
   loginPageOptions.clickElement();         // Inherited from BasePage
   loginPageOptions.enterText();            // Inherited from BasePage
   loginPageOptions.performCommonTasks();   // Overridden in LoginPage
   loginPageOptions.login();                // Specific to LoginPage
	 

}
}