package AbhiProject;

public class exceptionDemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=7;
			int b=0;
			//int k=a/b; 
			//System.out.println(k);
			
			int arr[]=new int[5];
			System.out.println(arr[7]);
			
		}
		catch(ArithmeticException et)
		{
			System.out.println("I catch the Artihmeticexception");		
		}
		catch(IndexOutOfBoundsException et)
		{
			System.out.println("I catch the index out of bound exception");		
		}
		catch(Exception e)
		{
			System.out.println("I catch the error exception");		
		}
		finally
		{
			System.out.println("Delete Cookies");
		}

	}

}
