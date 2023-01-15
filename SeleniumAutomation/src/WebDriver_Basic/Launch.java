package WebDriver_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {
  public static void main(String[] args) {
	  
	  System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.get("https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/");
  }
}
