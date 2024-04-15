package adtBag;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
	BagList<Integer> bag = new BagList<>();
	bag.add(5);
	bag.add(5);
	bag.add(5);
	bag.add(5);
	bag.add(2);
	bag.add(44);
	bag.add(7);
	
	System.out.println(bag.isEmpty());
	System.out.println(bag.contains(5));
	System.out.println(bag.getHowMany(2));
	bag.print();
	bag.remove();
	bag.print();
	bag.remove(5);
	bag.remove(5);
	bag.remove(5);
	bag.remove();
	bag.print();
	System.out.println(bag.contains(55));
	}
}
