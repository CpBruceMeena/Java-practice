// All the member functions of interface are by default public and abstract (compulsory)
// All the member variables of interface are by default public static and final. (compulsory)
// The difference between abstract class and interface is that, the abstract class can have non static member variables
// and non abstract functions, so the childclass can use them.

// There is no constructor in interface unlike abstract class because interface contains abstract member variables
// and constructors are used to initialize the instance member variables which are absent in interface, so no need of
// constructor.

interface I1{
	void fun1();
}

interface I2{
	void fun2();
}

interface I3 extends I1, I2{
	void fun3();
}

class interB implements I3{
	public void fun1() {
		
	}
	
	public void fun2() {
		
	}
	
	public void fun3() {
		
	}
}

public class InterfaceExample {

	public static void main(String[] args) {

		interB obj = new interB();
		I1 temp = new interB();
		temp.fun1();
//		temp.fun2();
//		temp.fun3();    Now this line is an error because the interface reference variable is I1, so it can only call the
		// functions defined in the I1 interface, like the parent and child inheritance type.
	}

}
