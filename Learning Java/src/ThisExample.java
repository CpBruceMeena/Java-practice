
class Gifttaker{
	public void sendGift(TempBox b1) {
		System.out.println("Gift");
	}
}

class TempBox{
	private int x, y, z;
	
	public void setDimension(int x, int y, int z) {
		this.x = x; this.y = y; this.z = z;  // Here this represents the caller object 
	}
	
	public void sendBox() {
		Gifttaker g1 = new Gifttaker();
		g1.sendGift(this);     // Here this represents the caller object, means we are sending which box 
			// to be  passed as argument that will be received in the above class. So we use this keyword to 
		// to let the compiler know that we are sending b1 object, using "this".
	}
	
}

public class ThisExample {

	public static void main(String[] args) {

		TempBox b1 = new TempBox();
		b1.setDimension(3, 3, 2);
		b1.sendBox();
	}

}
