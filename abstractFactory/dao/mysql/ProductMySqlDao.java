package abstractFactory.dao.mysql;

import abstractFactory.Product;
import abstractFactory.dao.ProductDao;

public class ProductMySqlDao implements ProductDao {

	public ProductMySqlDao() {
	}

	@Override
	public void insertProduct(Product product) {
        System.out.println("insert into MYSQL DB " + product);
	}

	@Override
	public void updateProduct(Product product) {
        System.out.println("update into MYSQL DB " + product);
	}

	@Override
	public void deleteProduct(Product product) {
        System.out.println("delete into MYSQL DB " + product);
	}
	
}
