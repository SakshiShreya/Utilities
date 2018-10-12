package stacksAndQueues;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		System.out.println("I am the default constructor");
	}
	
	public Person(int age) {
		System.out.println("I am parameterized contructor with one parameter");
		this.age = age;
	}
	
	public Person(String name, int age) {
		System.out.println("I am parameterized contructor with two parameters");
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
