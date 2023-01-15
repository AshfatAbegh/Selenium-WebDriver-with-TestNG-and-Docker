package WebDriver_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  
		  //driver.get("https://www.google.com/?gws_rd=ssl");
		    driver.navigate().to("https://www.google.com/");
		  
		  driver.findElement(By.linkText("Images")).click();
		  Thread.sleep(2000);
		  
		  driver.navigate().back();
		  Thread.sleep(1000);
		  System.out.println("Back Done");
		  
		  driver.navigate().forward();
		  Thread.sleep(1000);
		  System.out.println("Forward Done");
		  
		  driver.navigate().refresh();
		  System.out.println("Refresh Done");
	}

}
