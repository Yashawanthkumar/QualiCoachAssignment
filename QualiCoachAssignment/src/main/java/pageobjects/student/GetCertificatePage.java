package pageobjects.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetCertificatePage {
	
	//get certificate for enroled course which has crossed 60% in quizzes
	static By courseButton =By.xpath("//div[@cat-id='3']/a/p[text()='ISTQB-ISEB']"); 
	
	public static WebElement getCourseButton(WebDriver driver)
	{
		return driver.findElement(courseButton);
	}
}
