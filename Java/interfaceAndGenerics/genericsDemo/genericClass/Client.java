package interfaceAndGenerics.genericsDemo.genericClass;

import java.util.ArrayList;

import interfaceAndGenerics.genericsDemo.genericFxn.Car;
import stacksAndQueues.QueueUsingArrays;
import stacksAndQueues.StackUsingArrays;

public class Client {
	public static void main(String[] args) throws Exception {
		Pair<String> pair = new Pair<>();
		pair.one = "abc";
		pair.two = "def";
		
		Pair<Integer> pair1 = new Pair<>();
		pair1.one = 10;
		pair1.two = 20;
		
		ArrayList<String> al = new ArrayList<>();
		
		Pair2<String, Integer> pair2 = new Pair2<>();
		pair2.one = "xyz";
		pair2.two = 10;
		
		LinkedListGeneric<Car> list = new LinkedListGeneric<>();
		Car[] cars = new Car[5];
		cars[0] = new Car(1000, 400, "Red");
		cars[1] = new Car(2000, 200, "Yellow");
		cars[2] = new Car(500, 900, "Black");
		cars[3] = new Car(300, 30, "Grey");
		cars[4] = new Car(700, 60, "White");
		
		list.addLast(cars[0]);
		list.addLast(cars[1]);
		list.addLast(cars[2]);
		list.addLast(cars[3]);
		list.addLast(cars[4]);
		
		list.display();
		
		QueueGeneric<Car> queue = new DynamicQueueGeneric<Car>(5);
		
		for (int i = 0; i < 10; i++) {
			queue.enqueue(cars[i%5]);
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
		
		queue.enqueue(cars[0]);
		queue.enqueue(cars[1]);
		queue.display();
		
	}
}
