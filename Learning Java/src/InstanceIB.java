/* InstanceIB is created every time the object of the class is created.
 * It runs before the constructor, and if there are multiple instance blocks, they are all put in one block
 * and are arranged according to order in which they are created.
 * Here, this and super keyword cannot be used.
 * It does not contain a return keyword.
 * 
 */


public class InstanceIB {
	private int x;
	{
		System.out.println("X: " + x);
		x = 10;
	}
	
	public InstanceIB() {
		System.out.println("X: " + x);
	}
	
	public static void main(String[] args) {
		InstanceIB a = new InstanceIB();
		InstanceIB b = new InstanceIB();
		
	}

}
