package WebDriver_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewUserSignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.get("https://ema-john-react-website-project.netlify.app/");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//a[contains(text(),'Manage Inventory')]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		  
		  //=============Entering Name for New User SignUp=============  
		  WebElement Name = driver.findElement(By.name("name"));
		  Thread.sleep(2000);
		  Name.sendKeys("Araf Islam");
		  
		  
		  //=============Entering Email for New User SignUp=============  
		  WebElement Email = driver.findElement(By.name("email"));
		  Thread.sleep(2000);
		  Email.sendKeys("araf85@gmail.com");
		  
		  //=============Entering Password for New User SignUp=============  
		  WebElement Password = driver.findElement(By.name("password"));
		  Thread.sleep(2000);
		  Password.sendKeys("12345");
		  
		  //=============New User SignUp Testing===================
		  WebElement SignUp = driver.findElement(By.xpath("//input[@type='submit']"));
		  SignUp.click();
		  
		  String signup = " ";
		  if(signup==" ") {
			  System.out.println("Bug Found:" + SignUp);
		  }
		  else{
			  System.out.println("SignUp Successful");
		  }
	}

}
