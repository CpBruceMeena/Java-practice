package practice_Problems;

import java.util.*;

public class RotateArrayByNElements {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while( test != 0) {
			int n, d;
			n = sc.nextInt();
			d = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i<n; i++) {
				arr[i] = sc.nextInt();
				if(i >= d) System.out.print(arr[i] + " ");
			}
			for(int i = 0; i<d; i++) System.out.print(arr[i] + " ");
			System.out.println();
			test--;
		}
				
	}

}
