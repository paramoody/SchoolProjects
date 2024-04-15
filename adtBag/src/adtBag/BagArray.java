package adtBag;

public class BagArray<T> implements BagInterface<T> {
	private static final int DEFAULT_CAPACITY = 25;
	private int numberOfItems;
	private T[] items;

	public BagArray() {
		this(DEFAULT_CAPACITY);
	}

	public BagArray(int size) {
		items = (T[]) new Object[size];
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
		if (numberOfItems == items.length) {
			return false;
		} else {

			items[numberOfItems] = item;
			numberOfItems++;
			return true;
		}
	}

	@Override
	public T remove() {
		if (isEmpty()) {
			throw new IllegalArgumentException("Bag is Empty");
		}
		numberOfItems--;
		T item = items[numberOfItems];
		items[numberOfItems] = null;
		return item;

	}

	@Override
	public boolean remove(T itemToRemove) {
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null && items[i].equals(itemToRemove)) {
				numberOfItems--;

				items[i] = items[numberOfItems];
				items[numberOfItems] = null;
				return true;
			}

		}
		return false;
	}

	@Override
	public void clear() {
		while (!isEmpty()) {
			remove();
		}
	}

	@Override
	public int getHowMany(T itemToCount) {
		if (itemToCount == null) {
			throw new IllegalArgumentException("Item to count cannot be null");
		}
		int howMany = 0;
		for (T item : items) {
			if (item != null && item.equals(itemToCount))
				howMany++;
		}
		return howMany;
	}

	@Override
	public boolean contains(T itemToFind) {
		for (T item : items) {
			if (item != null && item.equals(itemToFind)) {
				return true;
			}
		}
		return false;
	}

	
	@Override
	public T[] toArray() {
		return items;
	}
}
