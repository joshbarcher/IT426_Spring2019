package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExtractingExceptions
{
    public static void main(String[] args)
    {
        openFile("files/abc.txt", reader -> {
            while (reader.hasNextLine())
            {
                System.out.println(reader.nextLine().toUpperCase());
            }
        });
    }

    private static void openFile(String path, IFileReader fileReader)
    {
        //handle exceptions in here...
        try (Scanner reader = new Scanner(new FileInputStream(path)))
        {
            fileReader.readFile(reader);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Error reading from file: " + ex.getMessage());
        }
    }
}
