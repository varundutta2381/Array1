package Array2;

class Person1
{
	String name;
	int age;
	
	void speak()
	{
		System.out.println("My name is: "+ name + " and I am " + age + "years old");
	}
	
	void sayHello()
	{
		System.out.println("Hello Everyone");
	}
	
	
}

public class MethodPractice

{

	public static void main(String[] args) 
	{
		Person1 person2 = new Person1();
		person2.name = "Joe Angel";
		person2.age = 25;
		person2.speak();
		person2.sayHello();
		
		Person1 person3 = new Person1();
		person3.name = "Brett Lee";
		person3.age = 35;
		person3.speak();
		person3.sayHello();
		
		
		
	}

}
