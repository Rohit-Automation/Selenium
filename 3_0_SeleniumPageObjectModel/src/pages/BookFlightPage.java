package pages;

import org.openqa.selenium.By;

import ElementCollections.locators;
import mainScript.DriverScript;

public class BookFlightPage  extends locators{
	public static void bookFlight(){
		driver.findElement(By.name("passFirst0")).sendKeys("Priyanka");
		driver.findElement(By.name("passLast0")).sendKeys("saroch");
		driver.findElement(By.name("creditnumber")).sendKeys("");
		driver.findElement(By.name("buyFlights")).click();
		//---------------------------------------------------

	}
	

	public static void logout() {
		driver.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();
	}

}
