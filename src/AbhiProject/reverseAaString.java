package AbhiProject;

public class reverseAaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abcedf";
		String b="";
		System.out.println(a.length());
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b= b + a.charAt(i);
			
		}
		System.out.println(b);
	}

}
