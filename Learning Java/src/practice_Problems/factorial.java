package practice_Problems;
import java.util.*;

public class factorial {

	public static int calcFactorial(int n) {
		if (n == 1) return 1;
		else return calcFactorial(n-1)*n;
	}
	
	public static void main(String []args) {
		System.out.println("Enter a number whose factorial is to be calculated.");	
		Scanner sc = new Scanner(System.in);
		Integer temp = sc.nextInt();
		System.out.println("The answer is " + factorial.calcFactorial(temp));
	}
}
