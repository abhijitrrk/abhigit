package thisKeyword;

public class thisDemo {
	
	int a=2;
	
	public void getdata()
	{
		int a=3;
		System.out.println(this.a);
		int x = a+this.a;
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo d= new thisDemo();
		d.getdata();
		
	}

}
