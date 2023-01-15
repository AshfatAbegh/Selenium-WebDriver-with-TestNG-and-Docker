import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		HashMap<Integer,String> hm = new HashMap<Integer,String>();  
	    hm.put(0, "Hello");
	    hm.put(1, "Java");
	    hm.put(2, "World");
	    System.out.println(hm.get(2));
	    hm.remove(2);
	    System.out.println(hm.get(2));
	    
	    Set sn = hm.entrySet();
	    Iterator it = sn.iterator(); 
	    
	    //Create a hashtable and pass the table to set collection
	    
	    while(it.hasNext())
	    {
	    	Map.Entry mp = (Map.Entry)it.next();
	    	System.out.println(mp.getKey());
	    	System.out.println(mp.getValue());
	    }
	}
}
