package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage {
	
		// login credential(user name)
		By userName= By.id("username");

		// login credential(Password)
		By password= By.id("password");

		//login button
		By loginButton=By.id("loginbtn");
		
		//to click on course tab to create new course
		By courseTab=By.xpath("/html/body/section/div[2]/div/ul/li[3]");
		
		//to get Error message for invalid login
		By invalidMessage=By.xpath("//span[@class='error']");
		
		//to get course management button to add course
		By courseManage=By.xpath("//a[text()='Manage courses and categories']");
		
		//to create new category
		By createCategory=By.xpath("//a[text()='Create new category']");
		
		//to name the new category through field
		By newCategoryNameField=By.xpath("//input[@id='id_name']");
		
		//to name the new category through field
		By createCategoryButton=By.xpath("//input[@name='submitbutton']");
		
		//to create new course in new created category
		By createNewCourse=By.xpath("//a[text()='Create new course']");
		
		//to get course full name field for new created course
		By fullNameOfCourse=By.id("id_fullname");
		
		//to get course short name field for new created course
		By shortNameOfCourse=By.id("id_shortname");
		
		//to add course description of newly created course
		By descritpionOfCourse=By.id("id_summary_editoreditable");
		
		//to click on save and display button
		By saveAndDisplay=By.name("saveanddisplay");
		
		
		
		public WebElement getSaveAndDisplay(WebDriver driver)
		{
			return driver.findElement(saveAndDisplay);
		}
		
		public WebElement getDescriptionField(WebDriver driver)
		{
			return driver.findElement(descritpionOfCourse);
		}
		
		public WebElement getCourseFullName(WebDriver driver)
		{
			return driver.findElement(fullNameOfCourse);
		}
		
		public WebElement getCourseShortName(WebDriver driver)
		{
			return driver.findElement(shortNameOfCourse);
		}
		
		public WebElement getCreateNewCourse(WebDriver driver)
		{
			return driver.findElement(createNewCourse);
		}
		
		public WebElement getCreateCategoryButton(WebDriver driver)
		{
			return driver.findElement(createCategoryButton);
		}
		
		public WebElement getNameFieldCategory(WebDriver driver)
		{
			return driver.findElement(newCategoryNameField);
		}
		
		public WebElement getCreateCategory(WebDriver driver)
		{
			return driver.findElement(createCategory);
		}
		
		public WebElement getCourseManagement(WebDriver driver)
		{
			return driver.findElement(courseManage);
		}
		
		public WebElement getCourseTab(WebDriver driver)
		{
			return driver.findElement(courseTab);
		}
}