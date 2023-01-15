import java.util.ArrayList;

public class arrayListexample {
	
//can accept duplicate values
	//ArrayList, LinkedList, Vector - Implementing List Interface
	//Array have fixed size,where as ArrayyList can grow dynamically
	//Can Access and Insert any value in any index
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		a.add("Ashfat");
		a.add("Java");
		a.add("Java");
		System.out.println(a);
		a.add(0, "Spring");
		System.out.println(a);
        /*a.remove(1);
        System.out.println(a);
		a.remove("Java");
		System.out.println(a);
		a.removeAll(a);
		System.out.println(a);*/
		System.out.println(a.get(2));
	    //check if testing word is present in this array or not
		System.out.println(a.contains("testing"));
		System.out.println(a.indexOf("Ashfat"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}

}
