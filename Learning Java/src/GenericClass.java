// Primitive datatypes cannot be set for T, they can only be classes, we can use Wrapper Classes
class MyData<T>{
	T data;
	public void set(T temp) {
		data = temp;
	}
	public T get() { 
		return data;
	}
}

public class GenericClass {

	public static void main(String[] args) {
		
		MyData<Integer> num = new MyData<Integer>();  // This is the syntax notation for using generic classes
		MyData<String> name = new MyData<String>();
		Integer t = new Integer(3);
		num.set(t);
		name.set("Sam");
		System.out.println("Name is: " + name.get() + " and number is: " + num.get());
	}

}
