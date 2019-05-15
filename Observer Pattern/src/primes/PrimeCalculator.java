package primes;

public class PrimeCalculator
{
    public PrimeCalculator(int start, int end)
    {

    }

    //calculates and stores the primes between start and end
    public void calculate()
    {

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