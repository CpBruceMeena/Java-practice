
public class StringExamples {

	public static void main(String[] args) {
		String s1 = "Apology";
		String s2 = "apology";
		
		System.out.println(s1.equals(s2));			// It is used to compare the content of string, case sensitive
		System.out.println(s1.equalsIgnoreCase(s2)); // Here it is case insensitive
		System.out.println(s1.compareTo(s2));	// Here we are seeing which string comes first in the dicitionary order
		// If s1.compareTo(s2) is negative, then s1 comes first, else s2. if the int is 0, then they are same
		
		System.out.println(s1.toLowerCase());   // It is used to convert it to lowercase
		System.out.println(s2.toUpperCase()); // It is used to convert it to uppercase
		
		System.out.println(s1.indexOf('l'));   // It is used to find the index of the character
		System.out.println(s1.lastIndexOf('l'));	// It is used to find the index, the only different is that the 
		// searching process will begin from the back side.
		// In both the above cases the index will be same.
		
		System.out.println(s1.substring(3, 5));
	}

}
