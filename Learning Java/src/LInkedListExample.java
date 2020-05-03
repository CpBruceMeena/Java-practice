// In java, the linked list is flexible like arrays, we can access the in-between elements using indexes and 
// set values using add function(index, element)

import java.util.LinkedList;

public class LInkedListExample {

	public static void main(String[] args) {

		LinkedList temp = new LinkedList();
		temp.add(12);
		temp.add(23);
		temp.add(53);
		for(int i = 0; i<temp.size(); i++) System.out.println(temp.get(i));
	}

}
