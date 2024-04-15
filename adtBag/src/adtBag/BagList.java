package adtBag;

import java.util.Arrays;

public class BagList<T> implements BagInterface<T>{
	
	private class Node<E>{
		public E item;
		public Node<E> next;
		public Node(E item) {
			this(item, null);
		}
		public Node(E item, Node<E> next) {
			this.item = item;
			this.next = next;
		}
		
	}
	
	private int numberOfItems;
	private Node<T> first;
	
	public BagList() {
		first = null;
		numberOfItems = 0;
	}
	

	@Override
	public int getSize() {
		return numberOfItems;
	}

	@Override
	public boolean isEmpty() {
		return numberOfItems == 0;
	}

	@Override
	public boolean add(T item) {
		Node<T> newNode = new Node<>(item, first);
		first = newNode;
		numberOfItems++;
		return true;
	}

	@Override
	public T remove() {
		if (isEmpty()) {
			throw new IllegalArgumentException("Bag is Empty");
		}
		Node<T> toRemove = first;
		first = first.next;
		return toRemove.item;
	}

	@Override
	public boolean remove(T item) {
		if (isEmpty()) {
			throw new IllegalArgumentException("Bag is Empty");
		}
		if(item.equals(first.item)) {
			remove();
			return true;
			
		}
		Node<T> current = first;
		while(current.next != null) {
			if(current.next.item.equals(item)) {
				current.next = current.next.next;
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public void clear() {
		first = null;
		numberOfItems = 0;
	}

	@Override
	public int getHowMany(T item) {
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
	public void print() {
	    if (isEmpty()) {
	        System.out.println("Bag is empty");
	    }else {
	    	Object[] bagArray = this.toArray();
	    	System.out.println(Arrays.toString(bagArray));	    	
	    }
	}

}
