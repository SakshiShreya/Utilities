package stacksAndQueues;

public class StudentClient {

	public static void main(String[] args) {

		System.out.println("Hello");
		Student s1 = new Student();
		try {
			s1.setAge(10);
			System.out.println("after statement");
		}
		catch(Exception e) {
			System.out.println("In catch block");
		}
		
		System.out.println("bye");
		
		System.out.println(s1.getAge());

	}

}
