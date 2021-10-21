package pageobjects.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewDownloadReportPage {
	
	static By dashBoard=By.xpath("//span[@id='actionmenuaction-1']");
	
	static By getCourse=By.xpath("//a[@alt='Grades of resources']");
	
	static By downloadReport=By.xpath("//div[@class='centerpara']/a/img[@alt='csv']");
	
	public static WebElement downloadReport(WebDriver driver)
	{
		return driver.findElement(downloadReport);
	}
	public static WebElement getCourse(WebDriver driver)
	{
		return driver.findElement(getCourse);
	}
	
	public static WebElement getDashBoard(WebDriver driver)
	{
		return driver.findElement(dashBoard);
	}
}
