
class newBox{
	private int length, height, breadth;
	public void setDimension(int l, int h, int b) {
		length = l;
		breadth = b;
		height = h;
	}
	
	public void showDimension() {
		System.out.println(length);
		System.out.println(height);
		System.out.println(breadth);
	}
}

public class Box {

	public static void main(String[] args) {
		newBox b1 = new newBox();
		b1.setDimension(221, 42, 2);
		b1.showDimension();
		b1 = new newBox();
		b1.showDimension();
	}

}
