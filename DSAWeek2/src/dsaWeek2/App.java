package dsaWeek2;

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
		System.out.println(names.size());
		
		Bag<String>moreNames = new Bag<>();
		moreNames.add("jim bob");
		moreNames.add("jim bob joe");
		moreNames.add("sue bob");
		moreNames.add("mary bob jackobs");
		moreNames.add("Mary");
		moreNames.add("Sue");
		System.out.println(Arrays.toString(moreNames.toArray()));
		System.out.println(moreNames.size());
		
		names.merge(moreNames);
		System.out.println(Arrays.toString(names.toArray()));
		Bag<String> distinctNames = names.distinct();
		System.out.println("distinct: " + Arrays.toString(distinctNames.toArray()));
		
	}
}
