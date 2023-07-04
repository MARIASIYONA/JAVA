package Programming;

public class Student {
	String name;
	int age;

	public void display()
	{
		System.out.println(this.name);
		
	    System.out.println(this.age);
	}
	

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="rima";
				s1.age=37;
				s1.display();
		

	}

}
