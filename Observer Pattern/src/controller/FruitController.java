package controller;

import model.Fruit;
import model.FruitModel;
import view.FruitStandUI;

import java.util.List;
import java.util.UUID;

public class FruitController
{
    private FruitModel model;

    public FruitController(FruitStandUI view)
    {
        model = new FruitModel();
        model.addObserver(view);
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
