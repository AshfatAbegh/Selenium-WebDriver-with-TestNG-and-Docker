package WebDriver_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElements {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
		  String title = driver.getTitle();
		  System.out.println("Title is: "+ title);
		  
		 //============================
		  System.out.println(driver.getCurrentUrl());
		  
		  WebElement Unm = driver.findElement(By.id("email"));
		  System.out.println(Unm.getAttribute("id"));
		  System.out.println(Unm.getTagName());
	}

}
