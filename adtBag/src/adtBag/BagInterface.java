package adtBag;

public interface BagInterface<T> {
	public int getSize();
	public boolean isEmpty();
	public boolean add(T item);
	public T remove();
	public boolean remove(T item);
	public void clear();
	public int getHowMany(T item);
	public boolean contains(T item);
	public T[] toArray();
	public void merge();
	public Bag<T> distinct;
}
