public class ExceptionDemo {
	
    int a = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 8;
		int c = 0;
		
	    try
	    {
	      int g = b/c;
	      System.out.println(g);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Catched error/exception");
	    }
	    finally
	    {
	     //This block is executed irrespective of exception thrown or not  
	    }
	  }

}
