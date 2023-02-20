package iterator;

public class BookShelf implements Aggregate {
    private Book books[];
    private int size = 0;

    // public
    public BookShelf(int size) {
        books = new Book[size];
    }

	@Override
	public int getLength() {
		return size;
	}

	public Book getBook(int index) {
		return books[index];
	}

    public void appendBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
        } else {
            System.out.println("꽉 찼습니다.");
        }
    }

	@Override
	public Iterator createIterator() {
		return new BookShelfIterator(this);
	}

	@Override
	public Iterator createReverseIterator() {
		return new BookShelfReverseIterator(this);
	}
}
