package gird;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Seleuniumtest {
	RemoteWebDriver driver;
	
		
  @Test
  public void f() {
	  driver.get("http://selenium-examples.nichethyself.com/");
	  WebElement username = driver.findElement(By.id("loginname"));
	  username.sendKeys("stc123");
	  driver.findElement(By.id("loginpassword")).sendKeys("12345");
	  driver.findElement(By.id("loginbutton")).click();

	  String expectedTitle = "My account";
	  String actualTitle = driver.getTitle();


	  if (expectedTitle.equals(actualTitle))
	  	System.out.println("Login Test Case Passed.!");
	  else
	  	System.out.println("Login Test Case Failed.!");
	  
       assertEquals(actualTitle, expectedTitle,"Login Test Case Failed.!");
	  
	  	

	  
  }
  @BeforeMethod
  public void beforeMethod() {
	//  System.setProperty("webdriver.chrome.driver","C:\\Users\\Girish.naidu\\eclipse-workspace\\webdrivertraining\\Test\\resources\\chromedriver.exe");
	  
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setBrowserName("chrome");
	  
	  try {
		driver=new RemoteWebDriver(new URL("http://192.168.0.111:4444/wd/hub"),capabilities);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
	  /*driver = new ChromeDriver();
	  driver.manage().window().maximize();//
*/  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }
  }

