package AbhiProject;

import java.util.ArrayList;

public class firstDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,9};
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int i=0;i<=a.length-1;i++)
		{
			int k=0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
			
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					k++;
				}
				
			}
			//System.out.print(a[i]+":");
			//System.out.print(k);
			if(k>=2)
			{
				System.out.println("The first duplicate has been found and it is " + a[i]);
				break;
			}
			}
		}

	}

}
