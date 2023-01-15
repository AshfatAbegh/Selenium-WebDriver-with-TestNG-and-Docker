package Test;

import org.testng.annotations.Test;

public class Practice4 {
   @Test
   public void WebLoginHomeLoan() 
   {
	   //Selenium
	   System.out.println("webloginhome");
   }
   
   @Test(groups = {"smoke"})
   public void MobileLoginHomeLoan() 
   {
	   //Appium
	   System.out.println("mobileloginhome");
   }
   
   @Test
   public void LoginAPIHomeLoan() 
   {
	   //Rest API Automation
	   System.out.println("restapilogihome");
   }
}
