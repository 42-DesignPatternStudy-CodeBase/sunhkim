package iterator;

public class IteratorTest {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		System.out.println(bookShelf.getLength());
		System.out.println("=======================");
		Iterator it = bookShelf.createIterator();
		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println("" + book.getName());
		}
		System.out.println("=======================");
		Iterator ite = bookShelf.createReverseIterator();
		while (ite.hasNext()) {
			Book book = (Book)ite.next();
			System.out.println("" + book.getName());
		}
		System.out.println("=======================");
	}
}
