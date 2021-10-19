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

	//to click on the profile button in the list of menu from student image
	By profileButton=By.xpath("//a[@data-title='profile,moodle']");

	//To navigate to student information page to edit information
	By editProfileButton=By.xpath("//li[@class='editprofile']/span");
	
	//To edit user email display type in edit user profile page
	By emailDisplay=By.xpath("//select[@id='id_maildisplay']"); 
	
	//To select a particular option from drop down
	By emailDisplayOptions =By.xpath("//select[@id='id_maildisplay']/option[3]");
	
	//To get description element to edit user profile
	By descriptionElement=By.id("id_description_editoreditable");
	
	//To get student name
	By nameOfStudent=By.xpath("//div[@role='main']/h2");
	
	//To get student place
	By placeOfStudent=By.name("city");
	
	//To get update profile button
	By updateProfileButton=By.name("submitbutton");
	
	public WebElement getUpdateProfileButton(WebDriver driver)
	{
		return driver.findElement(updateProfileButton);
	}
	
	public String getplaceOfStudent(WebDriver driver)
	{
		return driver.findElement(placeOfStudent).getText();
	}
	
	public String getnameOfStudent(WebDriver driver)
	{
		return driver.findElement(nameOfStudent).getText();
	}
	
	public WebElement getDescriptionBox(WebDriver driver)
	{
		return driver.findElement(descriptionElement);
	}
	
	public WebElement getEmailDisplayOptions(WebDriver driver)
	{
		return driver.findElement(emailDisplayOptions);
	}
	
	public WebElement getEmailDisplay(WebDriver driver)
	{
		return driver.findElement(emailDisplay);
	}
	
	public WebElement geteditProfile(WebDriver driver)
	{
		return driver.findElement(editProfileButton);
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
	
	public WebElement getProfileButton(WebDriver driver)
	{
		return driver.findElement(profileButton);
	}
}
