package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import ElementCollections.locators;
import mainScript.DriverScript;

public class RegisterPage  extends locators{

	public static void registration() 
	{

		//driver.findElement(By.linkText("REGISTER")).click(); //
		
		lnkRegister.click();
		txtFirstName.sendKeys("Rohit");
		
		//driver.findElement(By.name("firstName")).sendKeys("Priyanka");
		/*driver.findElement(By.name("lastName")).sendKeys("Saroch");
		driver.findElement(By.name("phone")).sendKeys("9960353757");
		driver.findElement(By.name("email")).sendKeys("priyankasaroch@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Ekunj residency, baner");
		driver.findElement(By.name("city")).sendKeys("Pune");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		driver.findElement(By.name("postalCode")).sendKeys("421001");
		new Select(driver.findElement(By.name("country"))).selectByVisibleText("INDIA ");
		driver.findElement(By.name("userName")).sendKeys("Priyanka_8");
		driver.findElement(By.name("password")).sendKeys("priya@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("priya@123");
		driver.findElement(By.name("register")).click();
*/	}


}
