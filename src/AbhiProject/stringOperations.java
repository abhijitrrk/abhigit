package AbhiProject;

public class stringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Abhijit";
		String b = " Kadam";
		
		System.out.println(a);
		//System.out.println(a.charAt(3));
		//System.out.println(a.codePointAt(3));
		//System.out.println(a.concat(b).length());
		
		String c = a.concat(b);
		System.out.println(c);
		System.out.println();
		String  arr[] = c.split(" ");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("j", "J"));
		
	}

}
