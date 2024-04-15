package adtBag;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		BagArray<String> bag = new BagArray<>(6);
		bag.add("a");
		bag.add("a");
		bag.add("a");
		bag.add("g");
		bag.add("g");
		bag.add("g");
		bag.remove("a");
		bag.add("t");
		
		System.out.println(Arrays.toString(bag.toArray()));
		System.out.println(bag.getHowMany("a"));
		System.out.println(bag.contains("f"));
		System.out.println(bag.getSize());
		
	}
}
