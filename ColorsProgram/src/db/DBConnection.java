package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        //load the JDBC driver...
        Class.forName("org.sqlite.JDBC");

        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:ColorsDB.sqlite"))
        {
            System.out.println("Connected to sqlite db...!");
        }
        catch (SQLException ex)
        {
            System.out.println("Error connecting to sqlite db... " + ex.getMessage());
        }
    }
}
