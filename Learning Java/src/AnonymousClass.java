/* Points regarding anonymous class
 *  Anonymous classes are always inner class with no name, and they are always child class of a parent class.
 *  They are always defined inside another class.
 *  We need to create the object as anonymous class at the time of its creating.
 *  As the class is anonymous, we can only call those functions which are defined in the parent class, we can override them.
 *  but we cannot create new functions inside the anonymous class section.
 */


class Greeting{
	public void fun(){
		System.out.println("Hello from Greeting class");
	}
}

class India{
	
	Greeting g = new Greeting() {   // this is the syntax used to create the anonymous class, and we use a reference variable of
				// class to store it. Don't forget the semicolon, it's like creating a object.
		public void fun() {
			System.out.println("Hello from Greeting anonymous class");
		}
	};
}


public class AnonymousClass {

	public static void main(String[] args) {
		India ob = new India();
		ob.g.fun();
	}

}
