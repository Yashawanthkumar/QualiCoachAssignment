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
		
		//A admin profile image
		By profile=By.xpath("//span[@class='userbutton']");
		
		//to get switch role button
		By switchRoleButton=By.id("actionmenuaction-7");
		
		//to click on users tab
		By userTab=By.xpath("//div[@id='dashboard_flip']/ul/li[4]");
		
		//to click on site administration user tab
		By siteAdminUser=By.xpath("/html/body/section/div[2]/div/ul/li[2]");
		
		//to click on add user button from site administration user tab
		By  addNewUserButton=By.xpath("//a[text()='Add a new user']");
		
		//to add user(enter user name field)
		By usernameField =By.xpath("//input[@name='username']");
		
		//to add user(enter first name field)
		By firstnameField =By.xpath("//input[@name='firstname']");
		
		//to add user(enter last name field)
		By lastnameField =By.xpath("//input[@name='lastname']");
		
		//to add user(enter email field)
		By emailField =By.xpath("//input[@name='email']");
		
		//to click create user button
		By createUserButton =By.xpath("//input[@name='submitbutton']");
		
		//to enter user password
		By userNewPasswordButton =By.xpath("//em[contains(text(),'Click to enter text')]");
		
		//to enter user password
		By userNewPasswordField =By.id("id_newpassword");
		
		public WebElement getUserNewPasswordField(WebDriver driver)
		{
			return driver.findElement(userNewPasswordField);
		}
		
		public WebElement getUserNewPasswordButton(WebDriver driver)
		{
			return driver.findElement(userNewPasswordButton);
		}
		
		public WebElement getCreateUserButton(WebDriver driver)
		{
			return driver.findElement(createUserButton);
		}
		
		public WebElement getEmailField(WebDriver driver)
		{
			return driver.findElement(emailField);
		}
		
		public WebElement getLastnameField(WebDriver driver)
		{
			return driver.findElement(lastnameField);
		}
		
		public WebElement getFirstnameField(WebDriver driver)
		{
			return driver.findElement(firstnameField);
		}
		
		public WebElement getUsernameField(WebDriver driver)
		{
			return driver.findElement(usernameField);
		}
		
		public WebElement getAddNewUserButton(WebDriver driver)
		{
			return driver.findElement(addNewUserButton);
		}
		
		public WebElement getSiteAdminUser(WebDriver driver)
		{
			return driver.findElement(siteAdminUser);
		}
		
		public WebElement getUserTabButton(WebDriver driver)
		{
			return driver.findElement(userTab);
		}
		
		public WebElement getProfile(WebDriver driver)
		{
			return driver.findElement(profile);
		}
		
		public WebElement getSwitchRoleButton(WebDriver driver)
		{
			return driver.findElement(switchRoleButton);
		}
		
		public WebElement getUsername(WebDriver driver)
		{
			return driver.findElement(userName);
		}

		public WebElement getPassword(WebDriver driver)
		{
			return driver.findElement(password);
		}

		public WebElement getLoginButton(WebDriver driver)
		{
			return driver.findElement(loginButton);
		}
}