package practice_Problems;

import java.util.Scanner;
import java.util.*;

public class PracticeGFG {

	public static void main(String[] args) {
		int test; 
		Scanner sc = new Scanner(System.in);
		test = sc.nextInt();
		ArrayList<Long> arr = new ArrayList<Long>();
		long a = 1;
		long b = 1;
		arr.add(a);
	//	arr.add(a + b);
		for(int i = 0; i<20; i++) {
			long c = a + b;
			arr.add(c);
			a = b;
			b = c;
		}
	
	  	while(test-->0) {
	  		long n, ans = 0;
			n = sc.nextInt();
			for(int i = 0; i<n; i++) {
				long temp = sc.nextLong();
				if(arr.contains(temp)) ans++;
			}
			System.out.println(ans); 
		}	
	}
}
