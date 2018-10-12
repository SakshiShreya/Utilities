package stacksAndQueues;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {

		StackUsingArrays stack = new DynamicStack(5);
		
		
		for (int i = 1; i <= 10; i++) {
			stack.push(i * 10);
			stack.display();
		}
		
		stack.push(60);
		stack.display();
		
		System.out.println(stack.top());
		while (!stack.isEmpty()) {
			stack.display();
			stack.pop();
		}

	}

}
