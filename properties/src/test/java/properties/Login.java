package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver =null;
	Properties prop = null;
	
	@BeforeMethod
	
	public void Setup() throws IOException {
		 prop = new Properties();
			File f = new File("D:\\Learning\\properties\\projectdata.properties");
			FileInputStream fis = new FileInputStream(f);
			prop.load(fis);
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get(prop.getProperty("url"));
		    WebElement MyAccountOption = driver.findElement(By.xpath("//span[text()='My Account']"));
		    MyAccountOption.click();
		   WebElement RegisterOption = driver.findElement(By.linkText("Login"));
		   RegisterOption.click();
		
	}
	@AfterMethod
	public void tearDon() {
		if(driver!=null) {
			driver.quit();
		}
	}
	@Test
	public void validLogin() {
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
	}

}
