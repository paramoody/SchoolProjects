package dsaWeek1;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		Bag<String> names = new Bag<>();
		names.add("Bob");
		names.add("Bob");
		names.add("Bob");
		names.add("Sue");
		names.add("Mary");
		names.add("Jim");
		names.add("Roxy");
		System.out.println(Arrays.toString(names.toArray()));
		
		System.out.println(names.contains("Sue"));
		System.out.println(names.contains("Mary"));
		System.out.println(names.contains("Jeff"));
		System.out.println(names.count("Bob"));
		System.out.println(names.count("Mary"));
		System.out.println(names.count("Jeff"));
		names.remove("Mary");
		System.out.println(Arrays.toString(names.toArray()));
		System.out.println(names.contains("Mary"));
		System.out.println(names.count("Mary"));
		
		
		
	}
}
