package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/ashfatrashid/Downloads/Selenium Chrome Driver/chromedriver");
		  WebDriver driver = new ChromeDriver();
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
