package Test;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/ashfatrashid/Downloads/Selenium Chrome Driver/chromedriver");
		   
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.edureka.co/");
		   TakesScreenshot ts = (TakesScreenshot)driver;
		   File source = ts.getScreenshotAs(OutputType.FILE);
		   System.out.println("Screenshot is taken");
		   driver.quit();
	}

}
