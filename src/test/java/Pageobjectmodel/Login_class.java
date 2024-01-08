package Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_class {

	//create Constructor
	   public static WebDriver driver;
	   public Login_class( WebDriver driver) {
	       Login_class.driver=driver;
	       PageFactory.initElements(driver,this );
	       
	   }
	   
	   @FindBy(id="username")
	   WebElement txtusername;
	   
	   @FindBy(id="password")
	   WebElement txtpassword;
	   
	   @FindBy(id="login")
	   WebElement btnLogin;
	   
	   //create corresponding methods
	   public void setUsername() {
	       txtusername.sendKeys("sainathD");
	   }
	   public void setPassword() {
	       txtpassword.sendKeys("Sai@1234");
	   }
	   public void ClickLoginbtn() {
	       btnLogin.click();
	   }
	   
}
