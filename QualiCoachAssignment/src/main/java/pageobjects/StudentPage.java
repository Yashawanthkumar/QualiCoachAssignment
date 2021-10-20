package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StudentPage {

	//student login credential(user name)
	By userName= By.id("username");

	//student login credential(Password)
	By password= By.id("password");

	//login button
	By loginButton=By.id("loginbtn");

	//Verify whether message is showing or not
	By invalidMessage=By.xpath("//span[@class='error']");

	//A student profile image
	By profile=By.xpath("//span[@class='userbutton']");
	
	//To get student place
	By placeOfStudent=By.name("city");
	
	
	
	public String getplaceOfStudent(WebDriver driver)
	{
		return driver.findElement(placeOfStudent).getText();
	}	
	
	public WebElement getProfile(WebDriver driver)
	{
		return driver.findElement(profile);
	}

	public WebElement getUsername(WebDriver driver)
	{
		return driver.findElement(userName);
	}

	public WebElement getPassword(WebDriver driver)
	{
		return driver.findElement(password);
	}

	public WebElement getLoginButton(WebDriver driver)
	{
		return driver.findElement(loginButton);
	}

	public WebElement getErrorMessage(WebDriver driver)
	{
		return driver.findElement(invalidMessage);
	}
}
