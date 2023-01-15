public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   //Print 
       System.out.println("Java Practice");
       
      //Add 2 numbers
      int a = 6;
      int b = 10;
      
      int Sum = a + b;
      System.out.println("Sum = " + Sum); 
      
      //Calling Function from Methods
      System.out.println("Assuming navigated to home page");
	  
      //Classobject.methodname
      Methods c = new Methods();//Here c is a object for Method class
      c.ValidateHeader();//Here ValidateHeader() is the method name
	
	}

}
