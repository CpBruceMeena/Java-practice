class tempA{
	int x;
	public tempA(int y) {
		x = y;
		System.out.println("A");
	}
}

class tempB extends tempA{
	public tempB() {
		super(4);  // We are using this super keyword to call the superclass constructor
		// If we don't write then the subclass constructor will call the default constructor of superclass.
		System.out.println('B');
	}
}


public class ConstructorInheritance {

	public static void main(String[] args) {

		tempB obj = new tempB();
		
	}

}
