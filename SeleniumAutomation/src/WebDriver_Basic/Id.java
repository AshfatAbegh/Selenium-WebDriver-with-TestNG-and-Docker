package WebDriver_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Id {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
		 WebElement Unm = driver.findElement(By.id("email"));//Web Elements By Id
		 Unm.sendKeys("rahim@gmail.com");
		 
		 driver.findElement(By.name("pass")).sendKeys("tests1");//Web Elements By Email; 
	      
		 driver.findElement(By.name("login")).click();//Web Elements By Login; 
	}

}
