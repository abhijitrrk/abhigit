package AbhiProject;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 112552114;
		int r,sum=0;
		int temp =n;
		while(n>0)
		{
			r=(n%10);
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Number is a Palindrome");
		} else
		{
			System.out.println("Number is not a Palindrome");
		}
		
		
	}

}
