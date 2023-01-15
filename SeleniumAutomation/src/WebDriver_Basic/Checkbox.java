package WebDriver_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.amazon.com/");
		  
		  WebElement Srch = driver.findElement(By.id("twotabsearchtextbox"));
          Srch.sendKeys("samsung");
          
          driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
          driver.findElement(By.xpath("//li[@id='p_89/SAMSUNG']//span[@class='a-list-item']//a[@class='a-link-normal s-navigation-item']//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']//label//i[@class='a-icon a-icon-checkbox']")).click();
	}

}
