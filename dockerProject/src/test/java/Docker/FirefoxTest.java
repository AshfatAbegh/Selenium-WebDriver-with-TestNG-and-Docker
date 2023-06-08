package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
	
	@Test
	public void test2() throws MalformedURLException
	{
		  DesiredCapabilities dc = new DesiredCapabilities();
		  
		  dc.setCapability("browserName","firefox");
		  
		  URL url = new URL("http://localhost:4444");
		  
		  RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		  
		  driver.get("https://www.w3schools.com/html/html_forms.asp");
		  
		  System.out.println("Title of the page: " + driver.getTitle());
		  
		  driver.quit();
	}
}
