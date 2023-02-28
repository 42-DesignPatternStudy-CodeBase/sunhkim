package abstractFactory.dao;

import abstractFactory.*;

public interface ProductDao {
	public void insertProduct(Product product);
    public void updateProduct(Product product);
    public void deleteProduct(Product product);
}
