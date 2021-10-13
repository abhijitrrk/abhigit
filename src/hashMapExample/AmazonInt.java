package hashMapExample;

import java.util.ArrayList;

public class AmazonInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 1, 3, 7, 5, 4, 8, 6, 2, 7, 8, 5, 2,45, 9, 1, 3, 6, 7, 8,9};
		ArrayList<Integer> am = new ArrayList<Integer>();
	
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!am.contains(a[i])) {
				am.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				System.out.println(a[i]);
				System.out.println(k);
				System.out.println();
				if (k == 1) {
						System.out.println(+a[i] + " is an unique number!");
						System.out.println();
						//break;
				}
			}

		}

	}

}
