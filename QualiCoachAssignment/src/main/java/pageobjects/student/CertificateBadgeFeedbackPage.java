package pageobjects.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CertificateBadgeFeedbackPage {
	
	//get certificate for enroled course which has crossed 60% in quizzes
	static By courseButton =By.xpath("//div[@cat-id='3']/a/p[text()='ISTQB-ISEB']"); 
	
	//scroll down to get certificate
	static By certifiacteButton =By.xpath("//div[@class='content']/div[@id='accordion']/div[8]");
	
	// get certificate 
	static By getCertificateButton =By.xpath("//div[@class='content']/div[@id='accordion']/div[8]/div[2]/div/ul/li/a ");
	
	//download certificate
	static By downloadCertificateButton	=By.xpath("//div[@role='main']/div/div/form/div/input[@type='submit']");
	
	//to get badge and feedback button from scroll view
	static By badgeAndFeedbcak=By.xpath("//div[@class='content']/div[@id='accordion']/div[7]");
	
	//to get badge and feedback button from scroll view
	static By viewBadge=By.xpath("//div[@class='content']/div[@id='accordion']/div[7]/div[2]/div/ul/li[1]/a ");
	
	//to get badge and feedback button from scroll view
	static By feedBack=By.xpath("//div[@class='content']/div[@id='accordion']/div[7]/div[2]/div/ul/li[2]/a ");
	
	//To fill the feedback form
	static By fillFeedback=By.xpath("//div[@class='complete-feedback']/a");
	
	//To fill first feedback form
	static By firstFeedback=By.xpath("//input[@id='id_multichoice_335_0_1']");
	
	//To fill second feedback form
	static By secondFeedback=By.xpath("//input[@id='id_multichoice_336_0_1']");
	
	//To save feedback form
	static By saveFeedback=By.xpath("//input[@id='id_savevalues']");
	
	public static WebElement saveFeedback(WebDriver driver)
	{
		return driver.findElement(saveFeedback);
	}
	
	public static WebElement getFirstFeedback(WebDriver driver)
	{
		return driver.findElement(firstFeedback);
	}
	
	public static WebElement getSecondFeedback(WebDriver driver)
	{
		return driver.findElement(secondFeedback);
	}
	
	public static WebElement getFillButton(WebDriver driver)
	{
		return driver.findElement(fillFeedback);
	}
	
	public static WebElement getBadge(WebDriver driver)
	{
		return driver.findElement(viewBadge);
	}
	
	public static WebElement feedBack(WebDriver driver)
	{
		return driver.findElement(feedBack);
	}
	
	public static WebElement getBadgeAndFeedbcak(WebDriver driver)
	{
		return driver.findElement(badgeAndFeedbcak);
	}
	
	public static WebElement downloadCertifiacte(WebDriver driver)
	{
		return driver.findElement(downloadCertificateButton);
	}
	
	public static WebElement getCertifiacte(WebDriver driver)
	{
		return driver.findElement(getCertificateButton);
	}
	
	public static WebElement getCertifiacteButton(WebDriver driver)
	{
		return driver.findElement(certifiacteButton);
	}
	
	public static WebElement getCourseButton(WebDriver driver)
	{
		return driver.findElement(courseButton);
	}
}
