package abstractFactory.dao.oracle;

import abstractFactory.Product;
import abstractFactory.dao.ProductDao;

public class ProductOracleDao implements ProductDao {

	public ProductOracleDao() {
	}

	@Override
	public void insertProduct(Product product) {
        System.out.println("insert into ORACLE DB " + product);
	}

	@Override
	public void updateProduct(Product product) {
        System.out.println("update into ORACLE DB " + product);
	}

	@Override
	public void deleteProduct(Product product) {
        System.out.println("delete into ORACLE DB " + product);
	}
	
}
