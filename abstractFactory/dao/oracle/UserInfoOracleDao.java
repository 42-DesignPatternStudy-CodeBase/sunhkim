package abstractFactory.dao.oracle;

import abstractFactory.UserInfo;
import abstractFactory.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

	public UserInfoOracleDao() {
	}

	@Override
	public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into ORACLE DB " + userInfo);
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into ORACLE DB " + userInfo);
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete into ORACLE DB " + userInfo);
	}
	
}
