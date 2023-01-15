public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sum of numbers in the array
		int a[] = {2,5,7,8,4};
		int sum = 0;
		
		for(int i = 0; i<=a.length-1; i++)//will loop over 5 times
		{
			sum = sum + a[i];	
			
			if(a[i] == 8) {
			  //Printing the index of desired number
				System.out.println("Index of 8 is = " + i);
				break;
			}
			
		}
		   System.out.println("Sum is = " + sum);
	}

}
