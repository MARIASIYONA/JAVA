package LearningOops;

public class Learningbasics {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.age=24;
		
		p1.name="reze";
		
		System.out.println(p1.age +" " + p1.name);
		Person p2=new Person();
		p2.age=31;
		p2.name="mahima";
		System.out.println(p1.age + " "+ p2.name);
		
p1.eat();
p2.walk();
	}

}
class Person
{
	int age;
	String name;
	void walk()
	{
		
		System.out.println(name + " is waking." );
	}
	void eat() {
		System.out.println(name + " is eating.");
	}
}