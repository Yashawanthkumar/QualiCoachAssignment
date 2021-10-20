package pageobjects.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditUserInformation {
	
	//to click on Add filter to search user name in list of users
	static By searchresults=By.xpath("//table[@id='users']/tbody/tr/td[1]");
	
	//to click on edit (gear) button
	static By editGearButton=By.xpath("//img[@title='Edit']");
	
	
	public static WebElement getSearchedResult(WebDriver driver)
	{
		return driver.findElement(searchresults);
	}
	
	public static WebElement getEditGearButton(WebDriver driver)
	{
		return driver.findElement(editGearButton);
	}
}
