package abstractFactory.factory;

import abstractFactory.dao.*;
import abstractFactory.dao.mysql.*;

public class MySqlDaoFactory extends DaoFactory {
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMySqlDao();  
    }
    @Override
    public ProductDao createProductDao() {
        return new ProductMySqlDao(); 
    }
}