package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Class {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/ashfatrashid/Downloads/Selenium Chrome Driver/chromedriver");
		   
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.edureka.co/");
		   //driver.manage().window().maximize();
		   driver.findElement(By.xpath("//header/nav[1]/ul[1]/li[2]/a[1]")).click();
	       Robot robot = new Robot();
	       Thread.sleep(3000);
	       robot.keyPress(KeyEvent.VK_DOWN);
	       Thread.sleep(4000);
	       robot.keyPress(KeyEvent.VK_TAB);
	       Thread.sleep(4000);
	       System.out.println("a");
	       robot.keyPress(KeyEvent.VK_TAB);
	       Thread.sleep(4000);
	       System.out.println("b");
	       robot.keyPress(KeyEvent.VK_TAB);
	       Thread.sleep(4000);
	       System.out.println("c");
	       robot.mouseMove(30, 100);
	       System.out.println("d");
	       driver.quit();	       
	}

}
