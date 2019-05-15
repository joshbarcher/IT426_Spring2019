package fruit.controller;

import fruit.model.Fruit;
import fruit.model.FruitModel;
import fruit.model.PersistFruit;
import fruit.observers.IObserver;
import fruit.observers.Observable;
import fruit.view.FruitStandUI;

import java.util.List;
import java.util.UUID;

public class FruitController
{
    private FruitModel model;

    public FruitController(FruitStandUI view)
    {
        model = new FruitModel();
        model.addObserver(view);
        model.addObserver(new PersistFruit(model));
        model.addObserver(new IObserver()
        {
            @Override
            public void update(Observable observable, Object arguments)
            {
                System.out.println("A change was made to the fruit list");
            }
        });
    }

    public void addFruit(String type, String fresh)
    {
        model.addFruit(new Fruit(type, Boolean.parseBoolean(fresh)));
    }

    public void removeFruit(UUID id)
    {
        model.removeFruit(id);
    }

    public List<Fruit> getFruits()
    {
        return model.getFruits();
    }

    public void updateFruit(UUID id, String type, boolean fresh)
    {
        updateFruit(id, type, fresh);
    }
}
