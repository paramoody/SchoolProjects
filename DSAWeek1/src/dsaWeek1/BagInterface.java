package dsaWeek1;

public interface BagInterface<T> {
	public boolean add(T item);
	public T remove();
	public boolean remove(T item);
	public int count(T item);
	public boolean contains(T item);
	public T[] toArray();

}
