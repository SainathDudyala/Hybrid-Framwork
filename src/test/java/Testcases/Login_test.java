package Testcases;

import org.testng.annotations.*;

import Pageobjectmodel.Login_class;

public class Login_test extends Baseclass {
	@Test
	   public void logintest() throws InterruptedException {
	   Login_class lp=new Login_class(driver);
	   lp.setUsername();
       Thread.sleep(2000);
       lp.setPassword();
       Thread.sleep(2000);
       lp.ClickLoginbtn();
      
  }

}
