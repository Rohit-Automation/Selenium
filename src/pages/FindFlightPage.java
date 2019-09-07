package pages;

import org.openqa.selenium.By;

import mainScript.DriverScript;

public class FindFlightPage  extends locators{

	public static void findFLight() {

		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		selectItemFromList(By.name("passCount"), "2");

		selectItemFromList(By.name("fromPort"), "Frankfurt");
		selectItemFromList(By.name("fromMonth"), "Feb");
		selectItemFromList(By.name("fromDay"), "8");
		selectItemFromList(By.name("toPort"), "London");
		selectItemFromList(By.name("toMonth"), "Feb");
		selectItemFromList(By.name("toDay"), "9");
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
	
	}

}
