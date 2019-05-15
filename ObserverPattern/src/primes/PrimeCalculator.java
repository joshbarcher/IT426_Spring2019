package primes;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PrimeCalculator
{
    //three observable properties
    private SimpleIntegerProperty start;
    private SimpleIntegerProperty end;
    private ObservableList<Integer> primes;

    public PrimeCalculator(int start, int end)
    {
        this.start = new SimpleIntegerProperty(start);
        this.end = new SimpleIntegerProperty(end);
        this.primes = FXCollections.observableArrayList();
    }

    //calculates and stores the primes between start and end
    public void calculate()
    {
        primes.clear();

        for (int i = start.get(); i <= end.get(); i++)
        {
            if (isPrime(i))
            {
                primes.add(i);
            }
        }
    }

    public SimpleIntegerProperty startProperty()
    {
        return start;
    }

    public SimpleIntegerProperty endProperty()
    {
        return end;
    }

    public ObservableList<Integer> primesProperty()
    {
        return primes;
    }

    private boolean isPrime(int number)
    {
        if (number <= 1)
        {
            return false;
        }
        else if (number == 2)
        {
            return true;
        }
        else if (number % 2 == 0)
        {
            return false;
        }

        int start = (int)Math.ceil(Math.sqrt(number));
        for (int i = start; i > 2; i--)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}