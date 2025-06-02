package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreditLead {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tristha Global");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Chandrika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manimuthu");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Engineer");
		driver.findElement(By.className("smallSubmit")).click();
driver.close();
	}

}
