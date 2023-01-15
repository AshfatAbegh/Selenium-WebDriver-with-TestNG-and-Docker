package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.facebook.com/");
		  
		  Actions act = new Actions(driver);
		  
		  WebElement Unm = driver.findElement(By.xpath("//input[@id='email']"));
		  
          WebElement Pwd = driver.findElement(By.id("pass"));
          
          WebElement log = driver.findElement(By.name("login"));
          
          act.moveToElement(Unm).sendKeys("rl@gmail.com").build().perform();
          act.moveToElement(Pwd).sendKeys("3565").build().perform();
          log.click();
	}

}
