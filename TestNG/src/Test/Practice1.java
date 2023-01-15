package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

@Test
public class Practice1 {

	public void Demo() {
	   System.out.println("Hello");
	}

@AfterSuite
public void Afsuite()
{
  System.out.println("After Execution");
}
@Test
public void SecondTest() 
{
  System.out.println("Hello");
}

}

