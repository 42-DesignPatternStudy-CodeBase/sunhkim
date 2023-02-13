package strategy.database;

public class StrategyTest {
    public static void main(String args[]) {
        UserInfoClient client = new UserInfoClient(Database.MYSQL);

        client.insert("userId", "12345");
        client.update("userId", "12345");
        client.delete("userId", "12345");
        
        UserInfoClient client2 = new UserInfoClient(Database.ORACLE);

        client2.insert("userId", "12345");
        client2.update("userId", "12345");
        client2.delete("userId", "12345");
        
        UserInfoClient client3 = new UserInfoClient(Database.MSSQL);

        client3.insert("userId", "12345");
        client3.update("userId", "12345");
        client3.delete("userId", "12345");
    }
}   
