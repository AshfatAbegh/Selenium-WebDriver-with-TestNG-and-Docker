public class thisDemo {
    int a = 2;
	
	public void getData()
	{   
		int a = 3;
		int b = a + this.a;
		System.out.println(b);
		System.out.println(this.a);
		//this refers to current object && object scope lies in class level
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        thisDemo td = new thisDemo();
        td.getData();
	}

}
