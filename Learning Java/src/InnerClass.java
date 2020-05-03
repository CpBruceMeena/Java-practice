
class OuterClass{
	// The outer class can only be public or default, but the inner class can be protected, public, private, default
	// If the inner class is private, then it cannot be called from outside
	// If it's protected, public or default, then it can be called 
	// If the inner class is not static, then it can access both static and non static variables.
	class InnerClass{		// Static inner class can only access static variables of outer class	
		void fun() {
			System.out.println("This is from the inner class");
		}
	}
	
}

public class InnerClass {

	public static void main(String[] args) {
	//	OuterClass.InnerClass ob = new OuterClass.InnerClass();   // this is the syntax for static inner class
	//	ob.fun();
		OuterClass ob1 = new OuterClass();  // This is the syntax when the inner class is not static.
		OuterClass.InnerClass temp = ob1.new InnerClass();
		temp.fun();								
	}

}
