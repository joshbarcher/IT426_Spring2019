package observers;

import java.util.ArrayList;
import java.util.List;

//this class should track IObserver objects for the child class
public abstract class Observable
{
    private List<IObserver> observers;

    public Observable()
    {
        observers = new ArrayList<>();
    }

    public void addObserver(IObserver observer)
    {
        observers.add(observer);
    }

    public void notifyObservers()
    {
        notifyObservers(null);
    }

    public void notifyObservers(Object arguments)
    {
        for (IObserver observer : observers)
        {
            observer.update(this, arguments);
        }
    }
}
