import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {

		int age;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age and name");
		name = sc.nextLine();
		age = sc.nextInt();
		System.out.println(age);
		System.out.println(name);
	}

}
