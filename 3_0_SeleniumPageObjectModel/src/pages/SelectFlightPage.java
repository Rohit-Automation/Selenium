package pages;

import org.openqa.selenium.By;

import ElementCollections.locators;
import mainScript.DriverScript;

public class SelectFlightPage  extends locators{
	public static void selectFlight(){
		//-----------------------------------------------------
		//    	driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$191$723$7:08 pm$']")).click();
		driver.findElement(By.name("reserveFlights")).click();
		//------------------------------------------------------------

	}
}