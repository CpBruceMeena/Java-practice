import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(32);
		list.add(12);
		list.add(53);
		list.add(23);
		System.out.println(list);
		ListIterator it = list.listIterator();
		while(it.hasNext()) {
			Integer temp = (Integer)it.next();
			if(temp == 32) it.set(94);
			else if(temp.equals(12)) it.add(13);
			else if(temp.equals(23)) it.remove();
		}
		System.out.println(list);
	}

}
