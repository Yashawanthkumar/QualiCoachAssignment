package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * Pageobject SameOperations includes the common process that should be carried by
 * any user(student/admin) typebefore any operation. 
 */

public class SameOperations {
	
	//A admin profile image
	static By profile=By.xpath("//span[@class='userbutton']");
	
	//to get switch role button
	static By switchRoleButton=By.id("actionmenuaction-7");
	
	//to click on users tab
	static By userTab=By.xpath("//div[@id='dashboard_flip']/ul/li[4]");
	
	//to click on site administration user tab
	static By siteAdminUser=By.xpath("/html/body/section/div[2]/div/ul/li[2]");
	
	//to get list of users click on browse list of users
	static By browseUserList=By.xpath("//a[text()='Browse list of users']");
		
	//to get search user name in list of users
	static By searchInUserListField=By.xpath("//input[@id='id_realname']");
		
	//to click on Add filter to search user name in list of users
	static By addFilterButton=By.xpath("//input[@id='id_addfilter']");
		
	public static WebElement getProfile(WebDriver driver)
	{
		return driver.findElement(profile);
	}
	
	public static WebElement getSwitchRoleButton(WebDriver driver)
	{
		return driver.findElement(switchRoleButton);
	}
	
	public static WebElement getUserTabButton(WebDriver driver)
	{
		return driver.findElement(userTab);
	}
	
	public static WebElement getSiteAdminUser(WebDriver driver)
	{
		return driver.findElement(siteAdminUser);
	}
	
	public static WebElement getUserBrowserList(WebDriver driver)
	{
		return driver.findElement(browseUserList);
	}
	
	public static WebElement getSearchInUserListField(WebDriver driver)
	{
		return driver.findElement(searchInUserListField);
	}
	
	public static WebElement getAddFilterButton(WebDriver driver)
	{
		return driver.findElement(addFilterButton);
	}
}
