import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Output will be like = 4 is repeated 3 times
		//Output will be like = 5 is repeated 3 times, 6 - 2, 9 - 1
		
		int a[] = {4,5,5,5,4,6,6,9,4};
		//Print Unique Number from the list - Amazon
		
		//First Prepare Empty Array List 
		ArrayList<Integer>al = new ArrayList<Integer>();
		for(int i = 0; i<a.length; i++)
		{
			int k = 0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				
				for(int j = i+1; j<a.length; j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i]);
				
				System.out.println(k);
				if(k==1)
				{
					System.out.println(a[i]+" is unique number");
				}
			}
			
		}
        
	}
}
