package pageobjects.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteSelectedUser {
	
	// to delete selected user
	static By userDeleteButton=By.xpath("//img[@title='Delete']");
			
	//to delete from alert button
	static By deleteFromAlertButton=By.xpath("//input[@value='Delete']");
			
	public static WebElement deleteFromAlert(WebDriver driver)
	{
		return driver.findElement(deleteFromAlertButton);
	}
	
	public static WebElement getDeleteButton(WebDriver driver)
	{
		return driver.findElement(userDeleteButton);
	}

}
