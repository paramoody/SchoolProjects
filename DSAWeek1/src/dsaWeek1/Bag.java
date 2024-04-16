package dsaWeek1;

public class Bag<T> implements BagInterface<T>{

	//Internal node class creates the structure for the linked list used by the bag
	private class Node<E>{
		public E item;
		public Node<E> next;
		
		public Node(E item, Node<E> next) {
			this.item = item;
			this.next = next;
		}
		
	}
	
	private int numberOfItems;
	private Node<T> first;
	
	//Constructor creates a bag object 
	public Bag() {
		first = null;
		numberOfItems = 0;
	}

	//Add method adds an item to the bag, and sets that item to first in the linked list
	@Override
	public void add(T item) {
		Node<T> newNode = new Node<>(item, first);
		first = newNode;
		numberOfItems++;
	}
	//Unparameterized remove method removes the first item in the list
	@Override
	public void remove() {
		if (numberOfItems == 0) {
			throw new IllegalArgumentException("Bag is Empty");
		}
		first = first.next;
		
	}
	//parameterized remove method searches through list until it finds the item, then removes it.
	@Override
	public void remove(T item) {
		if (numberOfItems == 0) {
			throw new IllegalArgumentException("Bag is Empty");
		}
		if(item.equals(first.item)) {
			remove();
			
			
		}
		Node<T> current = first;
		while(current.next != null) {
			if(current.next.item.equals(item)) {
				current.next = current.next.next;
				
			}
			current = current.next;
		}
		
	}

	
	//Count method searches through the entire list, and counts the occurances of an item
	@Override
	public int count(T item) {
		int frequency = 0;
		Node<T> current = first;
		while (current != null) {
			if (current.item.equals(item)){
				frequency ++;
			}
			current = current.next;
		}
		return frequency;
	}
	//contains method searches until it finds the item it is looking for, and returns a boolean value
	@Override
	public boolean contains(T item) {
		Node<T> current = first;
		while (current != null) {
			if (current.item.equals(item)){
				return true;
						
			}
			current = current.next;
		}
		return false;
	}
	//toArray creates an array of type T holding all items in the bag
	@Override
	public T[] toArray() {
		Node<T> current = first;
	    Object[] tempArray = new Object[numberOfItems];
	    int index = 0;
	    while (current != null) {
	        tempArray[index++] = current.item;
	        current = current.next;
	    }
	    @SuppressWarnings("unchecked")
	    T[] result = (T[]) tempArray;
	    return result;
	}

}
