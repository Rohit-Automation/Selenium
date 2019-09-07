package mainScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

import ElementCollections.locators;
import pages.BookFlightPage;
import pages.FindFlightPage;
import pages.HomePage;

public class DriverScript {

	public static WebDriver driver;

	@BeforeTest
	
	public void launchBrowser() {
		String browser="firefox";
		if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		//locator is class which have all 
		//@FindBy locators...
		locators obj=new locators();
		
		//To initialize all @FindBy.. we need
		// driver... since we want to convert 
		//@FIndBy into dirver.findElement(By.name(""))
		PageFactory.initElements(driver, obj);
		
		/*
		HomePage.launchApp();
		HomePage.login();
		FindFlightPage.findFLight();
		
		BookFlightPage.logout();
		HomePage.closeBrowser();*/
		
	}
	
	
	
	public static void selectItemFromList(By locator, String item) {
		WebElement lstCountry = driver.findElement(locator);
		Select lst = new Select(lstCountry);
		lst.selectByVisibleText(item);
	}

}
