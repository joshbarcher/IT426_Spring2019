package fruit.model;

import fruit.observers.IObserver;
import fruit.observers.Observable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;

public class PersistFruit implements IObserver
{
    private FruitModel model;

    public PersistFruit(FruitModel model)
    {
        this.model = model;
    }

    @Override
    public void update(Observable observable, Object arguments)
    {
        FruitModel.Change change = (FruitModel.Change)arguments;

        if (change == FruitModel.Change.ADD ||
                change == FruitModel.Change.UPDATE ||
                change == FruitModel.Change.REMOVE)
        {
            try (PrintWriter writer = new PrintWriter(
                    new FileOutputStream("fruits.dat")))
            {
                List<Fruit> fruits = model.getFruits();
                for (int i = 0; i < fruits.size(); i++)
                {
                    writer.println(fruits.get(i));
                }
            }
            catch (FileNotFoundException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }
}
