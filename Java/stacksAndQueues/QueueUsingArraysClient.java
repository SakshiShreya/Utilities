package stacksAndQueues;

public class QueueUsingArraysClient {
	public static void main(String[] args) throws Exception {
		QueueUsingArrays queue = new QueueUsingArrays(5);
		
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i * 10);
			queue.display();
		}
//		queue.enqueue(60);
//		while (!queue.isEmpty()) {
//			queue.display();
//			System.out.println(queue.front());
//			queue.dequeue();
//		}
		
		queue.dequeue();
		queue.dequeue();
		queue.display();
		
		queue.enqueue(60);
		queue.enqueue(70);
		queue.display();
		
	}
	
}
