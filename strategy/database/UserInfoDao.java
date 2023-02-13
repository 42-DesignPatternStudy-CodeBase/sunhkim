package strategy.database;

public interface UserInfoDao {
    public String getDatabase();

    public void insert(String field, String value);
    public void update(String field, String value);
    public void delete(String field, String value);
}
