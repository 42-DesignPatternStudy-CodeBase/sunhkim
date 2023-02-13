package strategy.database;

public class OracleDao implements UserInfoDao{

    @Override
    public String getDatabase() {
        return "ORACLE";
    }

    @Override
    public void insert(String field, String value) {
        System.out.println("insert into ORACLE DB " + field + " = " + value);
    }

    @Override
    public void update(String field, String value) {
        System.out.println("update into ORACLE DB " + field + " = " + value);
    }

    @Override
    public void delete(String field, String value) {
        System.out.println("delete from ORACLE DB " + field + " = " + value); 
    }
    
}
