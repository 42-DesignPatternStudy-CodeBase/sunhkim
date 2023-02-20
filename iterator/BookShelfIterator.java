package iterator;

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
	private int current = 0;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}

	@Override
	public boolean hasNext() {
		return current < bookShelf.getLength() - 1 ? true : false;
	}

	@Override
	public Object first() {
		return bookShelf.getBook(0);
	}

	@Override
	public Object next() {
		return bookShelf.getBook(++current);
	}

	@Override
	public Object currentItem() {
		return bookShelf.getBook(current);
	}
	
}
