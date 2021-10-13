package array;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a; a=4 ; System.out.println("This is the value of a "+a);
		 */
		
		int a[] = new int[5]; // declares an arra nad alocate memory for hte values 
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		for(int i=0;i<a.length;i++) 
		{
		System.out.println(a[i]);
	
		}
		System.out.println();
		int b[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<b.length;i++)
			{
			System.out.println(b[i]);
			}
		
		
	}

}
