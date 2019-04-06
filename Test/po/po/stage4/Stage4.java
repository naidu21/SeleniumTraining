package po.stage4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.annotations.AfterMethod;

public class Stage4 {
  @Test
  public void f() {
	  public class GmailLoginPO extends LoadableComponent<GmailLoginPO> {
		  @FindBy (id = "loginname")
		  @CacheLookup
		  //private WebElement username = driver.findElement(By.id ("loginname"));
		  @FindBy (id = "loginpassword")
		  private WebElement userpass;
		  
		  @FindBy (id = "loginbutton")
		  private WebElement loginButton;
		  
		  @FindBy (tagName = "a")
		  private List<WebElement>alltags;
		  
		  private WebDriver driver ;

		private Object expectedTitle;
		  
		  public GmailLoginPO () {
		  
	  }

		@Override
		protected void load() {
			// TODO Auto-generated method stub
			driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		}
			
		

		@Override
		protected void isLoaded() throws Error {
			// TODO Auto-generated method stub
			assertEquals(driver.getTitle(),expectedTitle);
			
		
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
