package Qualitest.QualiCoachAssignment;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.AdminPage;
import resources.Initializer;

public class AdminTest extends Initializer {

	@BeforeTest
	public void init() throws IOException
	{
		driver=setUp();
	}

	@Test
	public void validAdminPageAutomation() throws IOException
	{
		driver.get(properties.getProperty("url"));
		//calling AdminPage page object to get web elements
		AdminPage AdminPage=new AdminPage();
		AdminPage.getUsername(driver).sendKeys("admin73");
		AdminPage.getPassword(driver).sendKeys("Admin@6100");
		AdminPage.getLoginButton(driver).click();
		//To confirm that user is logged in successfully or not
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Qualicoach");
	}

	@Test(dependsOnMethods = {"validAdminPageAutomation"})
	public void createNewUser() throws IOException, InterruptedException
	{
		AdminPage adminPage=new AdminPage();
		adminPage.getProfile(driver).click();
		Thread.sleep(1000L);
		adminPage.getSwitchRoleButton(driver).click();
		Thread.sleep(1000L);
		adminPage.getUserTabButton(driver).click();
		Thread.sleep(1000L);
		adminPage.getSiteAdminUser(driver).click();
		Thread.sleep(1000L);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		adminPage.getAddNewUserButton(driver).click();
		Thread.sleep(1000L);
		String username="Megharaj";
		adminPage.getUsernameField(driver).sendKeys(username.toLowerCase());
		Thread.sleep(1000L);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000L);
		adminPage.getUserNewPasswordButton(driver).click();
		adminPage.getUserNewPasswordField(driver).sendKeys("megharaj420");
		adminPage.getFirstnameField(driver).sendKeys("Megharaj");
		adminPage.getLastnameField(driver).sendKeys("Salagar");
		adminPage.getEmailField(driver).sendKeys("megharaj420@yahoo.com");
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(1000L);
		adminPage.getCreateUserButton(driver).click();
	}
	
	@Test(dependsOnMethods = {"validAdminPageAutomation"})
	public void editUsersInformation() throws InterruptedException
	{
		AdminPage adminPage=new AdminPage();
		adminPage.getProfile(driver).click();
		Thread.sleep(1000L);
		adminPage.getSwitchRoleButton(driver).click();
		Thread.sleep(1000L);
		adminPage.getUserTabButton(driver).click();
		Thread.sleep(1000L);
		adminPage.getSiteAdminUser(driver).click();
		Thread.sleep(1000L);
	}
	
	//	@Test
	//	public void inValidPassword() throws IOException
	//	{
	//		driver.get(properties.getProperty("url"));
	//		//calling AdminPage page object to get web elements
	//		AdminPage AdminPage=new AdminPage();
	//		AdminPage.getUsername(driver).sendKeys("user87");
	//		AdminPage.getPassword(driver).sendKeys("user");
	//		AdminPage.getLoginButton(driver).click();
	//		
	//		//To confirm that error message is displaying or not
	//		Assert.assertTrue((AdminPage.getErrorMessage(driver).isDisplayed()));
	//	}
	//	
	//	@Test
	//	public void inValidUsername() throws IOException
	//	{
	//		driver.get(properties.getProperty("url"));
	//		//calling AdminPage page object to get web elements
	//		AdminPage AdminPage=new AdminPage();
	//		AdminPage.getUsername(driver).sendKeys("user");
	//		AdminPage.getPassword(driver).sendKeys("User@9135");
	//		AdminPage.getLoginButton(driver).click();
	//	
	//		//To confirm that error message is displaying or not
	//		Assert.assertTrue((AdminPage.getErrorMessage(driver).isDisplayed()));
	//	}
	//	
	//	@Test
	//	public void numericValues() throws IOException
	//	{
	//		driver.get(properties.getProperty("url"));
	//		//calling AdminPage page object to get web elements
	//		AdminPage AdminPage=new AdminPage();
	//		AdminPage.getUsername(driver).sendKeys("792");
	//		AdminPage.getPassword(driver).sendKeys("263d8h");
	//		AdminPage.getLoginButton(driver).click();
	//		
	//		//To confirm that error message is displaying or not
	//		Assert.assertTrue((AdminPage.getErrorMessage(driver).isDisplayed()));
	//	}
	//	
	//	@Test
	//	public void emptyFields() throws IOException
	//	{
	//		driver.get(properties.getProperty("url"));
	//		//calling AdminPage page object to get web elements
	//		AdminPage AdminPage=new AdminPage();
	//		AdminPage.getUsername(driver).sendKeys("");
	//		AdminPage.getPassword(driver).sendKeys("");
	//		AdminPage.getLoginButton(driver).click();
	//		
	//		//To confirm that error message is displaying or not
	//		Assert.assertTrue((AdminPage.getErrorMessage(driver).isDisplayed()));
	//	}
	//	
	//	@AfterTest
	//	public void closeDriver()
	//	{
	//		driver.close();
	//	}
}