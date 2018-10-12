package stacksAndQueues;

public class Student {
	
	private String name;
	private int age;
	
	public void setAge(int age) throws Exception {
		
		if (age < 0) {
			throw new Exception("Age can't be -ve");
		}
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
}
