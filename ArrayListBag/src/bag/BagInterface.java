package bag;

public interface BagInterface<T> {
	public void add(T item);
	public void remove();
	public void remove(T item);
	public boolean contains(T item);
	public T[] toArray();
	public int size();
	void merge(Bag<T> otherBag);
	public Bag<T> distinct();
}
