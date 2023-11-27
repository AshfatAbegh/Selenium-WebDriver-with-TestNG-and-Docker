package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectors_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "/home/ashfatrashid/Downloads/Selenium Chrome Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Oneplus 11");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("guitar");
		//driver.findElement(By.cssSelector("#gh-btn")).click();
		WebElement searchIcon = driver.findElement(By.xpath("//input[@id='gh-btn']"));
		searchIcon.click();
		js.executeScript("window.scrollBy(0,900)");
	}

}
