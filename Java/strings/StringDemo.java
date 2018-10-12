package strings;

public class StringDemo {

	public static void main(String[] args) {

		String str = "Hello";
//		str = "bye";
		System.out.println(str.charAt(3));
		System.out.println(str);
		System.out.println(str.charAt(str.length() - 1));
		System.out.println(str.substring(2, 4));
		System.out.println(str.substring(3));
		
		String s1 = "Hi", s2 = "Bye";
		System.out.println(s1.concat(s2));
		
		System.out.println(str.indexOf("lo"));
		
		System.out.println(str.startsWith("He"));
		System.out.println(str.startsWith("he"));
		
		s1 = "Hello";
		s2 = s1;
		String s3 = "Hello";
		String s4 = new String("Hello");
		System.out.println((s1==s2) + ", " + s1.equals(s2));
		System.out.println((s1==s3) + ", " + s1.equals(s3));
		System.out.println((s1==s4) + ", " + s1.equals(s4));

	}

}
