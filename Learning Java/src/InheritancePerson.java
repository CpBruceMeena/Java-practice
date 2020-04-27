class Person{
	private String name;
	
	public void setName(String s) {
		name = s;
	}
	
	public String getName() {
		return (name);
	}
}

class Student extends Person{
	private int rollno;
	public void setRoll(int r) {
		rollno = r;
	}
	
	public int getRoll() {
		return(rollno);
	}
}

public class InheritancePerson {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Raj");
		s1.setRoll(21);
		System.out.print(s1.getName());
		System.out.print(s1.getRoll());
	}

}
