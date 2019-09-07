package ElementCollections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class locators {

	//########### HOme & Login Page Locator###
	@FindBy(linkText="Home")
	public static WebElement lnkHome;
	
	@FindBy(linkText="SIGN-ON")
	public static WebElement lnkSIGNON;
	
	@FindBy(name="userName")
	public static WebElement txtUserName;
	
	@FindBy(name="password")
	public static WebElement txtPassword;
	
	@FindBy(name="login")
	public static WebElement btnLogin;
	
	//############### Register Page Locator###
	@FindBy(linkText="REGISTER")
	public static WebElement lnkRegister;
	
	@FindBy(name="firstName")
	public static WebElement txtFirstName;
	
	
	
}
