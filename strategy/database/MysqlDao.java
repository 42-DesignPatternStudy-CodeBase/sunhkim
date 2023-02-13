package strategy.database;

public class MysqlDao implements UserInfoDao {

    @Override
    public String getDatabase() {
        return "MYSQL";
    }

    @Override
    public void insert(String field, String value) {
        System.out.println("insert into MYSQL DB " + field + " = " + value);
    }

    @Override
    public void update(String field, String value) {
        System.out.println("update into MYSQL DB " + field + " = " + value); 
    }

    @Override
    public void delete(String field, String value) {
        System.out.println("delete from MYSQL DB " + field + " = " + value);
    }
}
