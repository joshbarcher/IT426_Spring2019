package fruit.model;

import fruit.observers.Observable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class FruitModel extends Observable
{
    private List<Fruit> fruits;

    public FruitModel()
    {
        fruits = new ArrayList<>();
    }

    //CRUD ACCESS
    public void addFruit(Fruit fruit)
    {
        fruits.add(fruit);
        notifyObservers(Change.ADD);
    }

    public void removeFruit(UUID id)
    {
        for (int i = fruits.size() - 1; i >= 0; i--)
        {
            if (id.equals(fruits.get(i).getId()))
            {
                fruits.remove(i);
            }
        }
        notifyObservers(Change.REMOVE);
    }

    public List<Fruit> getFruits()
    {
        return Collections.unmodifiableList(fruits);
    }

    public void updateFruit(UUID id, String type, boolean fresh)
    {
        for (int i = 0; i < fruits.size(); i++)
        {
            Fruit check = fruits.get(i);
            if (id.equals(check.getId()))
            {
                check.setType(type);
                check.setFresh(fresh);
                break;
            }
        }
        notifyObservers(Change.UPDATE);
    }

    public enum Change
    {
        ADD,
        REMOVE,
        UPDATE,
        RETRIEVE
    }
}
