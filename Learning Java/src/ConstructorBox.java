
public class ConstructorBox {

	private int l, b, h;
	
	public ConstructorBox(int L, int B, int H) {
		l = L;
		b = B;
		h = H;
	}
		
	public void showDimension() {
		System.out.print(l);
	}
	
	public static void main(String[] args) {
		ConstructorBox b1 = new ConstructorBox(1, 4,2);
		b1.showDimension();
	}

}
