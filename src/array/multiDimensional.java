package array;

public class multiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= new int[3][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=7;
		a[2][0]=1;
		a[2][1]=2;
		a[2][2]=9;
		
		System.out.println(a[2][1]);
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
	}

}
