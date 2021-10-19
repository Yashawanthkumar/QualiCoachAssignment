package Qualitest.QualiCoachAssignment;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.StudentPage;
import resources.Initializer;

public class StudentTest extends Initializer {
	
	@BeforeTest
	public void init() throws IOException
	{
		driver=setUp();
	}
	
	@Test
	public void validstudentPageAutomation() throws IOException
	{
		driver.get(properties.getProperty("url"));
		//calling studentPage page object to get web elements
		StudentPage studentPage=new StudentPage();
		studentPage.getUsername(driver).sendKeys("user90");
		studentPage.getPassword(driver).sendKeys("User@0129");
		studentPage.getLoginButton(driver).click();
		//To confirm that user is logged in successfully or not
		Assert.assertEquals(driver.getTitle(),"Qualicoach");
	}
	
	@Test
	public void editProfile() throws IOException, InterruptedException
	{
		StudentPage studentPage=new StudentPage();
	    studentPage.getProfile(driver).click();
	    Thread.sleep(2000L);
	    studentPage.getProfileButton(driver).click();
	    Thread.sleep(2000L);
	    studentPage.geteditProfile(driver).click();
	    Thread.sleep(1000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		WebElement dropdown=studentPage.getEmailDisplay(driver);
		Select options=new Select(dropdown);
		dropdown.click();
		options.selectByIndex(2);
		dropdown.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		studentPage.getDescriptionBox(driver).clear();
		studentPage.getDescriptionBox(driver).sendKeys("My full name is "+studentPage.getnameOfStudent(driver));
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,800)");
		studentPage.getUpdateProfileButton(driver).click();
	}
	
//	@Test
//	public void inValidPassword() throws IOException
//	{
//		driver.get(properties.getProperty("url"));
//		//calling studentPage page object to get web elements
//		StudentPage studentPage=new StudentPage();
//		studentPage.getUsername(driver).sendKeys("user87");
//		studentPage.getPassword(driver).sendKeys("user");
//		studentPage.getLoginButton(driver).click();
//		
//		//To confirm that error message is displaying or not
//		Assert.assertTrue((studentPage.getErrorMessage(driver).isDisplayed()));
//	}
//	
//	@Test
//	public void inValidUsername() throws IOException
//	{
//		driver.get(properties.getProperty("url"));
//		//calling studentPage page object to get web elements
//		StudentPage studentPage=new StudentPage();
//		studentPage.getUsername(driver).sendKeys("user");
//		studentPage.getPassword(driver).sendKeys("User@9135");
//		studentPage.getLoginButton(driver).click();
//	
//		//To confirm that error message is displaying or not
//		Assert.assertTrue((studentPage.getErrorMessage(driver).isDisplayed()));
//	}
//	
//	@Test
//	public void numericValues() throws IOException
//	{
//		driver.get(properties.getProperty("url"));
//		//calling studentPage page object to get web elements
//		StudentPage studentPage=new StudentPage();
//		studentPage.getUsername(driver).sendKeys("792");
//		studentPage.getPassword(driver).sendKeys("263d8h");
//		studentPage.getLoginButton(driver).click();
//		
//		//To confirm that error message is displaying or not
//		Assert.assertTrue((studentPage.getErrorMessage(driver).isDisplayed()));
//	}
//	
//	@Test
//	public void emptyFields() throws IOException
//	{
//		driver.get(properties.getProperty("url"));
//		//calling studentPage page object to get web elements
//		StudentPage studentPage=new StudentPage();
//		studentPage.getUsername(driver).sendKeys("");
//		studentPage.getPassword(driver).sendKeys("");
//		studentPage.getLoginButton(driver).click();
//		
//		//To confirm that error message is displaying or not
//		Assert.assertTrue((studentPage.getErrorMessage(driver).isDisplayed()));
//	}
//	
//	@AfterTest
//	public void closeDriver()
//	{
//		driver.close();
//	}
}