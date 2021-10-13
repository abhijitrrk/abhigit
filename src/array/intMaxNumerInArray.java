package array;

public class intMaxNumerInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{2,4,9},{8,6,3},{9,5,1}};
		int max = a[0][0];
		for (int i=0;i<3;i++)
		{
			for (int j=0; j<3;j++)
			{
				if(a[i][j]>max)
				{
					max = a[i][j];
				}
			}
		}
		System.out.println("max number in an " + max);

	}

}
