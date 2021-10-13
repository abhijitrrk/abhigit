package hashMapExample;

import java.util.ArrayList;

public class AmazonInt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,1,2,3,4,1,5,3,4,4,2,3,4,8,4,8,4,7,9,2,4,1,6,2,2,2,9,0};
		ArrayList<Integer> ab2= new ArrayList<Integer>();
		
		for(int i=0; i<a.length;i++)
		{
			int k=0;
			if(!ab2.contains(a[i]))
			{
				ab2.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i]);
				System.out.println(k);
				//System.out.println();
				if(k==7) {
				System.out.println("This number is repeated seven times");
				//System.out.println();
				}
				System.out.println();
			}
			
		}
		
		
		
	}

}
