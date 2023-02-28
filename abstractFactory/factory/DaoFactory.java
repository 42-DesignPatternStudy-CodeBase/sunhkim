package abstractFactory.factory;

import abstractFactory.dao.*;

public abstract class DaoFactory {
    public abstract UserInfoDao createUserInfoDao();
    public abstract ProductDao createProductDao(); 
}