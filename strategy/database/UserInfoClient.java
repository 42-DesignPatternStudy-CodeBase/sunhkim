package strategy.database;

public class UserInfoClient {
    private UserInfoDao dao;

    public UserInfoClient(Database db) {
        setDao(db);
    }

    public void insert(String field, String value) {
        dao.insert(field, value);
    }

    public void update(String field, String value) {
        dao.update(field, value);
    }

    public void delete(String field, String value) {
        dao.delete(field, value);
    }

    private void setDao(Database db) {
        switch(db) {
            case MYSQL:
                this.dao = new MysqlDao();
                break;
            case ORACLE:
                this.dao = new OracleDao();
                break;
            case MSSQL:
                this.dao = new MssqlDao();
                break;
            default:
                this.dao = new MysqlDao();
                break;
        }
    }
}
