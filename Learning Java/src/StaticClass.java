class Example{
	int x = 3; // it is a instance variable 
	static int y; // it is a static member variable
	
	public void fun1() {
		int x = 3;
	}		// Now the above function is an instance member based function
	
	public static void fun2() {
		y = 4;
	} // Here the function is an static member function, which means it can 
	// only acccess the static member variables.
	
	static class test{
		public static String name = "sandeep";
				
	}
	// Here we have a static inner class
}



public class StaticClass {
 // Now the static functions, class and member variables can be used with the 
	// class name and dot operator.
	public static void main(String[] args) {
		Example ex1 = new Example();
	    // ex1.fun2()  Here this is an invalid line
		Example.fun2(); // This is a valid command
		System.out.println(Example.test.name);
	}

}
