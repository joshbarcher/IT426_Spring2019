package primes;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;

import java.util.List;

public class TestPrimes
{
    public static void main(String[] args)
    {
        PrimeCalculator calculator = new PrimeCalculator(1, 200);

        //add listeners to our properties
        calculator.primesProperty().addListener((ListChangeListener<Integer>) change -> {
            List<? extends Integer> primes = change.getList();

            if (!primes.isEmpty())
            {
                System.out.println("Prime found: " + primes.get(primes.size() - 1));
            }
        });

        calculator.startProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("Start changed to: " + newValue.intValue());
        });

        calculator.endProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("End changed to: " + newValue.intValue());
        });

        calculator.calculate();

        //change our range and calculate again
        calculator.startProperty().set(1000);
        calculator.endProperty().set(1100);

        calculator.calculate();
    }
}
