package db;

import javafx.scene.paint.Color;
import model.ColorPair;
import model.IColorsData;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBData implements IColorsData
{
    private Connection conn;

    public DBData()
    {
        try
        {
            //load the JDBC driver...
            Class.forName("org.sqlite.JDBC");

            conn = DriverManager.getConnection("jdbc:sqlite:ColorsDB.sqlite");
            System.out.println("Connected to the sqlite db...!");
        }
        catch (SQLException | ClassNotFoundException ex)
        {
            throw new IllegalStateException("Cannot connect to db... " + ex.getMessage());
        }
    }

    @Override
    public void addColor(String name, Color color) //CREATE
    {
        try
        {
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO colors VALUES (?, ?, ?, ?, ?)");

            stmt.setString(1, name);
            stmt.setDouble(2, color.getRed());
            stmt.setDouble(3, color.getGreen());
            stmt.setDouble(4, color.getBlue());
            stmt.setDouble(5, color.getOpacity());

            stmt.execute();
        }
        catch (SQLException ex)
        {
            throw new IllegalStateException("Error running INSERT command: " + ex.getMessage());
        }
    }

    @Override
    public List<ColorPair> getColors() //READ
    {
        List<ColorPair> pairs = new ArrayList<>();
        try
        {
            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT name, red, green, blue, opacity FROM colors");

            ResultSet results = stmt.executeQuery();
            while (results.next())
            {
                //read name from db...
                String name = results.getString("name");

                //read color from db...
                Color color = Color.color(
                        results.getDouble("red"),
                        results.getDouble("green"),
                        results.getDouble("blue"),
                        results.getDouble("opacity")
                );

                pairs.add(new ColorPair(name, color));
            }
        }
        catch (SQLException ex)
        {
            throw new IllegalStateException("Error running SELECT command: " + ex.getMessage());
        }

        return pairs;
    }

    @Override
    public void update(String name, Color color) //UPDATE
    {

    }

    @Override
    public void removeColor(String name) //DELETE
    {

    }
}
