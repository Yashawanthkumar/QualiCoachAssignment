package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditStudentProfile {
	
	//to click on the profile button in the list of menu from student image
	static By profileButton=By.xpath("//a[@data-title='profile,moodle']");
	
	//To navigate to student information page to edit information
	static By editProfileButton=By.xpath("//li[@class='editprofile']/span");
	
	//To select a particular option from drop down
	static By emailDisplayOptions =By.xpath("//select[@id='id_maildisplay']/option[3]");
	
	//To edit user email display type in edit user profile page
	static By emailDisplay=By.xpath("//select[@id='id_maildisplay']"); 
	
	//To get description element to edit user profile
	static By descriptionElement=By.id("id_description_editoreditable");
	
	//To get student name
	static By nameOfStudent=By.xpath("//div[@role='main']/h2");
	
	//To get update profile button
	static By updateProfileButton=By.name("submitbutton");
	
	public static WebElement getProfileButton(WebDriver driver)
	{
		return driver.findElement(profileButton);
	}
	
	public static WebElement getEditProfile(WebDriver driver)
	{
		return driver.findElement(editProfileButton);
	}
	
	public static WebElement getEmailDisplayOptions(WebDriver driver)
	{
		return driver.findElement(emailDisplayOptions);
	}
	
	public static WebElement getEmailDisplay(WebDriver driver)
	{
		return driver.findElement(emailDisplay);
	}
	
	public static WebElement getDescriptionBox(WebDriver driver)
	{
		return driver.findElement(descriptionElement);
	}
	
	public static String getnameOfStudent(WebDriver driver)
	{
		return driver.findElement(nameOfStudent).getText();
	}
		
	public static WebElement getUpdateProfileButton(WebDriver driver)
	{
		return driver.findElement(updateProfileButton);
	}
}
