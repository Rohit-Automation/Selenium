package pages;

import org.openqa.selenium.By;

import ElementCollections.locators;
import mainScript.DriverScript;

public class LoginPage  extends locators{

	public static void login() {
		// *******************Login into MercuryTour System*******************
		/*		driver.findElement(By.linkText("SIGN-ON")).click();
	driver.findElement(By.name("userName")).sendKeys("Priyanka_8");
		driver.findElement(By.name("password")).sendKeys("priya@123");
		driver.findElement(By.name("login")).click();
	*/
		lnkSIGNON.click();
		txtUserName.sendKeys("Rohit");
		txtPassword.sendKeys("Rohit");
		btnLogin.click();
			
	}

}
