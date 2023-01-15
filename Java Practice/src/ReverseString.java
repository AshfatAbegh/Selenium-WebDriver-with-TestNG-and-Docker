public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reverse String
        String s = "Ashfat";
        for(int i = s.length()-1; i>=0; i--)
        {
        	System.out.println(s.charAt(i));
        }
        
        String t = "";
        for(int i = s.length()-1; i>=0; i--)
        {
        	t = t + s.charAt(i);
        	System.out.println(t);
        } 
        
        //Palindrome Part
        if(s == t)
        {
        	System.out.println("Palindrome");
        }
        else
        {
        	System.out.println(t);
        }
	}

}
