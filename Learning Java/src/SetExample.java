import java.util.LinkedHashSet;
import java.util.HashSet;

// the only difference in between these two Data Structure is the insertion order, 
// In the HashSet the order is preserved and the in the linkedhashset the order is not preserved.

public class SetExample {

	public static void main(String[] args) {

		HashSet Hset = new HashSet();
		Hset.add("Rome");
		Hset.add("tokyo");
		Hset.add("moscox");
		Hset.add("rio");
		
		System.out.println(Hset);
		
		LinkedHashSet LSet = new LinkedHashSet();
		LSet.add("Raj");
		LSet.add("gif");
		LSet.add("img");
		LSet.add("gif");
		
		System.out.println(LSet);
	}
}
