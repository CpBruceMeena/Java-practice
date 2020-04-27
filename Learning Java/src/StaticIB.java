/* The StaticIB is initialized only once, when the class object is create first time.
 * this and super keyword cannot be used with this.
 * It do not contain a return keyword.
 */


public class StaticIB {
	
	private static int x;
	static {
		System.out.println("Hello");
		x = 2;
		System.out.println("X: " + x);
		x += 10;
	}
	
	public static void main(String []args) {
		new StaticIB();
		new StaticIB();
		//StaticIB b = 
	}
}


