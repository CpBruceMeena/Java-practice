
public class GenericMethods {
	
	public <E> void printArray(E []names) {  // This is the notation used for generic methods. Here E captures the data type
		// One important point, E can only be a class type, not primitive data type (int, float, double)
		// class like Integer, Float, Char, String;
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		for(E x: names) {		// This is another method which can be used in place of traditional for.
			System.out.println(x);
		}
	}
	
	
	public static void main(String[] args) {
		GenericMethods ob = new GenericMethods();
		String names[] = new String[]{"Rah", "Sam", "jpohn"};
		Integer numbers[] = new Integer[] { 1, 3, 2, 53};
		ob.printArray(names);
		ob.printArray(numbers);
	}
}
