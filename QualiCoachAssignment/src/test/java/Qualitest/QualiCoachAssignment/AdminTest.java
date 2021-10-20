package Qualitest.QualiCoachAssignment;

//importing necessary packages

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.admin.AddCourse;
import pageobjects.admin.CreateNewCourse;
import pageobjects.admin.DeleteSelectedUser;
import pageobjects.admin.EditUserInformation;
import pageobjects.sameoperations.LoginPage;
import pageobjects.sameoperations.SameOperations;
import resources.Initializer;

public class AdminTest extends Initializer {

	@BeforeTest
	public void init() throws IOException {
		driver = setUp();
	}

	@Test
	public void validAdminPageAutomation() throws IOException {

		driver.get(properties.getProperty("url"));
		// calling AdminPage page object to get web elements
	
		LoginPage.getUsername(driver).sendKeys("admin73");
		LoginPage.getPassword(driver).sendKeys("Admin@6100");
		LoginPage.getLoginButton(driver).click();
		
		// To confirm that user is logged in successfully or not
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Qualicoach");
	}

	@Test(dependsOnMethods = {"validAdminPageAutomation"})
	public void createNewUser() throws IOException, InterruptedException {

		SameOperations.getProfile(driver).click();
		Thread.sleep(1000L);
		
		SameOperations.getSwitchRoleButton(driver).click();
		Thread.sleep(1000L);
		
		SameOperations.getUserTabButton(driver).click();
		Thread.sleep(1000L);
		
		SameOperations.getSiteAdminUser(driver).click();
		Thread.sleep(1000L);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		CreateNewCourse.getAddNewUserButton(driver).click();
		Thread.sleep(1000L);
		
		String username = "Megharaj";
		CreateNewCourse.getUsernameField(driver).sendKeys(username.toLowerCase());
		Thread.sleep(1000L);
		
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000L);
		CreateNewCourse.getUserNewPasswordButton(driver).click();
		CreateNewCourse.getUserNewPasswordField(driver).sendKeys("megharaj420");
		CreateNewCourse.getFirstnameField(driver).sendKeys("Megharaj");
		CreateNewCourse.getLastnameField(driver).sendKeys("Salagar");
		CreateNewCourse.getEmailField(driver).sendKeys("megharaj420@yahoo.com");
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(1000L);
		
		CreateNewCourse.getCreateUserButton(driver).click();
	}

	@Test(dependsOnMethods = { "validAdminPageAutomation" })
	public void editUsersInformation() throws InterruptedException {
		
		SameOperations.getProfile(driver).click();
		Thread.sleep(1000L);
		
		SameOperations.getSwitchRoleButton(driver).click();
		Thread.sleep(1000L);
		
		SameOperations.getUserTabButton(driver).click();
		Thread.sleep(1000L);
		
		SameOperations.getSiteAdminUser(driver).click();
		Thread.sleep(1000L);
		
		SameOperations.getUserBrowserList(driver).click();
		String username = "Megharaj";
		SameOperations.getSearchInUserListField(driver).sendKeys(username.toLowerCase());
		Thread.sleep(1000L);
		SameOperations.getAddFilterButton(driver).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Assert.assertEquals(EditUserInformation.getSearchedResult(driver).getText(), "Megharaj Salagar");
		EditUserInformation.getEditGearButton(driver).click();
		Assert.assertEquals(driver.getTitle(), "Qualicoach: Edit profile - Megharaj Salagar");
		Thread.sleep(3000L);
	}

	@Test(dependsOnMethods = { "validAdminPageAutomation" })
	public void deleteUser() throws InterruptedException {
		
		SameOperations.getProfile(driver).click();
		Thread.sleep(1000L);
		SameOperations.getSwitchRoleButton(driver).click();
		Thread.sleep(1000L);
		SameOperations.getUserTabButton(driver).click();
		Thread.sleep(1000L);
		SameOperations.getSiteAdminUser(driver).click();
		Thread.sleep(1000L);
	
		SameOperations.getUserBrowserList(driver).click();
		String username = "Megharaj";
		
		SameOperations.getSearchInUserListField(driver).sendKeys(username.toLowerCase());
		Thread.sleep(1000L);
		
		SameOperations.getAddFilterButton(driver).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Assert.assertEquals(EditUserInformation.getSearchedResult(driver).getText(), "Megharaj Salagar");
		DeleteSelectedUser.getDeleteButton(driver).click();
		DeleteSelectedUser.deleteFromAlert(driver).click();
		Thread.sleep(3000L);
		driver.switchTo().alert().accept();
	}

	@Test(dependsOnMethods = { "validAdminPageAutomation" })
	public void addCourse() throws InterruptedException {

		SameOperations.getProfile(driver).click();
		Thread.sleep(1000L);
		
		SameOperations.getSwitchRoleButton(driver).click();
		Thread.sleep(1000L);
		
		SameOperations.getUserTabButton(driver).click();
		Thread.sleep(1000L);
		
		AddCourse.getCourseTab(driver).click();
		Thread.sleep(1000L);
		
		AddCourse.getCourseManagement(driver).click();
		AddCourse.getCreateCategory(driver).click();
		AddCourse.getNameFieldCategory(driver).sendKeys("Java And Sql");
		Thread.sleep(2000L);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		AddCourse.getCreateCategoryButton(driver).click();
		Thread.sleep(1000L);
		
		AddCourse.getCreateNewCourse(driver).click();
		Thread.sleep(1000L);
		
		AddCourse.getCourseFullName(driver).sendKeys("Java And Sql concepts");
		Thread.sleep(1000L);
		
		AddCourse.getCourseShortName(driver).sendKeys("java");
		Thread.sleep(1000L);

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000L);

		AddCourse.getDescriptionField(driver).sendKeys("Welcome to java & sql concepts");
		Thread.sleep(2000L);
		
		js.executeScript("window.scrollBy(0,1300)");
		AddCourse.getSaveAndDisplay(driver).click();
	}

	@Test
	public void inValidPassword() throws IOException {
		driver.get(properties.getProperty("url"));
		// calling AdminPage page object to get web elements

		LoginPage.getUsername(driver).sendKeys("user87");
		LoginPage.getPassword(driver).sendKeys("user");
		LoginPage.getLoginButton(driver).click();

		// To confirm that error message is displaying or not
		Assert.assertTrue((LoginPage.getErrorMessage(driver).isDisplayed()));
	}

	@Test
	public void inValidUsername() throws IOException {

		driver.get(properties.getProperty("url"));
		
		// calling AdminPage page object to get web elements
		LoginPage.getUsername(driver).sendKeys("user");
		LoginPage.getPassword(driver).sendKeys("User@9135");
		LoginPage.getLoginButton(driver).click();

		// To confirm that error message is displaying or not
		Assert.assertTrue((LoginPage.getErrorMessage(driver).isDisplayed()));
	}

	@Test
	public void numericValues() throws IOException {
		
		driver.get(properties.getProperty("url"));
		
		// calling AdminPage page object to get web elements		
		LoginPage.getUsername(driver).sendKeys("792");
		LoginPage.getPassword(driver).sendKeys("263d8h");
		LoginPage.getLoginButton(driver).click();

		// To confirm that error message is displaying or not
		Assert.assertTrue((LoginPage.getErrorMessage(driver).isDisplayed()));
	}

	@Test
	public void emptyFields() throws IOException {
		
		driver.get(properties.getProperty("url"));
		
		// calling AdminPage page object to get web elements
		LoginPage.getUsername(driver).sendKeys("");
		LoginPage.getPassword(driver).sendKeys("");
		LoginPage.getLoginButton(driver).click();

		// To confirm that error message is displaying or not
		Assert.assertTrue((LoginPage.getErrorMessage(driver).isDisplayed()));
	}

	// @AfterTest
	// public void closeDriver()
	// {
	// driver.close();
	// }
}