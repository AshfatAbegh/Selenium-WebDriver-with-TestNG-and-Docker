package WebDriver_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Status {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.facebook.com/");
		  
		 WebElement img = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	     System.out.println(img.isDisplayed());
	     
	     System.out.println(img.isEnabled());
	     
	     System.out.println(img.isSelected());
	     
	     //====================================
	     
	     WebElement Unm = driver.findElement(By.id("email"));
	     Unm.sendKeys("Welcome");
	     Thread.sleep(4000);
	     Unm.clear();
	     Unm.sendKeys("rahim@gmail.com");
	}

}
