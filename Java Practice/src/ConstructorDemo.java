public class ConstructorDemo {
    
	//Default Constructor 
	public ConstructorDemo()
	{
		System.out.println("In the constructor");
	}
	
	//parameterized constructor
	public ConstructorDemo(int a, int b)
	{
		int c = a + b;
		System.out.println(c);
	}
	
	public ConstructorDemo(String str)
	{
		System.out.println(str);
	}
	
	public void getData()
	{
		System.out.println("Method");
	}
	
	public static void main(String[] args) {
	        
		//will not return any values
		//name of constructor should be the class name
		//whenever object is created constructor will be called
		//compiler will call implicit constructor if there is  not defined any constructor block
		
		ConstructorDemo cd = new ConstructorDemo();
		 
		ConstructorDemo cds = new ConstructorDemo(6,5);
		
		ConstructorDemo c = new ConstructorDemo("Hello");
	}

}
