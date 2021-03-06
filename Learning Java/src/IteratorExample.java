import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String []args) {
		ArrayList numbers = new ArrayList();
		for(int i = 1; i<=10; i++) numbers.add(i);
		System.out.println(numbers);
		Iterator it = numbers.iterator();
		while(it.hasNext()) {
			Integer temp = (Integer)it.next();
			if(temp > 7) it.remove();
		}
		System.out.println(numbers);
	}
}
