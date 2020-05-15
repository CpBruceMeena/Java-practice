package practice_Problems;

import java.util.*;

public class CountZeroXorPairs {

	public static void main(String[] args) {
		int test;
		Scanner sc = new Scanner(System.in);
		test = sc.nextInt();
		while(test --> 0) {
			int n; 
			n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			int ans = 0;
			for(int i = 0; i<n-1; i++) {
				for(int j = i+1; j<n; j++) {
					if(( arr[i]^arr[j]) == 0) ans+=1; 
				}
			}
			System.out.println(ans);
		}
	}

}
