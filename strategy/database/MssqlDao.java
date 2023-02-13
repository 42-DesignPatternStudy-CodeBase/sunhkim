package strategy.database;

public class MssqlDao implements UserInfoDao {

    @Override
    public String getDatabase() {
        return "MSSQL";
    }

    @Override
    public void insert(String field, String value) {
        System.out.println("insert into MSSQL DB " + field + " = " + value);  
    }

    @Override
    public void update(String field, String value) {
        System.out.println("update into MSSQL DB " + field + " = " + value);
    }

    @Override
    public void delete(String field, String value) {
        System.out.println("delete from MSSQL DB " + field + " = " + value);
    }
    
}
