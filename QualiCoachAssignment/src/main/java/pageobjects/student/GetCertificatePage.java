package pageobjects.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetCertificatePage {
	
	//get certificate for enroled course which has crossed 60% in quizzes
	static By courseButton =By.xpath("//div[@cat-id='3']/a/p[text()='ISTQB-ISEB']"); 
	
	//scroll down to get certificate
	static By certifiacteButton =By.xpath("//*[@id=\"heading8\"]/div/ul/li/a");
	
	// get certificate 
	static By getCertificateButton	=By.xpath("//*[@id=\"collapse8\"]/div/ul/li/a/div[2]");
	
	//download certificate
	static By downloadCertificateButton	=By.xpath("/html/body/div[3]/div/div/div/section/div[1]/div[2]/div/form/div/input[1]");
	
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
