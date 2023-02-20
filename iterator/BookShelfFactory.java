package iterator;

public class BookShelfFactory extends Factory{

	@Override
	protected Iterator createProduct(Aggregate list, int type) {
		switch (type) {
			case 0:
                return new BookShelfIterator((BookShelf)list);
			case 1:
                return new BookShelfReverseIterator((BookShelf)list);
			default:
                return new BookShelfIterator((BookShelf)list);
		}
	}
	
}