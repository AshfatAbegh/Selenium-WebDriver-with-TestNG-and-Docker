package WebDriver_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

	public static void main(String[] args) {
		  System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.get("https://www.facebook.com/");

		  //driver.findElement(By.linkText("Forgotten password?")).click();
		  // driver.findElement(By.partialLinkText("Forgotten")).click();
		  
		  //driver.close(); //Close the parent window
		  //driver.quit(); //Close parent and child window
		  
		  //=============> xPath
		  //Relative -- based on using attribute == //input[@id='email']
		  //Absolute -- based on position == /html[1]/body[1]/div[1]/div[1]s/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]
		 
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Welcome");
		  
	}

}
