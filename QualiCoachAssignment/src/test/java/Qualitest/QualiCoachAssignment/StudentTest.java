package Qualitest.QualiCoachAssignment;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.sameoperations.LoginPage;
import pageobjects.sameoperations.SameOperations;
import pageobjects.student.EditStudentProfile;
import pageobjects.student.EnroleForCoursePage;
import pageobjects.student.GetCertificatePage;
import resources.CustomExceptions;
import resources.Initializer;

public class StudentTest extends Initializer {

	@BeforeTest
	public void init() throws IOException {
		driver = setUp();
	}
		
	@Test
	public void validstudentPageAutomation() throws IOException {
		
		driver.get(properties.getProperty("url"));
		
		// creating studentPage object to get required webelements
		
		LoginPage.getUsername(driver).sendKeys("user88");
		LoginPage.getPassword(driver).sendKeys("User@9146");
		LoginPage.getLoginButton(driver).click();
		
		// To confirm that user is logged in successfully or not
		Assert.assertEquals(driver.getTitle(), "Qualicoach");
	}
	
	@Test(dependsOnMethods = {"validstudentPageAutomation"})
	public void enroleToCourse() throws CustomExceptions
	{
		//Assert.assertEquals(driver.getTitle(),"");
		WebElement courseSelect=EnroleForCoursePage.getCourseButton(driver);
		Actions actions=new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		EnroleForCoursePage.getShowAllButton(driver).click();
		js.executeScript("window.scrollBy(0,1600)");
		actions.moveToElement(courseSelect).click().build().perform();
		
		try {
				EnroleForCoursePage.getEnrolButton(driver).click();
				System.out.println("User is enroled for the course");
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	    	CustomExceptions exception = new CustomExceptions("User is already enroled for the course");
	         throw exception;
	    }
	}
	
	@Test
	public void editProfile() throws IOException, InterruptedException {
		
		SameOperations.getProfile(driver).click();
		Thread.sleep(2000L);
		EditStudentProfile.getProfileButton(driver).click();
		Thread.sleep(2000L);
		EditStudentProfile.getEditProfile(driver).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");

		WebElement dropdown = EditStudentProfile.getEmailDisplay(driver);
		Select options = new Select(dropdown);
		dropdown.click();
		options.selectByIndex(2);
		dropdown.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		EditStudentProfile.getDescriptionBox(driver).clear();
		EditStudentProfile.getDescriptionBox(driver).sendKeys("My full name is "+ EditStudentProfile.getnameOfStudent(driver));
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,800)");
		EditStudentProfile.getUpdateProfileButton(driver).click();
	}
	
	@Test(dependsOnMethods = {"validstudentPageAutomation"})
	public void getCertificate()
	{
		//Assert.assertEquals(driver.getTitle(),"");
		WebElement courseSelect=GetCertificatePage.getCourseButton(driver);
		Actions actions=new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		EnroleForCoursePage.getShowAllButton(driver).click();
		js.executeScript("window.scrollBy(0,2000)");
		actions.moveToElement(courseSelect).click().build().perform();
		GetCertificatePage.getCertifiacteButton(driver).click();
		GetCertificatePage.getCertifiacte(driver).click();
		GetCertificatePage.downloadCertifiacte(driver).click();
	}

	@Test
	public void inValidPassword() throws IOException {
		driver.get(properties.getProperty("url"));
		// calling studentPage page object to get web elements
		
		LoginPage.getUsername(driver).sendKeys("user87");
		LoginPage.getPassword(driver).sendKeys("user");
		LoginPage.getLoginButton(driver).click();

		// To confirm that error message is displaying or not
		Assert.assertTrue((LoginPage.getErrorMessage(driver).isDisplayed()));
	}

	@Test
	public void inValidUsername() throws IOException {
		driver.get(properties.getProperty("url"));
		
		// calling studentPage page object to get web elements
		LoginPage.getUsername(driver).sendKeys("user");
		LoginPage.getPassword(driver).sendKeys("User@9135");
		LoginPage.getLoginButton(driver).click();

		// To confirm that error message is displaying or not
		Assert.assertTrue((LoginPage.getErrorMessage(driver).isDisplayed()));
	}

	@Test
	public void numericValues() throws IOException {
		driver.get(properties.getProperty("url"));
		
		// calling studentPage page object to get web elements
		LoginPage.getUsername(driver).sendKeys("792");
		LoginPage.getPassword(driver).sendKeys("263d8h");
		LoginPage.getLoginButton(driver).click();

		// To confirm that error message is displaying or not
		Assert.assertTrue((LoginPage.getErrorMessage(driver).isDisplayed()));
	}

	@Test
	public void emptyFields() throws IOException {
		driver.get(properties.getProperty("url"));
		// calling studentPage page object to get web elements
	
		LoginPage.getUsername(driver).sendKeys("");
		LoginPage.getPassword(driver).sendKeys("");
		LoginPage.getLoginButton(driver).click();

		// To confirm that error message is displaying or not
		Assert.assertTrue((LoginPage.getErrorMessage(driver).isDisplayed()));
	}

//	@AfterTest
//	public void closeDriver() {
//		driver.close();
//	}
}