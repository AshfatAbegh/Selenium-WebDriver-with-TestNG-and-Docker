package WebDriver_Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.facebook.com/");
		  
		  WebElement xpath = driver.findElement(By.xpath("//a[@id='u_0_0_zv']"));
		  xpath.click();
		  
		  Select d1 = new Select(xpath);
		  //d1.selectByIndex(3);
		  d1.selectByValue("2");
		  //d1.selectByVisibleText("Day");
		  
		  //=============================
		  
		  List<WebElement> dd = d1.getOptions();
		  System.out.println(dd.size());
		  
		  for(int i=0; i<dd.size(); i++) 
		  {  
			  String txt = dd.get(i).getText();
			  System.out.println(txt);
			  dd.get(i).click();
		  }
	}

}
