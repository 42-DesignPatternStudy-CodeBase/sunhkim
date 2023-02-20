package iterator;

public interface Aggregate {
    public abstract Iterator createIterator();
    public abstract Iterator createReverseIterator();
	public int getLength();
}