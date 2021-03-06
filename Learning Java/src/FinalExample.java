 
// A variable declared as final is a blank variable means it has no value initially.

// Class declared as final cannot be extended, means restricting inheritance
final class Ex{
	
	public void fun1() {
		final int t = 0; // here t is an final local variable, means it cannot be altered, and initialized only once
		// means its value cannot be changed
	}
}

class A {
	public final void fun() {  // now a function declared as final cannot be overridden in its child class.
		
	}
}

class B extends A{
	
}

public class FinalExample {

	private final int temp;	// final instance variable, it cannot be altered after intialization
	// It can be initialized using constructor, intialization block, or at the time of decalration.
	
	private static final int var; // final static variable, it also cannot be altered
	// It can be initialized using static block, or at the time of declaration.
	static{
		var = 5;
	}
	
	{
		temp = 3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
