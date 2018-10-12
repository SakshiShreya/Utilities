package hashmaps;

public class Client {

	public static void main(String[] args) throws Exception {
		
		HashTable<String, Integer> map = new HashTable<>(4);
		map.put("USA", 200);
		map.put("UK", 175);
		map.put("India", 300);
		map.put("China", 350);
		map.put("Sweden", 100);
		
		map.display();
		
		map.put("India", 325);
//		map.display();
		
		map.put("Nepal", 50);
		map.put("Ireland", 75);
		map.display();
		
//		
//		System.out.println("----------------GET------------------");
//		System.out.println(map.get("India"));
//		System.out.println(map.get("Sweden"));
//		System.out.println(map.get("RSA"));
//		
//		System.out.println("---------------REMOVE----------------");
//		System.out.println(map.remove("India"));
//		map.display();

	}

}
