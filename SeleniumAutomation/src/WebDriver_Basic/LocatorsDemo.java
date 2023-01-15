package WebDriver_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.facebook.com/");
		  
		  WebElement Unm = driver.findElement(By.id("email"));
		  Unm.sendKeys("Welcome");
		  
		  WebElement Pwd = driver.findElement(By.name("pass"));
	      Pwd.sendKeys("test");
	      
	     //driver.findElement(By.className("inputtext")); ===>locator using classsName
	    // driver.findElement(By.tagName("input")); ===>locator using tagName
	
	     driver.findElement(By.linkText("Forgotten password?")).click();
	   //driver.findElement(By.partialLinkText("Forgotten")).click();
	}

}
