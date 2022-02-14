package bean;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    private static Connection con;
    
    public static Connection getConnection(){
        try {
            
            // variable getconnection driver manager
            String connectionString = "jdbc:mysql://eu-cdbr-west-02.cleardb.net:3306/heroku_676772848eac03f";
            String dbUsername = "b988372d2e527a";
            String dbPassword = "a3bf6206";
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection(connectionString,dbUsername,dbPassword);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
    public boolean checkConnection(){
        try {
            
            // variable getconnection driver manager
            String connectionString = "jdbc:mysql://eu-cdbr-west-02.cleardb.net:3306";
            String dbUsername = "b988372d2e527a";
            String dbPassword = "a3bf6206";
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection(connectionString,dbUsername,dbPassword);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
