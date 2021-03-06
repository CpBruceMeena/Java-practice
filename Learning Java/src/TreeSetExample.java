import java.util.*;

class Book{
	private int price;
	private String title;
	
	public Book(int price, String title) {
		this.price = price;
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	public String getTitle() {
		return title;
	}
}


// If we want to define custom comparator then we need to follow the below methods, that is implementing our own comparator.
class MyComparator implements Comparator{
	
	public int compare(Object o1, Object o2) {
		Book b1 = (Book)o1;
		Book b2 = (Book)o2;
		
		if(b1.getPrice() < b2.getPrice()) return -1;
		else return 1;
	}
}

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet books = new TreeSet(new MyComparator());
		Book b1 = new Book(400, "C++");
		Book b2 = new Book(120, "Java");
		Book b3 = new Book(235, "PHO");
		
		books.add(b1);
		books.add(b2);
		books.add(b3);

		Book b;
		Iterator it = books.iterator();
		while(it.hasNext()) {
			b = (Book)it.next();
			System.out.println(b.getTitle() + " " + b.getPrice());
		}
	}

}
