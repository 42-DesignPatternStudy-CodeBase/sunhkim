package iterator;

public class BookShelfReverseIterator implements Iterator {
    private BookShelf bookShelf;
	private int current = 0;

	public BookShelfReverseIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		current = bookShelf.getLength() - 1;
	}

	@Override
	public boolean hasNext() {
		return current > 0 ? true : false;
	}

	@Override
	public Object first() {
		return bookShelf.getBook(bookShelf.getLength() - 1);
	}

	@Override
	public Object next() {
		return bookShelf.getBook(--current);
	}

	@Override
	public Object currentItem() {
		return bookShelf.getBook(current);
	}
	
}
