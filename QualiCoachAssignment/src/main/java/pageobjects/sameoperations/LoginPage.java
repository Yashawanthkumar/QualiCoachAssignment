package pageobjects.sameoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
			
			// login credential(user name)
			static By userName= By.id("username");

			// login credential(Password)
			static By password= By.id("password");

			//login button
			static By loginButton=By.id("loginbtn");
			
			//to get Error message for invalid login
			static By invalidMessage=By.xpath("//span[@class='error']");
			
			public static WebElement getUsername(WebDriver driver)
			{
				return driver.findElement(userName);
			}

			public static WebElement getPassword(WebDriver driver)
			{
				return driver.findElement(password);
			}

			public static WebElement getLoginButton(WebDriver driver)
			{
				return driver.findElement(loginButton);
			}
			
			public static WebElement getErrorMessage(WebDriver driver)
			{
				return driver.findElement(invalidMessage);
			}
}
