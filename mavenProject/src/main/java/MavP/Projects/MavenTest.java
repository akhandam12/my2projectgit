package MavP.Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MavenTest {
	public WebDriver driver;
	
	  @Test

	  public void openApp() throws InterruptedException {
	  driver.get("https://www.philips.co.uk/");
	  driver.manage().window().maximize();
	  Thread.sleep(6000);
	  
	  

	  } 
	  
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "F:\\selenium_ jars\\chromedriver.exe");
		  
		  driver = new ChromeDriver();
		 
	 
	  }

	  @AfterTest
	  public void afterTest() {
	  driver.close();
	  }

	

}
