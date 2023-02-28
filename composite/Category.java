package composite;

import java.util.ArrayList;

/* Composite */
public class Category extends ProductCategory {
	private ArrayList<ProductCategory> childs;

	public Category(int id, String name, int price) {
		super(id, name, price);
		childs = new ArrayList<ProductCategory>();
	}

	@Override
	public void addProduct(ProductCategory product) {
		childs.add(product);
	}

	@Override
	public void removeProduct(ProductCategory product) {
        childs.remove(product);
	}

	@Override
	public int getCount() {
		int totalCount = 0;
		for (ProductCategory child : childs) {
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
		for (ProductCategory child : childs) {
			totalPrice += child.getPrice();
		}
		return totalPrice;
	}

	@Override
	public int getId() {
        return id;
	}
	
}
