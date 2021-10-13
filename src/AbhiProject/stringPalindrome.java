package AbhiProject;

public class stringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="madam";
		String reverse="";
		int i=str1.length()-1;
		System.out.println(str1.length());
		while(i>=0)
		{
			reverse = reverse+ str1.charAt(i);
			i--;
		}
		System.out.println(str1);
		System.out.println(reverse);
		if(str1.equals(reverse))
		{
			System.out.println("String is a Palindrome");
		} else
		{
			System.out.println("String is a Not Palindrome");
		}	

	}

}
