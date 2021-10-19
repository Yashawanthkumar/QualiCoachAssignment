package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initializer {
	
	public WebDriver driver;
	public Properties properties;

	public WebDriver setUp() throws IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
		properties = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		properties.load(fis);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
}
