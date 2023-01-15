import java.util.HashSet;
import java.util.Iterator;

public class hashSetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //HashSet, TreeSet, LinkedHashSet - Implements set interface
		//Set Interface Doesn't accept duplicate values 
		//There is no guarantee that elements stored in sequential order..Random Order
	    
		HashSet<String> hs = new HashSet<String>();
		hs.add("BD");
		hs.add("USA");
		hs.add("UK");
		hs.add("UK");
		hs.add("Aus");
		hs.add("Ned");
		System.out.println(hs);
		//hs.remove("UK");
		//System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
	   //Iterator - Interface is used for traversing all of the strings
	    Iterator<String> i = hs.iterator();
	    while(i.hasNext())
	    {
	    System.out.println(i.next());
	    }
	}

}
