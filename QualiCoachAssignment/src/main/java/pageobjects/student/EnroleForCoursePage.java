package pageobjects.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnroleForCoursePage {
	
	// to get show all button to see all avilable courses 
	static By courseShowButton=By.id("all");
	
	// to select required course  
	static By courseButton =By.xpath("//div[@cat-id='3']/a/p[text()='ReadyAPI']");
		
	// to select required course  
	static By ebrolButton =By.id("id_submitbutton");

	public static WebElement getEnrolButton(WebDriver driver)
	{
		return driver.findElement(ebrolButton);
	}
		
	public static WebElement getCourseButton(WebDriver driver)
	{
		return driver.findElement(courseButton);
	}
	
	public static WebElement getShowAllButton(WebDriver driver)
	{
		return driver.findElement(courseShowButton);
	}
	
}
