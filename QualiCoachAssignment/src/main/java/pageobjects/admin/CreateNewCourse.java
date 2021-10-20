package pageobjects.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewCourse {
	
	//to click on add user button from site administration user tab
	static By  addNewUserButton=By.xpath("//a[text()='Add a new user']");
	
	//to add user(enter user name field)
	static By usernameField =By.xpath("//input[@name='username']");
	
	//to enter user password
	static By userNewPasswordButton =By.xpath("//em[contains(text(),'Click to enter text')]");
	
	//to enter user password
	static By userNewPasswordField =By.id("id_newpassword");
	
	//to add user(enter first name field)
	static By firstnameField =By.xpath("//input[@name='firstname']");
	
	//to add user(enter last name field)
	static By lastnameField =By.xpath("//input[@name='lastname']");
			
	//to add user(enter email field)
	static By emailField =By.xpath("//input[@name='email']");
	
	//to click create user button
	static By createUserButton =By.xpath("//input[@name='submitbutton']");
	
	public static WebElement getAddNewUserButton(WebDriver driver)
	{
		return driver.findElement(addNewUserButton);
	}
	
	public static WebElement getUsernameField(WebDriver driver)
	{
		return driver.findElement(usernameField);
	}
	
	public static WebElement getUserNewPasswordButton(WebDriver driver)
	{
		return driver.findElement(userNewPasswordButton);
	}
	
	public static WebElement getUserNewPasswordField(WebDriver driver)
	{
		return driver.findElement(userNewPasswordField);
	}
	
	public static WebElement getFirstnameField(WebDriver driver)
	{
		return driver.findElement(firstnameField);
	}	
	
	public static WebElement getEmailField(WebDriver driver)
	{
		return driver.findElement(emailField);
	}
	
	public static WebElement getLastnameField(WebDriver driver)
	{
		return driver.findElement(lastnameField);
	}
	
	public static WebElement getCreateUserButton(WebDriver driver)
	{
		return driver.findElement(createUserButton);
	}
}
