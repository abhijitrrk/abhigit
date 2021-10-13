package coreJava;

public class pb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		for(int i=0;i<4;i++)
		{
			
			for(int j=0; j<i;j++)
			{
			
				System.out.print(k);
				System.out.print("\t");
				k=k+3;
			}
			System.out.println();
		}
		/*
		 * for(int x=0;x<=4;x++) { int k=1; for(int y=0;y<5-x;y++) {
		 * System.out.print(k); System.out.print("\t"); k++; } System.out.println(); }
		 */
	}

}
