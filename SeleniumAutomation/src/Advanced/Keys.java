package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://milonic.com/login.php");
	
	      Actions act = new Actions(driver); 
		  driver.findElement(By.name("email")).sendKeys("ashfat");
		  
		  act.click(driver.findElement(By.name("email")))
		  .keyDown(org.openqa.selenium.Keys.CONTROL)
		  .sendKeys("a")
		  .sendKeys("c")
		  .keyUp(org.openqa.selenium.Keys.CONTROL)
		  .click(driver.findElement(By.name("password")))
		  .keyDown(org.openqa.selenium.Keys.CONTROL)
		  .sendKeys("v")
		  .keyUp(org.openqa.selenium.Keys.CONTROL)
		  .build().perform();
		  
		  driver.findElement(By.xpath("//input[@type='image']")).click();
	}

}
