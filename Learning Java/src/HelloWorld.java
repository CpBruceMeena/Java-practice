import Box.newBox;

public class HelloWorld {
 public static void main(String []args) {
	 
	 newBox temp = new newBox();
	 temp.setDimension(12, 12, 52);
	 temp.showDimension();
	 
	 System.out.print("hello world");
	  int a = 01234;
	  int b = 0x24;
	  int c = 0b0011;
	  int d = 121;
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	  System.out.println(d);
 }
}