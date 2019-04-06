package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyFirstWebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;


System.setProperty("webdriver.chrome.driver","C:\\Users\\Girish.naidu\\eclipse-workspace\\webdrivertraining\\Test\\resources\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
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
	


	}
	

}
