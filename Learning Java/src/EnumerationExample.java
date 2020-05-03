import java.util.Vector;
import java.util.Enumeration;

public class EnumerationExample {

	public static void main(String[] args) {
			Vector temp = new Vector();
			temp.add("Till");
			temp.add("JOhn");
			temp.add("Raj");
			System.out.println(temp);
			Enumeration t = temp.elements();
			while(t.hasMoreElements()) {
				String s = (String)t.nextElement();
				System.out.println(s + " " + s.length());
			}
	}

}
