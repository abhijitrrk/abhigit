package AbhiProject;

public class palindromeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum =0, temp;
		int n =454;

		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if (temp==sum)
			System.out.println("number is a Palindrome");
		else
			System.out.println("Number is not a Palindrome");
		
	}

}
