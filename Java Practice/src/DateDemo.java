import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//Current Date, Current Time  
		Date d = new Date(); 
		
		SimpleDateFormat sdf =   new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());
		
		//M/dd/yyyy, hh:mm:ss - types
	}

}
