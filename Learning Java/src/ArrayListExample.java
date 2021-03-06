import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList(4);   // It is also possible not to define the size of arraylist.
		arr.add("Ram");	  // It can contains heterogeneous elements. 
		arr.add(23);
		arr.add("Rajesh");
		arr.add(1, 3);
		Iterator it = arr.iterator();		// Syntax for iterator.
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
