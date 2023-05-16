package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Practice2 {
   
	@Test(groups = {"smoke"})
	public void ploan() 
	
	{
		System.out.println("ok");
	}
	
	@AfterTest
	public void prerequisite()
	{
		System.out.println("I will execute last"); 
	}
}
