package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

   public class Practice3 {
   @BeforeClass
   public void Bfrclass() 
   {
	 System.out.println("Before executing any method in the class");
   }
	
   @Parameters({"URL"})
   @Test
   public void WebLoginCarLoan(String urlname) 
   {
	   //Selenium
	   System.out.println("weblogincar");
	   System.out.println(urlname);
   }
   
   @BeforeMethod
   public void Beforeevery() 
   {
	   System.out.println("I will execute before every test method in practice3 class");
   }
   
   @AfterMethod
   public void Afterevery() 
   {
	   System.out.println("I will execute after every test method in practice3 class");
   }
   
   @AfterClass
   public void Afclass() 
   {
	   System.out.println("After executing all the method in the class");
   }
   
   @Test(groups = {"smoke"})
   public void MobileLoginCarLoan() 
   {
	   //Appium
	   System.out.println("mobilelogin");
   }
   
   @BeforeSuite
   public void  Bfsuite()
   {
	   System.out.println("Before execute");
   }
   
   @Test(enabled = false)//testng helper attribute(true/false)
   public void MobileSigninCarLoan() 
   {
	   //Appium
	   System.out.println("mobilesignin");
   }
   
   @Test(dataProvider = "getData")
   public void MobileSignoutCarLoan(String username, String password) 
   {
	   //Appium
	   System.out.println("mobilesignout");
	   System.out.println(username);
	   System.out.println(password);
   }
   
   @Test(dependsOnMethods = {"WebLoginCarLoan"})
   public void APICarLoan() 
   {
	   //Rest API Automation
	   System.out.println("apilogincar");
   }
   
   @DataProvider
   public Object[][] getData() 
   {
	   //1st combination - username & password - good credit history 
	  //2nd combination - username & password - no credit history 
	 //3rd combination - fraudelent credit history 
	   
	  Object[][] data = new Object[3][2]; //Multidimensional Object Array  
      
	  //1st set
	  data[0][0] = "firstsetusername";
      data[0][1] = "firstpassowrd";
   
      //2nd set
      data[1][0]= "secondsetusername";
      data[1][1]= "secondpassowrd";
      
      //3rd set
      data[2][0]= "thirdsetusername";
      data[2][1]= "thirdpassowrd";
      
      return data;
   }
   
}
