package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/ashfatrashid/Downloads/Selenium Chrome Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("ashfatabegh100@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(2000);
		String at = driver.getTitle();
		String et = "gmail";
//		driver.close();
		
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful");
		}
		else {
			System.out.println("Test Failure");
		}
	}

}
