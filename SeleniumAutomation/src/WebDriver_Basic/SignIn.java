package WebDriver_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignIn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.get("https://ema-john-react-website-project.netlify.app/");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//a[contains(text(),'Manage Inventory')]")).click();
		  Thread.sleep(2000);
		  
		  //==============SignIn Testing Using Email & Password=================  
		  driver.findElement(By.name("email")).sendKeys("araf85@gmail.com");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("password")).sendKeys("12345");
		  Thread.sleep(2000);
		  
		  WebElement SignIn = driver.findElement(By.xpath("//input[@type='submit']"));
		  SignIn.click();
		  
		  String signin = " ";
		  if(signin==" ") {
			  System.out.println("Bug Found:" + SignIn);
		  }
		  else{
			  driver.findElement(By.xpath("//button[contains(text(),'Button for Facebook Log in')]")).click();
			  System.out.println("SignIn Successful");
		  }  
		  
	}

}
