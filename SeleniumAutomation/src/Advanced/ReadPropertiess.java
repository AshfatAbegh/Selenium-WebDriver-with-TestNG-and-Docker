 package Advanced;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiess {

	public static void main(String[] args) throws IOException {
	   
		Properties p1 = new Properties();
		
		FileInputStream fis = new FileInputStream("D:\\Std.properties");

		p1.load(fis);
		
		System.out.println(p1.getProperty("course"));
		System.out.println(p1.getProperty("name"));
		System.out.println(p1.getProperty("sub-course"));
		System.out.println(p1.getProperty("time"));
	}

}
