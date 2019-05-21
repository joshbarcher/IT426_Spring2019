package abstract_method_pattern.factories;

import abstract_method_pattern.animals.IAnimals;
import abstract_method_pattern.animals.ZooAnimals;
import abstract_method_pattern.characters.ICaretakers;
import abstract_method_pattern.characters.ZooCaretakers;

public class ZooFactory implements IGameFactory
{
    @Override
    public IAnimals animals()
    {
        return new ZooAnimals();
    }

    @Override
    public ICaretakers caretakers()
    {
        return new ZooCaretakers();
    }
}
