package abstractFactory.factory;

import abstractFactory.dao.*;
import abstractFactory.dao.oracle.*;

public class OracleDaoFactory extends DaoFactory {
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao();  
    }
    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao(); 
    }
}