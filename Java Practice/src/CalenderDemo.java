import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat sdf =   new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	    System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	    System.out.println(cal.get(Calendar.AM_PM));
	}

}
