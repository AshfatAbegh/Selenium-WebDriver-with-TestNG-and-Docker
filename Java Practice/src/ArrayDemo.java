public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int a[] = new int[5];//Declares an array and allocate memory for storing 5 values in this array 
	    
	    a[0] = 4;//Initialize value into that array 
	    a[1] = 5;
	    a[2] = 6;
	    a[3] = 7;
	    a[4] = 8;
	    
	    int b[] = {1,2,3,4,5,6};
	    
	    for(int i = 0; i<b.length; i++)
	    {
	      System.out.println(b[i]);
	    }
	}

}
