package AbhiProject;

import java.util.ArrayList;
import java.util.Scanner;

public class collectionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements that you want to store:");
		n = sc.nextInt();
		System.out.println(n);

		int[] a = new int[n];
		System.out.print("Enter the elements of Array:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Elements in the Array are:");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!a1.contains(a[i])) {
				a1.add(a[i]);
				k++;

				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				System.out.println(a[i]);
				System.out.print(" "+k);
				System.out.println();
				
			}
		}

	}

}
