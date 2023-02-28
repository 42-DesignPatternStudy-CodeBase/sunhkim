package composite;

/* Leaf */
public class Product extends ProductCategory {

	public Product(int id, String name, int price) {
		super(id, name, price);
	}

	@Override
	public void addProduct(ProductCategory product) {
		System.err.println("Cannot add product in product");
	}

	@Override
	public void removeProduct(ProductCategory product) {
		System.err.println("Cannot remove product in product");
	}

	@Override
	public int getCount() {
		return 1;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public int getId() {
		return id;
	}
	
}
