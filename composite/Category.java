package composite;

import java.util.ArrayList;

/* Composite */
public class Category extends ProductCategory {
	private ArrayList<ProductCategory> children;

	public Category(int id, String name, int price) {
		super(id, name, price);
		children = new ArrayList<ProductCategory>();
	}

	@Override
	public void addProduct(ProductCategory product) {
		children.add(product);
	}

	@Override
	public void removeProduct(ProductCategory product) {
        children.remove(product);
	}

	@Override
	public int getCount() {
		int totalCount = 0;
		for (ProductCategory child : children) {
			totalCount += child.getCount();
		}
		return totalCount;
	}

	@Override
	public String getName() {
        return name;
	}

	@Override
	public int getPrice() {
		int totalPrice = 0;
		for (ProductCategory child : children) {
			totalPrice += child.getPrice();
		}
		return totalPrice;
	}

	@Override
	public int getId() {
        return id;
	}
	
}
