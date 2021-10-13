package AbhiProject;

public class multiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int a[][] = new int[3][3]; a[0][0]=2; a[0][1]=4; a[0][2]=5; a[1][0]=3;
		 * a[1][1]=4; a[1][2]=7;
		 * 
		 * for(int i=0;i<=1;i++) { for (int j=0;j<=2;j++) {
		 * System.out.print(a[i][j]+" "); } System.out.println(); }
		 */

		int b[][] = { { 2, 4, 5 }, { 3, 9, 7 }, { 4, 1, 5 } };
		int max = b[0][0];
		int min = b[0][0];
		int mincolumn=0;
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {

				System.out.print(b[i][j] + " ");
				/*
				 * if(b[i][j]>max) { max=b[i][j]; }
				 */
				if (b[i][j] < min) {
					min = b[i][j];
					mincolumn = j;
				}
			}
			System.out.println();
		}
		System.out.println("Maximum Value = " + max);
		System.out.println("Minimum Value = " + min);
		System.out.println();
		
		int maxmin=b[0][mincolumn];
		int k=0;
		while(k<3)
		{
			if(b[k][mincolumn]>maxmin)
			{
				maxmin=b[k][mincolumn];
			}
			k++;
		}
		System.out.println("Maximum value in the column is "+ maxmin);

	}

}
