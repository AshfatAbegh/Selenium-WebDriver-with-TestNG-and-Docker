public class InterviewMinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int abc[][] = {{2,4,5},{3,4,7},{1,2,9}};
		
		int minNumber = abc[0][0];
		int minNumberColumn = 0;
		
		for(int i=0; i<3; i++)//for row	
		{
			for(int j=0; j<3; j++)//for column
			{
				if(abc[i][j]<minNumber)
				{
					minNumber = abc[i][j];
					minNumberColumn = j;
				}
			}
		}
		
		
		int maxNumber = abc[0][minNumberColumn];
		int k = 0; 
		while(k<3)
		{
			if(abc[k][minNumberColumn]>maxNumber)
			{
				maxNumber = abc[k][minNumberColumn];
			}
			k++;
		}
		
		System.out.println(minNumber);
		System.out.println(maxNumber);
	}

}
