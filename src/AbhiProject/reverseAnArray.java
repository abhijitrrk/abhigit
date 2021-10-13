package AbhiProject;

public class reverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6};
		int b[]=new int[a.length];
		
		for(int i=a.length-1;i>=0;i--)
		{
			
			b[a.length-i-1]=a[i];
		}
		for(int j=0; j<b.length;j++)
		System.out.print(b[j]+" ");

	}

}
