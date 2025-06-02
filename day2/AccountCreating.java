package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreating {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Chandrika");
		driver.findElement(By.name("lastname")).sendKeys("Manimuthu");
		driver.findElement(By.name("reg_email__")).sendKeys("9987867454");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Pa$$word");
		WebElement dateDrop = driver.findElement(By.id("day"));
		Select dropdown=new Select(dateDrop);
		dropdown.selectByValue("14");
		WebElement monthDrop = driver.findElement(By.id("month"));
		Select dropdown2=new Select(monthDrop);
		dropdown2.selectByIndex(10);
		WebElement yearDrop = driver.findElement(By.id("year"));
		Select dropdown3 = new Select(yearDrop);
		dropdown3.selectByContainsVisibleText("1994");
		driver.findElement(By.xpath("//input[@value=1]")).click();	
	}

}
