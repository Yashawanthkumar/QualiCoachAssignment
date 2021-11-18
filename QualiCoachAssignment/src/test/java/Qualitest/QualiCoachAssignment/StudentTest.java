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
import pageobjects.student.CertificateBadgeFeedbackPage;
import pageobjects.student.EditStudentProfile;
import pageobjects.student.EnroleForCoursePage;
import resources.Initializer;

/*
 * StudentTest is Test class.It has all the performance/actions that a student can perform
 * as per the requirements given.
 * Author : Yashawantkumar Hodlur
 * Date : 16/Oct/2021
 */

public class StudentTest extends Initializer {
	
	/*
	 * init is method and it is used to initialize the driver and 
	 * properties file(resource bundle).
	 * It always runs before the every test cases present in the StudentTest class
	 */
	
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
		System.out.println("In valid");
	}
	
	@Test(dependsOnMethods={"validstudentPageAutomation"})
	public void enroleToCourse()
	{
		CertificateBadgeFeedbackPage.getToHome(driver).click();
		//Assert.assertEquals(driver.getTitle(),"");
		WebElement courseSelect=EnroleForCoursePage.getCourseButton(driver);
		Actions actions=new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		EnroleForCoursePage.getShowAllButton(driver).click();
		js.executeScript("window.scrollBy(0,1600)");
		actions.moveToElement(courseSelect).click().build().perform();		
		try
		{
			EnroleForCoursePage.getEnrolButton(driver).click();
	    }
		catch (Exception e)
		{
	    	System.out.println("Exception caught in : "+e.getMessage()+" ,User is already enroled for the course");
	    }
		System.out.println("In enrole to course");
	}
	
	@Test(dependsOnMethods = {"validstudentPageAutomation"})
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
		
		System.out.println("In edit profile");
	}
	
	@Test(dependsOnMethods={"validstudentPageAutomation","getFeedbackBadge"})
	public void getFeedbackCertificate() throws InterruptedException
	{
		CertificateBadgeFeedbackPage.getCertificateHome(driver).click();
		//Assert.assertEquals(driver.getTitle(),"");
		WebElement courseSelect=CertificateBadgeFeedbackPage.getCourseButton(driver);
		Actions actions=new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		EnroleForCoursePage.getShowAllButton(driver).click();
		js.executeScript("window.scrollBy(0,2000)");
		actions.moveToElement(courseSelect).click().build().perform();
		
		WebElement certificateScroll = CertificateBadgeFeedbackPage.getCertifiacteButton(driver);
		actions.moveToElement(certificateScroll).click().build().perform();
		
		WebElement getCertificateButton = CertificateBadgeFeedbackPage.getCertifiacte(driver);
		actions.moveToElement(getCertificateButton).click().build().perform();
		Thread.sleep(2000);
		
		WebElement downloadCertificate= CertificateBadgeFeedbackPage.downloadCertifiacte(driver);
		actions.moveToElement(downloadCertificate).click().build().perform();	

		System.out.println("In get certificate");
	}
	
	@Test(dependsOnMethods = {"validstudentPageAutomation"})
	public void getFeedbackBadge()
	{
		CertificateBadgeFeedbackPage.getCertificateHome(driver).click();
		WebElement courseSelect=CertificateBadgeFeedbackPage.getCourseButton(driver);
		Actions actions=new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		EnroleForCoursePage.getShowAllButton(driver).click();
		js.executeScript("window.scrollBy(0,2000)");
		actions.moveToElement(courseSelect).click().build().perform();
		
		WebElement badgeAndFeedback = CertificateBadgeFeedbackPage.getBadgeAndFeedbcak(driver);
		actions.moveToElement(badgeAndFeedback).click().build().perform();
		
		WebElement badgeView = CertificateBadgeFeedbackPage.getBadge(driver);
		actions.moveToElement(badgeView).click().build().perform();
		
		WebElement feedBack = CertificateBadgeFeedbackPage.feedBack(driver);
		actions.moveToElement(feedBack).click().build().perform();
		
		try {
		WebElement feedButton = CertificateBadgeFeedbackPage.getFillButton(driver);
		actions.moveToElement(feedButton).click().build().perform();
		
		WebElement firstFeedback= CertificateBadgeFeedbackPage.getFirstFeedback(driver);
		actions.moveToElement(firstFeedback).click().build().perform();
		
		WebElement secondFeedback= CertificateBadgeFeedbackPage.getSecondFeedback(driver);
		actions.moveToElement(secondFeedback).click().build().perform();
		
		WebElement saveFeedback= CertificateBadgeFeedbackPage.saveFeedback(driver);
		actions.moveToElement(saveFeedback).click().build().perform();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught in Feedback method : User already given feedback");
		}
		System.out.println("In badge and feedback");
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
		System.out.println("In invalid");
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
		
		System.out.println("In invalid ");
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
		
		System.out.println("In numeric");
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
		
		System.out.println("In empty");
	}
//
//	@AfterTest
//	public void closeDriver() {
//		driver.close();
//	}
}