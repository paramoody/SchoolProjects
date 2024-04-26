package bag;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bag<T>{

    private List<T> items;


    // Constructor
    public Bag() {
        items = new ArrayList<>();
    }
    //add an item to the bag
	public void add(T item) {
		items.add(item);
		
	}
		
	//remove specific item
	public void remove(T item) {
		if(items.contains(item)) {
			items.remove(items.indexOf(item));			
		}
		
	}

	//returns a boolean value if the bag contains the item or not
	public boolean contains(Object item) {
		return items.contains(item);
	}


	//returns the bag as an array
	@SuppressWarnings("unchecked")
	public T[] toArray() {
		return (T[]) items.toArray();
	}


	//returns the size of the bag
	public int size() {
		return items.size();
	}


	//merges two bags together
	public void merge(Bag<T> otherBag) {
		for( T item: otherBag.toArray() ) {
			add(item);
	
		}
		
	}


	//returns a bag with no duplicates
	public Bag<T> distinct() {
	Bag<T> distinctBag = new Bag<>();
	for( T item: this.toArray() ) {
		if(!distinctBag.contains(item))
			distinctBag.add(item);
		
	}
	
	
	return distinctBag;
		
	}

	public static void main(String[] args) {
		Bag<String> names = new Bag<>();
		names.add("Bob");
		names.add("Bob");
		names.add("Bob");
		names.add("Sue");
		names.add("Mary");
		names.add("Jim");
		names.add("Roxy");
		System.out.println("First bag: " + Arrays.toString(names.toArray()));
		System.out.println("First bag size: " + names.size());
		
		Bag<String>moreNames = new Bag<>();
		moreNames.add("jim bob");
		moreNames.add("jim bob joe");
		moreNames.add("sue bob");
		moreNames.add("mary bob jackobs");
		moreNames.add("Mary");
		moreNames.add("Sue");
		System.out.println("Second bag: " + Arrays.toString(moreNames.toArray()));
		System.out.println("Second bag size: " + moreNames.size());
		
		names.merge(moreNames);
		System.out.println("merged: " + Arrays.toString(names.toArray()));
		Bag<String> distinctNames = names.distinct();
		System.out.println("distinct: " + Arrays.toString(distinctNames.toArray()));
		
	}


}