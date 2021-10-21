package pageobjects.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCourse {

	//to click on course tab to create new course
	static	By courseTab=By.xpath("/html/body/section/div[2]/div/ul/li[3]");
	
	//to get Error message for invalid login
	static By invalidMessage=By.xpath("//span[@class='error']");
	
	//to get course management button to add course
	static By courseManage=By.xpath("//a[text()='Manage courses and categories']");
	
	//to create new category
	static By createCategory=By.xpath("//a[text()='Create new category']");
	
	//to name the new category through field
	static By newCategoryNameField=By.xpath("//input[@id='id_name']");
	
	//to name the new category through field
	static By createCategoryButton=By.xpath("//input[@name='submitbutton']");
	
	//to create new course in new created category
	static By createNewCourse=By.xpath("//a[text()='Create new course']");
	
	//to get course full name field for new created course
	static By fullNameOfCourse=By.id("id_fullname");
	
	//to get course short name field for new created course
	static By shortNameOfCourse=By.id("id_shortname");
	
	//to add course description of newly created course
	static By descritpionOfCourse=By.id("id_summary_editoreditable");
	
	//to click on save and display button
	static By saveAndDisplay=By.name("saveanddisplay");
	
	
	
	public static WebElement getSaveAndDisplay(WebDriver driver)
	{
		return driver.findElement(saveAndDisplay);
	}
	
	public static WebElement getDescriptionField(WebDriver driver)
	{
		return driver.findElement(descritpionOfCourse);
	}
	
	public static WebElement getCourseFullName(WebDriver driver)
	{
		return driver.findElement(fullNameOfCourse);
	}
	
	public static WebElement getCourseShortName(WebDriver driver)
	{
		return driver.findElement(shortNameOfCourse);
	}
	
	public static WebElement getCreateNewCourse(WebDriver driver)
	{
		return driver.findElement(createNewCourse);
	}
	
	public static WebElement getCreateCategoryButton(WebDriver driver)
	{
		return driver.findElement(createCategoryButton);
	}
	
	public static WebElement getNameFieldCategory(WebDriver driver)
	{
		return driver.findElement(newCategoryNameField);
	}
	
	public static WebElement getCreateCategory(WebDriver driver)
	{
		return driver.findElement(createCategory);
	}
	
	public static WebElement getCourseManagement(WebDriver driver)
	{
		return driver.findElement(courseManage);
	}
	
	public static WebElement getCourseTab(WebDriver driver)
	{
		return driver.findElement(courseTab);
	}
}
