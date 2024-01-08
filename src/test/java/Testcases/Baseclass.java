package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class Baseclass {

	public WebDriver driver;
	   
	   @BeforeClass
	   public void openApplication() {
	       driver=new EdgeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       driver.get("https://adactinhotelapp.com");
	       driver.manage().window().maximize();
	   }
	   
	   @AfterClass
	   public void CloseApplication() {
	       driver.close();
	   }
	   
}
