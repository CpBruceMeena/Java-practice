// The prime reason behind using super keyword is to use the member of superclass
 // when we have name collision between variables and member functions.

class newA{
	
	int a;
	
	public void fun(int x) {
		
	}
}

class newB extends newA{
	
	private int a;
	
	public void fun(int x) {
		int a;
		a = x;
		this.a = x;
		super.a = x;   // Here we are using super to call the member variable of the super class
		
		super.fun(43); //  Here super is used to call the member function of superclass 
	}
}

public class SuperExample {

	public static void main(String[] args) {

		newB temp = new newB();
		temp.fun(5);
	}

}
