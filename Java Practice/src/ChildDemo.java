public class ChildDemo extends ParentDemo {
	
	//work of super keyword
	String name = "QA Testing";
	
	public ChildDemo()
	{   
		super();//while using super constructor in child constructor it should always be the 1st line in child constructor	
		System.out.println("Child class constructor");	
	}
	
	public void getString()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData()
    {
		System.out.println("From Child Class");
		super.getData();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChildDemo cd = new ChildDemo();
       
       cd.getString();
       cd.getData();
	}

}
