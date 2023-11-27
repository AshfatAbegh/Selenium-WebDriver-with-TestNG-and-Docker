package Test;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/ashfatrashid/Downloads/Selenium Chrome Driver/chromedriver");
		   
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.edureka.co/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   Thread.sleep(3000);
		   Actions builder = new Actions(driver);
		   builder.moveToElement(driver.findElement(By.xpath("//body/nav[1]/div[1]/a[1]/span[1]"))).build().perform();
		   Thread.sleep(3000);
		   driver.findElement(By.linkText("Software Testing")).click();
		   Thread.sleep(4000);
  }
}
