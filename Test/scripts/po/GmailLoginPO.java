package scripts.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginPO {
	private WebElement username;
	private WebElement password;
	private WebElement loginbutton;
	private WebDriver driver;
	
	public GmailLoginPO() {
		System.setProperty ("webdriver.chromedriver","test\\resources\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}
	
	
	public String login (String user, String pass) {
		
		driver.findElement (By.id("Email or phone")).sendKeys(user);
		driver.findElement (By.id("loginpassword")).sendKeys(pass);
		driver.findElement (By.id("sumbit")).click();
		
		
			
		
			 
		}
		
		public String getTitle() {
			return driver.getTitle ();
		
		
		
		
		
	}
	
	

}
