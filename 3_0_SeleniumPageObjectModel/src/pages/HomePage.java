package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ElementCollections.locators;
import mainScript.DriverScript;

public class HomePage extends locators{

	public static void launchApp(){
		DriverScript.driver.get("http://localhost/servlets/com.mercurytours.servlet.WelcomeServlet");
		String title=DriverScript.driver.getTitle();
		if(title.equalsIgnoreCase("Welcome: Mercury Tours"))
			System.out.println("Launch App-- Pass");
		else
			System.out.println("LaunchApp--Failed, expected title is.. whereas actual is "+title);
	}

	public static void closeBrowser(){
		DriverScript.driver.quit();
	}
	
	public static void login() {
		// *******************Login into MercuryTour System*******************
		/*driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.name("userName")).sendKeys("Rohit");
		driver.findElement(By.name("password")).sendKeys("Rohit");
		driver.findElement(By.name("login")).click();
		*/
		lnkSIGNON.click();
		txtUserName.sendKeys("Rohit");
		txtPassword.sendKeys("Rohit");
		btnLogin.click();
		
	}
	



}
