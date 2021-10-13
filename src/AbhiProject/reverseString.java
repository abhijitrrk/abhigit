package AbhiProject;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "madame";
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			//System.out.print(a.charAt(i));
			b = b + a.charAt(i);
			
			
		}
		System.out.println(a);
		System.out.println(b);
		if(a.equals(b))
		{
			System.out.println("Is a palindrome");
		} else System.out.println("String is not aPalindrome");
			

	}

}
