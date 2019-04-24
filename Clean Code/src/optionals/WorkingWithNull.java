package optionals;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Optional;

public class WorkingWithNull
{
    public static void main(String[] args)
    {
        String[] array = new String[] {"a", "b", "c", "d"};
        String search = "b";

        Optional<String> result = findOptionalElement(search, array);

        //print if we got something
        if (result.isPresent())
        {
            System.out.println(result.get());
        }

        System.out.println("Found something? " + !Optional.empty().equals(result));
        System.out.println("Give me something: " + result.orElse("nothing there..."));
    }

    private static Optional<String> findOptionalElement(String search, String[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].equals(search))
            {
                return Optional.of(array[i]);
            }
        }

        return Optional.empty();
    }

    private static void test1()
    {
        String[] array = new String[] {"a", "b", "c", "d"};
        String search = "e";
        if (containsElement(search, array))
        {
            String found = findElement(search, array);
        }
    }

    private static boolean containsElement(String search, String[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].equals(search))
            {
                return true;
            }
        }
        return false;
    }

    private static String findElement(String search, String[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].equals(search))
            {
                return array[i];
            }
        }
        throw new IllegalStateException();
    }
}
