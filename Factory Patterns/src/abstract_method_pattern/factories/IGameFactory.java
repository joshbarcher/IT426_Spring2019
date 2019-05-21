package abstract_method_pattern.factories;

import abstract_method_pattern.animals.IAnimals;
import abstract_method_pattern.characters.ICaretakers;

public interface IGameFactory
{
    public IAnimals animals();
    public ICaretakers caretakers();
}
