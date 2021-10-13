package exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=4;
		int b=7;
		int c=0;
		try 
		{
				int k=b/c; //tyring this code works or not!
			
			{
					System.out.println(k);
			}
		}
		catch(ArithmeticException et)
		{
			System.out.println("Caught an Arithmetic exception");
		}
		catch(IndexOutOfBoundsException ets)
		{
			System.out.println("Caught Index out of bound exception");
		}
		catch(Exception e)
		{
			System.out.println("I catch the error/exception!");
		}
		
		finally
		{
			System.out.println("Finally Block");
		}
	
	}

}
