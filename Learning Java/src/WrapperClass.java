
public class WrapperClass {

	public static void main(String[] args) {
		Integer i1 = Integer.valueOf("125");  // it is an static method
		Float f1 = Float.valueOf("235.25"); // it's also an static method
		int i = Integer.parseInt("235235");  // It is an static method
		int c = i1.intValue();   // it's an instance based function
				// means we have to use an object to call the function
			
		System.out.print(i);
		System.out.print(f1);
		System.out.print(c);
	}

}
